package Enteprise_Project.UI_TableView;

import Enteprise_Project.EnterpriseApp;
import Enteprise_Project.Objects.Employee;
import Enteprise_Project.UI_AddDialog.NewEmployeeController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class TableViewController {
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private TableColumn<Employee, String> idNumberColumn;
    @FXML
    private TableColumn<Employee, String> fstNameColumn;
    @FXML
    private TableColumn<Employee, String> lstNameColumn;
    @FXML
    private TableColumn<Employee, String> departementColumn;
    @FXML
    private TableColumn<Employee, String> mailColumn;
    @FXML
    private Button addEmployeeButton;

    private boolean ok = false;
    @FXML
    private EnterpriseApp enterpriseApp;
    private NewEmployeeController newEmployeeController;

    /*
     * Default Constructor
    */
    public TableViewController(){

    }

     /*
      * Initialized when the fxml is loader and give the main Class access to itSelf
     */

    @FXML
    private void initialize() throws IOException {

        // We identify the column with the data which they will hold
        idNumberColumn.setCellValueFactory(cellData -> cellData.getValue().employeeIDProperty());
        fstNameColumn.setCellValueFactory(cellData -> cellData.getValue().employeeFstNameProperty());
        lstNameColumn.setCellValueFactory(cellData -> cellData.getValue().employeeLstNameProperty());
        departementColumn.setCellValueFactory(cellData -> cellData.getValue().employeeDepartementProperty());
        mailColumn.setCellValueFactory(cellData -> cellData.getValue().employeeMailProperty());


    }

    @FXML
    public void setEntrepriseApp(EnterpriseApp enterpriseApp){
        // We give the app a reference to itself
        this.enterpriseApp = enterpriseApp;

        // The tableview is used to store data about employees
        employeeTableView.setItems(enterpriseApp.getEmployees());
    }

    @FXML
    private void handleNewEmployee() throws IOException {
        Employee newEmployee = new Employee();
        enterpriseApp.ShowNewEmployeeDialog(newEmployee);
        enterpriseApp.getEmployees().add(newEmployee);


    }

    public Button getAddEmployeeButton() {
        return addEmployeeButton;
    }
}

package Enteprise_Project;

import Enteprise_Project.Objects.Employee;
import Enteprise_Project.UI_AddDialog.NewEmployeeController;
import Enteprise_Project.UI_Login.LoginController;
import Enteprise_Project.UI_TableView.TableViewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class EnterpriseApp extends Application {
    // The observable list that will hold the employees informations
    private ObservableList <Employee> employees = FXCollections.observableArrayList();

    public static void main(String [] args){
        Application.launch();
    }

    // Constructor for the tableView
    public EnterpriseApp() {
        employees.add(new Employee("#0142AB", "Abraham", "Mubanzo", "Electrical Engineering",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "ab.learn.code@gmail.com"));
        employees.add(new Employee("#0131LA", "Alexis", "Ndayikeza", "Electrical Engineering", null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "ndayalex2000@yahoo.fr"));
        employees.add(new Employee("#0103UI", "Bella", "Schastye","Electrical Engineering",null, "Bururi", "Burundi", "Not Married", "Catholic","0778541288", "bella.schastye@gmail.com"));
        employees.add(new Employee("#0154FK", "Gilles", "Lesventes","Electrical Management",null, "Bururi", "Burundi", "Not Married", "Muslim","0778541288", "gilles.leventes@gmail.com"));
        employees.add(new Employee("#0101QF", "Alexandre", "Termier","Electrical Management",null, "Bururi", "Burundi", "Married", "Protestant","0778541288","alexandre.termier@yahoo.fr"));
        employees.add(new Employee("#0199AF", "Olivier", "Ridoux","Electrical Systems",null, "Bururi", "Burundi", "Not Married", "Muslim","0778541288", "olivier.ridoux@gmail.com"));
        employees.add(new Employee("#0132NV", "Johanne", "Bezy", "Electrical Systems",null, "Bururi", "Burundi", "Married", "Christian","0778541288","johanne.bezy@gmail.com"));
        employees.add(new Employee("#0154VA", "Carles", "Lemarchand","Electrical Systems",null, "Bururi", "Burundi", "Not Married", "Catholic","0778541288", "carles.lemarchand@yahoo.fr"));
        employees.add(new Employee("#0191NJ", "Olivier", "Emile","Electrical Engineering",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "olivier.emile@gmail.com"));
        employees.add(new Employee("#0110LM", "Marco", "Romaneli","Electrical Engineering",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "marco.romaneli@gmail.com"));
        employees.add(new Employee("#0293DA", "Susane", "Dupont","Electrical Engineering",null, "Bururi", "Burundi", "Not Married", "Catholic","0778541288", "susanne.dupont@yahoo.fr"));
        employees.add(new Employee("#04IOAX", "Alexis", "Cadoret", "Electrical Management",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "alexis.cadoret@gmail.com"));
        employees.add(new Employee("#045NFQ", "Romain", "Gourion","Electrical Management",null, "Bururi", "Burundi", "Not Married", "Muslim","0778541288", "romain.gourion@gmail.com"));
        employees.add(new Employee("#0092RX", "Hugo", "Evola","Electrical Management",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "hugo.evola@yahoo.fr"));
        employees.add(new Employee("#0942NF", "Hugues Vincent", "Ropert","Electrical Management",null, "Bururi", "Burundi", "Married", "Muslim","0778541288","vincent.ropert@gmail.com"));
        employees.add(new Employee("#03RA3N", "Mahmoud", "Jammal", "Electrical Systems",null, "Bururi", "Burundi", "Married", "Muslim","0778541288","mahmoud.jammal@gmail.com"));
        employees.add(new Employee("#08O4SX", "Sally", "Debray","Electrical Systems",null, "Bururi", "Burundi", "Not Married", "Catholic","0778541288", "sally.debray2000@yahoo.fr"));
        employees.add(new Employee("#0719NX", "Rolex", "Patek", "Electrical Systems",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "rolex.patek@gmail.com"));
        employees.add(new Employee("#04IOAX", "Alexis", "Cadoret", "Electrical Management",null, "Bururi", "Burundi", "Married", "None","0778541288", "alexis.cadoret@gmail.com"));
        employees.add(new Employee("#045NFQ", "Romain", "Gourion","Electrical Management",null, "Bururi", "Burundi", "Not Married", "None","0778541288", "romain.gourion@gmail.com"));
        employees.add(new Employee("#0092RX", "Hugo", "Evola","Electrical Management",null, "Bururi", "Burundi", "Married", "None","0778541288", "hugo.evola@yahoo.fr"));
        employees.add(new Employee("#0942NF", "Hugues Vincent", "Ropert","Electrical Management",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "vincent.ropert@gmail.com"));
        employees.add(new Employee("#03RA3N", "Mahmoud", "Jammal", "Electrical Systems",null, "Bururi", "Burundi", "Married", "Catholic","0778541288", "mahmoud.jammal@gmail.com"));
        employees.add(new Employee("#08O4SX", "Sally", "Debray","Electrical Systems",null, "Bururi", "Burundi", "Married", "Christian","0778541288", "sally.debray2000@yahoo.fr"));
        employees.add(new Employee("#0719NX", "Rolex", "Patek", "Electrical Systems",null, "Bururi", "Burundi", "Married", "None","0778541288", "rolex.patek@gmail.com"));
    }

    /*
    * The view method
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        uiLogin();
    }

    /*
    * Initializes the login screen
     */
    private void uiLogin() throws IOException {
        // Loads the Authentificaition fxml file
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(EnterpriseApp.class.getResource("UI_Login/LoginAuthentification.fxml"));
        BorderPane loginPane = loader.load();

        // Creation of a Stage
        Stage logStage = new Stage();
        //logStage.initStyle(StageStyle.UNDECORATED);
        logStage.setTitle("Login");
        Scene loginScene = new Scene(loginPane);
        logStage.setScene(loginScene);

        //Give the controller access to the entreprise App
        LoginController loginController = loader.getController();
        loginController.setLoginStage(logStage);

        logStage.show();

    }

    /*
    * Loads the employeeTable View
     */

    public void showEmployeesTableView() throws IOException {
        // Shows the employees overview
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(EnterpriseApp.class.getResource("UI_TableView/EmployeesOverView.fxml"));
        BorderPane ui_tableView = loader.load();

        // The second Stage
        Stage mainStage = new Stage();
        mainStage.setResizable(false);
        mainStage.setTitle("Departments and Employees");
        Scene mainScene = new Scene(ui_tableView, 1280, 750);


        // Give the controller access to the enterpriseApp
        TableViewController tableViewController = loader.getController();
        tableViewController.setEntrepriseApp(this);

        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public void ShowNewEmployeeDialog(Employee employee) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(EnterpriseApp.class.getResource("UI_AddDialog/AddEmployeeDialog.fxml"));
        BorderPane addDialog = loader.load();

        Stage dialogStage = new Stage();
        dialogStage.setResizable(false);
        dialogStage.setTitle("Add Employee");
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        Scene add = new Scene(addDialog);
        dialogStage.setScene(add);

        // Set the employee into the controller
        NewEmployeeController employeeController = loader.getController();
        employeeController.setDialogStage(dialogStage);
        employeeController.setEmployee(employee);
        dialogStage.showAndWait();
    }


    public ObservableList<Employee> getEmployees() {
        return employees;
    }

}

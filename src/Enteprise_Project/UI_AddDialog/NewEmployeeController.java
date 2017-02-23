package Enteprise_Project.UI_AddDialog;

import Enteprise_Project.EnterpriseApp;
import Enteprise_Project.Objects.Employee;
import Enteprise_Project.UI_ErrorDialog.ErrorDialogController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class NewEmployeeController {
    private Stage errorStage = new Stage();
    @FXML
    private TextField employeeFstName;
    @FXML
    private TextField employeeLstName;
    @FXML
    private TextField employeeMail;
    @FXML
    private Button employeeIdNumber;
    @FXML
    private DatePicker employeeBirthDay;
    @FXML
    private TextField employeeBirthCity;
    @FXML
    private TextField employeeBirthCountry;
    @FXML
    private TextField employeeDepartement;
    @FXML
    private ComboBox<String> employeeMarritalStatus;
    @FXML
    private Button registerButton;
    @FXML
    private Button cancelButton;
    private List idCharacters = new ArrayList<String>();
    private String characters = "A1B2C3D4E5F6G7H8I9J0K0L1M2N3O4P5Q6R7S8T9UVWXYZ";


    private Stage dialogStage;
    private Employee employee;
    private ErrorDialogController errorDialogController;

    /*
     * Default Constructor
    */
    public NewEmployeeController(){

    }

    @FXML
    private void initialize() throws IOException {

    }

    @FXML
    private String buttonContent(Button button) throws IOException{
        return button.getText();
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    @FXML
    private boolean areTextFieldsEmpty()

    {
        return
                !employeeFstName.getText().isEmpty()
                && !employeeLstName.getText().isEmpty()
                && !employeeBirthCity.getText().isEmpty()
                && !employeeBirthCity.getText().isEmpty()
                && !employeeBirthCountry.getText().isEmpty()
                && !employeeMail.getText().isEmpty()
                && !employeeIdNumber.getText().isEmpty();
    }


    private String setIdNumber() throws IOException {
        String result = "";
        for(int i = 0; i < 24; i++) {
            idCharacters.add(characters.charAt(i));
        }
        Collections.shuffle(idCharacters);

        for(int i = 0; i < 3; i++) {
            result = result + idCharacters.get(i);
        }

        return result;
    }


    private void setEssentialFields() throws IOException {
        employeeFstName.setPromptText("First Name Required!");
        employeeLstName.setPromptText("Last Name Required!");
        employeeMail.setPromptText("Email Required!");
        employeeBirthCity.setPromptText("City Required!");
        employeeBirthCountry.setPromptText("Country Required!");
        employeeDepartement.setPromptText("Departement Required!");
        employeeIdNumber.setText("Generate ID");
    }

    @FXML
    private void handleRegister() throws IOException {
        if(areTextFieldsEmpty() && !Objects.equals(buttonContent(employeeIdNumber), "Generate ID")){
            employee.setEmployeeFstName(employeeFstName.getText());
            employee.setEmployeeLstName(employeeLstName.getText());
            employee.setEmployeeDepartement(employeeDepartement.getText());
            employee.setEmployeeBirthCity(employeeBirthCity.getText());
            employee.setEmployeeBirthCountry(employeeBirthCountry.getText());
            employee.setEmployeeMail(employeeMail.getText());
            employee.setEmployeeID(employeeIdNumber.getText());
            setCancel();
        }else{
            setEssentialFields();
            showErrorDialog();
        }
    }


    @FXML
    private void setIdNumberButton() throws IOException {
        employeeIdNumber.setText("#" + setIdNumber() + setIdNumber() + setIdNumber());
        employeeIdNumber.setDisable(true);
    }


    public void setCancel() throws IOException {
        dialogStage.close();
    }


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    private void showErrorDialog() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(EnterpriseApp.class.getResource("UI_ErrorDialog/ErrorDialog.fxml"));
        BorderPane errorDialog = loader.load();

        errorStage.setTitle("Alert");
        errorStage.setResizable(false);
        Scene errorScene = new Scene(errorDialog);
        errorStage.setScene(errorScene);

        ErrorDialogController errorDialogController = loader.getController();
        errorDialogController.setErrorDialogStage(errorStage);

        errorStage.showAndWait();

    }
}

package Enteprise_Project.UI_ErrorDialog;

import Enteprise_Project.Objects.Employee;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ErrorDialogController {
    @FXML
    private Button okButton;

    private Stage errorDialogStage;
    private Employee employee;

    public ErrorDialogController(){

    }

    @FXML
    private void initialize() throws IOException {

    }

    @FXML
    private void setCloseErrorDialog() throws IOException {
        errorDialogStage.close();
    }

    public void setErrorDialogStage(Stage errorDialogStage) {
        this.errorDialogStage = errorDialogStage;
    }

    public Stage getErrorDialogStage() {
        return errorDialogStage;
    }


}

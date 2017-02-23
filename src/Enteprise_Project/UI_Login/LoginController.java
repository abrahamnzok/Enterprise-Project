package Enteprise_Project.UI_Login;

import Enteprise_Project.EnterpriseApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usrName;
    @FXML
    private TextField usrPassword;
    @FXML
    private Button loginButton;
    @FXML
    private EnterpriseApp enterpriseApp = new EnterpriseApp();

    private Stage loginStage;

    @FXML
    private void showTable() throws IOException {
        enterpriseApp.showEmployeesTableView();
    }

    public Stage getLoginStage() {
        return loginStage;
    }

    public void setLoginStage(Stage loginStage) {
        this.loginStage = loginStage;
    }
}

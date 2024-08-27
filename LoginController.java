import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField PASSF;

    @FXML
    private TextField UNAME;

    @FXML
    void LoginHandler(ActionEvent event) {
        String username = UNAME.getText();
        String password = PASSF.getText();
        if( username.equals("aryan") && password.equals("password"))
        {
            Parent root1;
            try {
                root1 = FXMLLoader.load(getClass().getResource("Win2.fxml"));
                Stage stage1 = new Stage();
                stage1.setTitle("DashBoard");
                stage1.setScene(new Scene(root1));
                stage1.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
           
        }
        else 
        {
            Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Failed");
                alert.setHeaderText("Invalid username or password");
                alert.setContentText("Please try again.");
                alert.showAndWait();
        }

    }

}

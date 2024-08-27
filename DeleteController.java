import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class DeleteController {

    @FXML
    private TextField TF;

    @FXML
    private Button Confirm;

    @FXML
    private Button Cancel;

    @FXML
    void HandleCancel(ActionEvent event) {
        Stage stage = (Stage) Cancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void HandleConfirm(ActionEvent event) {
        String name = TF.getText();
        int count =0;
        for (int i = 0; i < BudgetTracker.budgetItems.size(); i++) {
            if(name.equals(BudgetTracker.budgetItems.get(i).getName())){
                BudgetTracker.budgetItems.remove(i);
                count++;
                System.out.println("The item is successfully deleted");
                Stage stage = (Stage) Confirm.getScene().getWindow();
                stage.close();
                
            }
        }
        if(count ==0){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Item not found");
        alert.setHeaderText("Cannot find the item with the given name");
        alert.show();
        }
    }

}

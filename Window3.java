import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Window3 {

    @FXML
    public TextField Amountit;

    @FXML
    public RadioButton Expense;

    @FXML
    public RadioButton Income;

    @FXML
    public TextField Nameit;

    @FXML
    public Button Submit;
    
    @FXML
    void ConfirmAdd(ActionEvent event) {
        BudgetTracker i = new BudgetTracker();
       try{
        i.setAmount(Double.parseDouble(Amountit.getText()));
        i.setName(Nameit.getText());
        if(Income.isSelected()==true)
        {
            i.setType("Income");
        }
        else 
        {
            i.setType("Expense");
        }
        
        BudgetTracker.budgetItems.add(i);
        Stage stage = (Stage) Submit.getScene().getWindow();
        stage.close();
    }
    catch(Exception e )
    {
        Alert alert = new Alert(AlertType.ERROR);
        alert.close();
       
    }
        
    }

}





   
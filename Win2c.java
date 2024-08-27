import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Win2c {

    @FXML
    private Button Add;

    @FXML
    private Button DELETE;

    @FXML
    private Button REPORT;

    @FXML
    void add(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("Window3.fxml"));
        Stage stage1 = new Stage();
        stage1.setTitle("DashBoard");
        stage1.setScene(new Scene(root1));
        stage1.show();

    }
    @FXML
    void del(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("Delete.fxml"));
        Stage stage1 = new Stage();
        stage1.setTitle("Delete Items");
        stage1.setScene(new Scene(root1));
        stage1.show();
       
    }
    @FXML
    void report(ActionEvent event) throws IOException {
        BudgetTracker i2 = new BudgetTracker();
        i2.genReport();

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("File.txt")));
        pw.println("YOU ARE CURRENTLY LOGED IN AS:   ARYAN(ADMIN) ");
        pw.println("  ");
        Date currentDate = new Date();
        BudgetTracker t = new BudgetTracker();
        pw.println("CURRENT DATE AND TIME WHEN FILE IS CREATED: "+currentDate);
        pw.println("   ");
        pw.println("SUMMARY AFTER ADDING ALL ITEMS");
        pw.println("YOUR TOTAL BALANCE:  "+t.calculateBalance());
        pw.println("YOUR TOTAL EXPENSE:  "+t.calculateTotalExpenses());
        pw.println("YOUR TOTAL INCOME:   "+t.calculateTotalIncome());
        System.out.println("FILE IS SUCCESFULLY CREATED AND DATA HAS BEEN ADDED");
        pw.close();
 
        
    }

}


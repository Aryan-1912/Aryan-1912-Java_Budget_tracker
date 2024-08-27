import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

  

public class Test extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        
       Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
       Scene scene = new Scene(root);
       primaryStage.setTitle("Login page");
       primaryStage.setScene(scene);
       primaryStage.show();
       
    }
    public static void main(String[] args) throws IOException 
    {
        launch(args);


        
    }
}
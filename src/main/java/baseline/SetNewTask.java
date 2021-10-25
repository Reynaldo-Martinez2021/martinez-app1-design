package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class SetNewTask {
    //this function is called from the taskViewController
    //the purpose of this class will be to set the stage for the new task
    //create a function to set up the stage
    public void start(javafx.event.ActionEvent event) {
        //create a parent root
        try {
            Parent newRoot = FXMLLoader.load(getClass().getResource("NewTask.fxml"));
            Scene scene = new Scene(newRoot);
            Stage newTask = (Stage) ((Node) event.getSource()).getScene().getWindow();
            newTask.setScene(scene);
            newTask.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

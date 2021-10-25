package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws Exception{
        //create a parent root
        Parent root = FXMLLoader.load(getClass().getResource("TasksView.fxml"));
        //attach scene graph to scene
        Scene scene = new Scene(root);
        //display in window's title bar
        stage.setTitle("My ToDoList");
        //attach scene to stage
        stage.setScene(scene);
        //display the stage
        stage.show();
    }

    public static void main(String[] args){
        //create an object and call its start method
        launch(args);
    }
}

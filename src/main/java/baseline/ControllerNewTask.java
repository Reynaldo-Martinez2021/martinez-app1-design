package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerNewTask {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="newTaskDescription"
    private TextField newTaskDescription; // Value injected by FXMLLoader

    @FXML // fx:id="newTaskDueDate"
    private DatePicker newTaskDueDate; // Value injected by FXMLLoader

    @FXML // fx:id="newTaskTitle"
    private TextField newTaskTitle; // Value injected by FXMLLoader

    @FXML // fx:id="newTaskPriority"
    private TextField newTaskPriority; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskSave"
    private Button editTaskSave; // Value injected by FXMLLoader

    @FXML // fx:id="newTaskTable"
    private TableView<?> newTaskTable; // Value injected by FXMLLoader

    @FXML // fx:id="newTaskToDo"
    private TextField newTaskToDo; // Value injected by FXMLLoader

    @FXML
    public void SetEditItem(MouseEvent event) {
        //call the EditItem class for further processing
    }

    @FXML
    public void SaveTask(MouseEvent event) {
        //call the SaveTask class for further processing
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert newTaskDescription != null : "fx:id=\"newTaskDescription\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert newTaskDueDate != null : "fx:id=\"newTaskDueDate\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert newTaskTitle != null : "fx:id=\"newTaskTitle\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert newTaskPriority != null : "fx:id=\"newTaskPriority\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert editTaskSave != null : "fx:id=\"editTaskSave\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert newTaskTable != null : "fx:id=\"newTaskTable\" was not injected: check your FXML file 'NewTask.fxml'.";
        assert newTaskToDo != null : "fx:id=\"newTaskToDo\" was not injected: check your FXML file 'NewTask.fxml'.";

    }
}



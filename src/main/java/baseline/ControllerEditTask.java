package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerEditTask {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="editTaskDescription"
    private TextField editTaskDescription; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskDueDate"
    private DatePicker editTaskDueDate; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskTitle"
    private TextField editTaskTitle; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskPriority"
    private TextField editTaskPriority; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskSave"
    private Button editTaskSave; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskTable"
    private TableView<?> editTaskTable; // Value injected by FXMLLoader

    @FXML // fx:id="editTaskToDo"
    private TextField editTaskToDo; // Value injected by FXMLLoader

    @FXML
    public void SetEditItem(MouseEvent event) {
        //call the EditItem class for further processing
    }

    @FXML
    public void SaveTask(MouseEvent event) {
        //call the saveTask for further processing
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    public void initialize() {
        assert editTaskDescription != null : "fx:id=\"editTaskDescription\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskDueDate != null : "fx:id=\"editTaskDueDate\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskTitle != null : "fx:id=\"editTaskTitle\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskPriority != null : "fx:id=\"editTaskPriority\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskSave != null : "fx:id=\"editTaskSave\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskTable != null : "fx:id=\"editTaskTable\" was not injected: check your FXML file 'EditTask.fxml'.";
        assert editTaskToDo != null : "fx:id=\"editTaskToDo\" was not injected: check your FXML file 'EditTask.fxml'.";

    }
}

package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class ControllerTaskView {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="menuFile"
    private Menu menuFile; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemNew"
    private MenuItem menuItemNew; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemOpen"
    private MenuItem menuItemOpen; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemOpenRecent"
    private Menu menuItemOpenRecent; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemClose"
    private MenuItem menuItemClose; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemSave"
    private MenuItem menuItemSave; // Value injected by FXMLLoader

    @FXML // fx:id="menuItemSaveAs"
    private MenuItem menuItemSaveAs; // Value injected by FXMLLoader

    @FXML // fx:id="menuEdit"
    private Menu menuEdit; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditUndo"
    private MenuItem menuEditUndo; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditRedo"
    private MenuItem menuEditRedo; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditCut"
    private MenuItem menuEditCut; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditCopy"
    private MenuItem menuEditCopy; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditPaste"
    private MenuItem menuEditPaste; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditDelete"
    private MenuItem menuEditDelete; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditSelectAll"
    private MenuItem menuEditSelectAll; // Value injected by FXMLLoader

    @FXML // fx:id="menuEditUnselectAll"
    private MenuItem menuEditUnselectAll; // Value injected by FXMLLoader

    @FXML // fx:id="menuHelp"
    private Menu menuHelp; // Value injected by FXMLLoader

    @FXML // fx:id="menuHelpAbout"
    private MenuItem menuHelpAbout; // Value injected by FXMLLoader

    @FXML // fx:id="addTaskButton"
    private Button addTaskButton; // Value injected by FXMLLoader

    @FXML // fx:id="taskTableView"
    private TableView<?> taskTableView; // Value injected by FXMLLoader

    @FXML // fx:id="taskViewTaskTitle"
    private TableColumn<?, ?> taskViewTaskTitle; // Value injected by FXMLLoader

    @FXML // fx:id="taskViewTaskDescription"
    private TableColumn<?, ?> taskViewTaskDescription; // Value injected by FXMLLoader

    @FXML // fx:id="taskViewPriority"
    private TableColumn<?, ?> taskViewPriority; // Value injected by FXMLLoader

    @FXML // fx:id="taskViewDueDate"
    private TableColumn<?, ?> taskViewDueDate; // Value injected by FXMLLoader

    @FXML // fx:id="taskViewCompleted"
    private TableColumn<?, ?> taskViewCompleted; // Value injected by FXMLLoader

    @FXML
    void SetEditTask(MouseEvent event) {
        //call the SetEditTask for further processing
    }

    @FXML
    void SetNewTask(MouseEvent event) {
        //call the SetNewTask for further processing

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert menuFile != null : "fx:id=\"menuFile\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemNew != null : "fx:id=\"menuItemNew\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemOpen != null : "fx:id=\"menuItemOpen\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemOpenRecent != null : "fx:id=\"menuItemOpenRecent\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemClose != null : "fx:id=\"menuItemClose\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemSave != null : "fx:id=\"menuItemSave\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuItemSaveAs != null : "fx:id=\"menuItemSaveAs\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEdit != null : "fx:id=\"menuEdit\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditUndo != null : "fx:id=\"menuEditUndo\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditRedo != null : "fx:id=\"menuEditRedo\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditCut != null : "fx:id=\"menuEditCut\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditCopy != null : "fx:id=\"menuEditCopy\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditPaste != null : "fx:id=\"menuEditPaste\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditDelete != null : "fx:id=\"menuEditDelete\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditSelectAll != null : "fx:id=\"menuEditSelectAll\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuEditUnselectAll != null : "fx:id=\"menuEditUnselectAll\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuHelp != null : "fx:id=\"menuHelp\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert menuHelpAbout != null : "fx:id=\"menuHelpAbout\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert addTaskButton != null : "fx:id=\"addTaskButton\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskTableView != null : "fx:id=\"taskTableView\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskViewTaskTitle != null : "fx:id=\"taskViewTaskTitle\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskViewTaskDescription != null : "fx:id=\"taskViewTaskDescription\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskViewPriority != null : "fx:id=\"taskViewPriority\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskViewDueDate != null : "fx:id=\"taskViewDueDate\" was not injected: check your FXML file 'TasksView.fxml'.";
        assert taskViewCompleted != null : "fx:id=\"taskViewCompleted\" was not injected: check your FXML file 'TasksView.fxml'.";

    }
}

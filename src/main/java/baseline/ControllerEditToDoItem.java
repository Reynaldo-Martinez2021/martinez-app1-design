package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class ControllerEditToDoItem {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="editToDoItem"
    private TextArea editToDoItem; // Value injected by FXMLLoader

    @FXML
    public void SaveToDoEdit(MouseEvent event) {
        //call the saveToDoEdit class for further processing
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    public void initialize() {
        assert editToDoItem != null : "fx:id=\"editToDoItem\" was not injected: check your FXML file 'Untitled'.";

    }
}

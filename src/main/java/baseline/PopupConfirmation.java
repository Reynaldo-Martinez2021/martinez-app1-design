package baseline;

public class PopupConfirmation {
    //create a custom handler on the window event, so we can handle the request
    //create the function handle
    public void handle(){
        //run the confirm exit method and consume the event if the user clicks No, otherwise exit
        //if statement with confirmExit result
            //call the saveTask function to return any changes to taskView
        //else consume the event. This prevents window from closing
    }

    //create a function to handle the confirmExit
    public boolean confirmExit(){
        //get confirmation you want to exit
        //set a title
        //use the getButtonsTypes
        //add the buttonType.yes and buttonType.no
        //get the result of the alert(which button was selected)
        //return true if the user clicked yes, false if they clicked now or closed the alert
        return false;
    }
}

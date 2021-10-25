package baseline;

import java.util.List;

public class ToDoItem {
    //the string will hold the current toDoItem
    private String toDoItem;

    //create a list to hold all toDoItems
    private List<String> toDoItemList;

    public List<String> getToDoItemList() {
        return toDoItemList;
    }

    public String getToDoItem() {
        return toDoItem;
    }

    public void setToDoItem(String toDoItem) {
        this.toDoItem = toDoItem;
    }

    //create a function to updateList
    public void updateList(String string){
        //this function will only update the list for a specific task
    }
}

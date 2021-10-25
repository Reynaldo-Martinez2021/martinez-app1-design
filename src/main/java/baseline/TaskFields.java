package baseline;

import java.util.Date;

public class TaskFields {

    private String taskTitle;
    private String taskPriority;
    private Date taskDueDate;
    private String taskDescription;

    public String getTaskTitle() {
        return taskTitle;
    }

    //the task title can not be less than 3 characters
    //create a popup to notify the user if the title is less than 3
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Date getTaskDueDate() {
        return taskDueDate;
    }

    //task due date must be in the format YYYY-MM-DD
    public void setTaskDueDate(Date taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}

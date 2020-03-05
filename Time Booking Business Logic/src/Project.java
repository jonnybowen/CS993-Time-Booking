import java.util.ArrayList;

public class Project {
    private ArrayList<Task> taskList;
    private String description;
    private int projectNumber;
    private ArrayList<Booking> logs;

    public Project()
    {
        taskList = new ArrayList<Task>();
        description = "";
        projectNumber = 0;
        logs = new ArrayList<Booking>();
    }

    public Project(ArrayList<Task> taskList,String description,int projectNumber,ArrayList<Booking> logs)
    {
        this.taskList = taskList;
        this.description = description;
        this.projectNumber = projectNumber;
        this.logs = logs;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public String getDescription() {
        return description;
    }

    public int getProjectNumber() {
        return projectNumber;
    }

    public ArrayList<Booking> getLogs() {
        return logs;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public void setLogs(ArrayList<Booking> logs) {
        this.logs = logs;
    }
}

import java.util.ArrayList;

public class Task {
    private ArrayList<User> assignedUsers;
    private String description;
    private int taskCode;
    private ArrayList<Booking> logs;

    public Task()
    {
        assignedUsers = new ArrayList<User>();
        description = "";
        taskCode = 0;
        logs = new ArrayList<Booking>();
    }

    public Task(ArrayList<User> assignedUsers,String description,int taskCode,ArrayList<Booking> logs)
    {
        this.assignedUsers = assignedUsers;
        this.description = description;
        this.taskCode = taskCode;
        this.logs = logs;
    }

    public ArrayList<User> getAssignedUsers() {
        return assignedUsers;
    }

    public String getDescription() {
        return description;
    }

    public int getTaskCode() {
        return taskCode;
    }

    public ArrayList<Booking> getLogs() {
        return logs;
    }

    public void setAssignedUsers(ArrayList<User> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTaskCode(int taskCode) {
        this.taskCode = taskCode;
    }

    public void setLogs(ArrayList<Booking> logs) {
        this.logs = logs;
    }
}

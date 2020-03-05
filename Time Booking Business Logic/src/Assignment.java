import java.util.ArrayList;

public class Assignment {
    private Project project;
    private ArrayList<Task> tasks;

    public Assignment()
    {
        project = new Project();
        tasks = new ArrayList<Task>();
    }

    public Assignment(Project project,ArrayList<Task> taskList)
    {
        this.project = project;
        this.tasks = taskList;
    }

    public Project getProject() {
        return project;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setAssignedProject(Project project) {
        this.project = project;
    }

    public void setAssignedTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}

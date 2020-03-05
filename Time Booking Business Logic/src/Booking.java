import java.time.LocalDateTime;

public class Booking {
    private Project project;
    private Task task;
    private BookTime start;
    private BookTime finish;
    private LocalDateTime timeStamp;
    private Actor booker;
    private String description;

    public Booking()
    {
        project = new Project();
        task = new Task();
        start = new BookTime();
        finish = new BookTime();
        timeStamp = LocalDateTime.now();
        booker = new Actor();
        description = "";
    }

    public Booking(Project project,Task task,BookTime start,BookTime finish,LocalDateTime timeStamp,Actor booker,String description)
    {
        this.project = project;
        this.task = task;
        this.start = start;
        this.finish = finish;
        this.timeStamp = timeStamp;
        this.booker = booker;
        this.description = description;
    }

    public Project getProject() {
        return project;
    }

    public Task getTask() {
        return task;
    }

    public BookTime getStart() {
        return start;
    }

    public BookTime getFinish() {
        return finish;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public Actor getBooker() {
        return booker;
    }

    public String getDescription() {
        return description;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setStart(BookTime start) {
        this.start = start;
    }

    public void setFinish(BookTime finish) {
        this.finish = finish;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setBooker(Actor booker) {
        this.booker = booker;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

import java.util.ArrayList;

public class User extends Actor {
    private ArrayList<Assignment> assignments;

    public User()
    {
        super();
        assignments = new ArrayList<Assignment>();
    }

    public User(int staffNo,String firstName,String secondName,String userName,String password, String email)
    {
        super(staffNo,firstName,secondName,userName,password,email);
        assignments = new ArrayList<Assignment>();
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
}

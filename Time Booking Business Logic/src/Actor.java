import java.time.LocalDateTime;
import java.util.ArrayList;

public class Actor {
    private int staffNo;
    private String firstName;
    private String secondName;
    private String userName;
    private String password;
    private String email;
    private ArrayList<Booking> bookings;

    public Actor()
    {
        staffNo = 0;
        firstName = "";
        secondName = "";
        userName = "";
        password = "";
        email = "";
        bookings = new ArrayList<Booking>();
    }

    public Actor(int staffNo,String firstName,String secondName,String userName,String password, String email)
    {
        this.staffNo = staffNo;
        this.firstName = firstName;
        this.secondName = secondName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.bookings = new ArrayList<Booking>()
        ;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public void login()
    {}

    public Booking bookTime(Project project,Task task,BookTime start,BookTime finish,String description)
    {
        Booking thisBooking = new Booking(project,task,start,finish, LocalDateTime.now(),this,description);
        return thisBooking;
    }

    public void recoverAccount()
    {}
}

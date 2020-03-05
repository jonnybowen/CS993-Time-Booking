import java.time.LocalDate;

public class BookTime {
    private LocalDate date;
    private double hour;

    public BookTime()
    {
        date = LocalDate.now();
        hour = 0;
    }

    public BookTime(LocalDate date,double hour)
    {
        this.date = date;
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getHour() {
        return hour;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }
}

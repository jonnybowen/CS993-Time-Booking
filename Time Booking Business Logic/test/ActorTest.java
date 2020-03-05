import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {
    @Test
    void bookTime() {
        Actor myActor = new Actor();
        Project myProject = new Project();
        Task myTask = new Task();
        BookTime myStartTime = new BookTime();
        BookTime myFinishTime = new BookTime();
        LocalDateTime myTimeStamp = LocalDateTime.now();
        String myDescription = "description";

        Booking myBooking = myActor.bookTime(myProject,myTask,myStartTime,myFinishTime,myDescription);

        assertEquals(myProject,myBooking.getProject());
        assertEquals(myTask,myBooking.getTask());
        assertEquals(myStartTime,myBooking.getStart());
        assertEquals(myFinishTime,myBooking.getFinish());
        assertEquals(myTimeStamp.truncatedTo(ChronoUnit.SECONDS),myBooking.getTimeStamp().truncatedTo(ChronoUnit.SECONDS));
        assertEquals(myActor,myBooking.getBooker());
        assertEquals(myDescription,myBooking.getDescription());
    }
}
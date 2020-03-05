import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    void createActor() {
        Admin myAdmin = new Admin();
        Actor myNewActor = myAdmin.createActor("Admin");

        assertTrue(myNewActor instanceof Admin);
        assertFalse(myNewActor instanceof User);
        assertFalse(myNewActor == null);

        myNewActor = myAdmin.createActor("User");

        assertFalse(myNewActor instanceof Admin);
        assertTrue(myNewActor instanceof User);
        assertFalse(myNewActor == null);

        myNewActor = myAdmin.createActor("invalid string");

        assertFalse(myNewActor instanceof Admin);
        assertFalse(myNewActor instanceof User);
        assertTrue(myNewActor == null);
    }
}
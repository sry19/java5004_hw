package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {

    Owner aOwner;

    @Before
    public void setUp() throws Exception {
        aOwner = new Owner("Amy", "Brown", "35895688r8688");
    }

    @Test
    public void isValidPhoneNum() {
        assertEquals("35895688r8",aOwner.getPhoneNum());
    }

    @Test
    public void getFirstName() {
        assertEquals("Amy",aOwner.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Brown",aOwner.getLastName());
    }

    @Test
    public void getPhoneNum() {
        assertEquals("35895688r8",aOwner.getPhoneNum());
    }
}
package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {

    Owner aOwner;
    Owner bOwner;
    Owner cOwner;

    @Before
    public void setUp() throws Exception {
        aOwner = new Owner("Amy", "Brown", "35895688r8688");
        bOwner = new Owner("Emma","White","356");
        cOwner = new Owner("Mark","Smith","3563456789");
    }

    @Test
    public void isValidPhoneNum() {
        assertEquals("35895688r8",aOwner.getPhoneNum());
        assertEquals("0000000356",bOwner.getPhoneNum());
        assertEquals("3563456789",cOwner.getPhoneNum());
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
        assertEquals("0000000356",bOwner.getPhoneNum());
        assertEquals("35895688r8",aOwner.getPhoneNum());
        assertEquals("3563456789",cOwner.getPhoneNum());
    }
}
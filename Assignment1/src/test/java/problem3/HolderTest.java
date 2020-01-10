package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HolderTest {

    Holder holder;

    @Before
    public void setUp() throws Exception {
        holder = new Holder("Amy", "Brown");
    }

    @Test
    public void getFirstName() {
        assertEquals("Amy", holder.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Brown",holder.getLastName());
    }
}
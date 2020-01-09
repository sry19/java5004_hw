package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    Time myTime;

    @Before
    public void setUp() throws Exception {
        myTime = new Time(34, 40,100);
    }

    @Test
    public void getHours() {
        assertEquals((Integer) 0, myTime.getHours());
    }

    @Test
    public void getMinutes() {
        assertEquals((Integer) 40, myTime.getMinutes());
    }

    @Test
    public void getSeconds() {
        assertEquals((Integer) 0, myTime.getSeconds());
    }
}
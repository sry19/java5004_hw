package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    Time myTime;
    Time yourTime;

    @Before
    public void setUp() throws Exception {
        myTime = new Time(34, 40,100);
        yourTime = new Time(22,69,50);
    }

    @Test
    public void getHours() {
        assertEquals((Integer) 0, myTime.getHours());
        assertEquals((Integer) 22, yourTime.getHours());
    }

    @Test
    public void getMinutes() {
        assertEquals((Integer) 40, myTime.getMinutes());
        assertEquals((Integer) 0, yourTime.getMinutes());
    }

    @Test
    public void getSeconds() {
        assertEquals((Integer) 0, myTime.getSeconds());
        assertEquals((Integer) 50, yourTime.getSeconds());
    }
}
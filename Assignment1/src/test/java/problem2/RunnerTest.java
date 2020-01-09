package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    Runner runner;
    Time startTime;
    Time endTime;

    @Before
    public void setUp() throws Exception {
        startTime = new Time(14,47,57);
        endTime = new Time(24,30,24);
        runner = new Runner("Amy", "GoHusky", startTime, endTime);
    }

    @Test
    public void getDuration() {
        assertEquals((Integer) 27, runner.getDuration().getSeconds());
        assertEquals((Integer) 42, runner.getDuration().getMinutes());
        assertEquals((Integer) 9, runner.getDuration().getHours());
    }

}
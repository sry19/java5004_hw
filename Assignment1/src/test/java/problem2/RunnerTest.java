package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    Runner runner;
    Time startTime;
    Time endTime;

    Runner runner1;
    Time startTime1;
    Time endTime1;

    @Before
    public void setUp() throws Exception {
        startTime = new Time(14,47,57);
        endTime = new Time(23,30,24);
        runner = new Runner("Amy", "GoHusky", startTime, endTime);

        startTime1 = new Time(14,47,57);
        endTime1 = new Time(13,50,58);
        runner1 = new Runner("Emma", "GoHuskies", startTime1, endTime1);
    }

    @Test
    public void getDuration() {
        assertEquals((Integer) 27, runner.getDuration().getSeconds());
        assertEquals((Integer) 42, runner.getDuration().getMinutes());
        assertEquals((Integer) 8, runner.getDuration().getHours());

        assertEquals((Integer) 0, runner1.getDuration().getSeconds());
        assertEquals((Integer) 0, runner1.getDuration().getMinutes());
        assertEquals((Integer) 0, runner1.getDuration().getHours());
    }

    @Test
    public void getName() {
        assertEquals("Amy",runner.getName());
    }

    @Test
    public void getTeam() {
        assertEquals("GoHusky",runner.getTeam());
    }

    @Test
    public void getStartTime() {
        assertEquals(startTime, runner.getStartTime());
    }

    @Test
    public void getEndTime() {
        assertEquals(endTime,runner.getEndTime());
    }



}
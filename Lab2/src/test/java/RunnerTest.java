import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RunnerTest {

  private Runner runner;
  private Name runnername;

  @Before
  public void setUp() throws Exception {
    runnername = new Name("Emma", "n/a", "White");
    runner = new Runner(runnername, 4.0, 17.0, "GO", 4.0,
        3.0, "ABC");
  }

  @Test
  public void getBest5kTime() {
    assertEquals((Double) 4.0, runner.getBest5kTime());
  }

  @Test
  public void getHalfMarathonTime() {
    assertEquals((Double) 3.0, runner.getHalfMarathonTime());
  }

  @Test
  public void getFavRunningEvent() {
    assertEquals("ABC", runner.getFavRunningEvent());
  }
}
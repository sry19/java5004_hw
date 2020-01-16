import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaseballPlayerTest {
  BaseballPlayer amy;
  Name amyname;
  @Before
  public void setUp() throws Exception {
    amyname = new Name("Amy", "J.", "Brown");
    amy = new BaseballPlayer(amyname,14.0,47.0,"Husky",
        "husky", 3.0,7);

  }

  @Test
  public void getTeam() {
    assertEquals("husky",amy.getTeam());
  }

  @Test
  public void getAveBatting() {
    assertEquals((Double)3.0, amy.getAveBatting());
  }

  @Test
  public void getSeasonHomeRun() {
    assertEquals((Integer)7,amy.getSeasonHomeRun());
  }
}
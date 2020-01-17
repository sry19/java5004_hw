import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AthleteTest {

  private Athlete athlete;
  private Name athletename;

  @Before
  public void setUp() throws Exception {
    athletename = new Name("amy", "J.", "Brown");
    athlete = new Athlete(athletename, 4.0, 17.0, "husky");
  }

  @Test
  public void getAthletesName() {
    assertEquals(athletename, athlete.getAthletesName());
  }

  @Test
  public void getHeight() {
    assertEquals((Double) 4.0, athlete.getHeight());
  }

  @Test
  public void getWeight() {
    assertEquals((Double) 17.0, athlete.getWeight());
  }

  @Test
  public void getLeague() {
    assertEquals("husky", athlete.getLeague());
  }
}
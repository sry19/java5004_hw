package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LunchTest {

  private Lunch lunch3;

  @Before
  public void setUp() throws Exception {
    lunch3 = new Lunch("C", 50);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMinAttendees() {
    Lunch lunch1 = new Lunch("A", 5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMaxAttendees() {
    Lunch lunch2 = new Lunch("B", 100);
  }

  @Test
  public void getSandwiches() {
    assertEquals(53, lunch3.getSandwiches());
  }
}
package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EventTest {

  private String amy = "Amy";
  private int amyevent = 10;
  Event event1;

  @Before
  public void setUp() throws Exception {
    event1 = new Event(amy, amyevent);
  }

  @Test
  public void getClientName() {
    assertEquals(amy, event1.getClientName());
  }

  @Test
  public void getNumOfAttendees() {
    assertEquals(amyevent, event1.getNumOfAttendees());
  }
}
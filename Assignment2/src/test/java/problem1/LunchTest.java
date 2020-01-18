package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LunchTest {

  Lunch lunch3;
  Lunch lunch4;
  Lunch lunch5;
  Lunch lunch7;
  Dinner dinner;

  @Before
  public void setUp() throws Exception {
    lunch3 = new Lunch("C", 50);
    lunch4 = new Lunch("B", 50);
    lunch5 = new Lunch("C", 60);
    lunch7 = new Lunch("C", 50);
    dinner = new Dinner("C", 50);
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

  @Test
  public void testEquals() {
    assertTrue(lunch3.equals(lunch3));
    assertTrue(lunch3.equals(lunch7));
    assertFalse(lunch3.equals(lunch4));
    assertFalse(lunch3.equals(lunch5));
    assertFalse(lunch3.equals(null));
    assertFalse(lunch3.equals(dinner));
  }

  @Test
  public void testHashcode() {
    assertEquals(lunch3.hashCode(), lunch7.hashCode());
    assertNotEquals(lunch3.hashCode(), lunch4.hashCode());
    assertNotEquals(lunch3.hashCode(), lunch5.hashCode());
  }

}
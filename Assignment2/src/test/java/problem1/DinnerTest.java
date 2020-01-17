package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DinnerTest {

  Dinner dinner1;

  @Before
  public void setUp() throws Exception {
    dinner1 = new Dinner("A", 40);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMinAttendees() {
    Dinner dinner2 = new Dinner("A", 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMaxAttendees() {
    Dinner dinner3 = new Dinner("B", 60);
  }

  @Test
  public void getNonVegetarian() {
    assertEquals(32, dinner1.getNonVegetarian());
  }

  @Test
  public void getVegetarian() {
    assertEquals(8, dinner1.getVegetarian());
  }
}
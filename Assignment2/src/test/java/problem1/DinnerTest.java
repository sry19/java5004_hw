package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DinnerTest {

  Dinner dinner1;
  Dinner dinner2;
  Dinner dinner3;
  Dinner dinner4;
  Dinner dinner5;
  Lunch lunch;

  @Before
  public void setUp() throws Exception {
    dinner1 = new Dinner("A", 40);
    dinner2 = new Dinner("B", 40);
    dinner3 = new Dinner("A", 50);
    dinner4 = new Dinner("A", 40);
    dinner5 = new Dinner("A", 43);
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

  @Test
  public void testEquals() {
    assertTrue(dinner1.equals(dinner4));
    assertTrue(dinner1.equals(dinner1));
    assertFalse(dinner1.equals(dinner2));
    assertFalse(dinner1.equals(dinner3));
    assertFalse(dinner1.equals(null));
    assertFalse(dinner1.equals(lunch));
    assertFalse(dinner1.equals(dinner5));
  }

  @Test
  public void testHashcode() {
    assertEquals(dinner1.hashCode(), dinner4.hashCode());
    assertEquals(dinner1.hashCode(), dinner1.hashCode());
    assertNotEquals(dinner1.hashCode(), dinner2.hashCode());
    assertNotEquals(dinner1.hashCode(), dinner3.hashCode());
  }
}
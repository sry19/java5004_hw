package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlumbingTest {

  Plumbing plumbing1;
  Plumbing plumbing2;
  Plumbing plumbing3;
  Plumbing plumbing4;
  Plumbing plumbing5;
  Plumbing plumbing6;
  Plumbing plumbing7;
  Plumbing plumbing8;
  Plumbing plumbing9;
  Plumbing plumbing10;
  Cleaning cleaning;

  @Before
  public void setUp() throws Exception {
    plumbing1 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    plumbing2 = new Plumbing("401 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    plumbing3 = new Plumbing("225 Terry Ave.", PropertySize.MEDIUM, true, 3, 3, 2, true);
    plumbing4 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, false, 3, 3, 2, true);
    plumbing5 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 5, 3, 2, true);
    plumbing6 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 3, 2, 2, true);
    plumbing7 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 3, true);
    plumbing8 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, false);
    plumbing9 = new Plumbing("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    plumbing10 = new Plumbing("225 Terry Ave.", PropertySize.LARGE, true, 3, 3, 1, true);
    cleaning = new Cleaning("225 Terry Ave.", PropertySize.SMALL, true, 3, 3);
  }

  @Test
  public void calculatePrice() {
  }

  @Test
  public void testEquals() {
    assertTrue(plumbing1.equals(plumbing1));
    assertTrue(plumbing1.equals(plumbing9));
    assertFalse(plumbing1.equals(plumbing2));
    assertFalse(plumbing1.equals(plumbing3));
    assertFalse(plumbing1.equals(plumbing4));
    assertFalse(plumbing1.equals(plumbing5));
    assertFalse(plumbing1.equals(plumbing6));
    assertFalse(plumbing1.equals(plumbing7));
    assertFalse(plumbing1.equals(plumbing8));
    assertFalse(plumbing1.equals(null));
    assertFalse(plumbing1.equals(cleaning));
  }

  @Test
  public void testHashCode() {
    assertEquals(plumbing1.hashCode(), plumbing1.hashCode());
    assertEquals(plumbing1.hashCode(), plumbing9.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing2.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing3.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing4.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing5.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing6.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing7.hashCode());
    assertNotEquals(plumbing1.hashCode(), plumbing8.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(plumbing1.toString(), plumbing1.toString());
    assertEquals(plumbing1.toString(), plumbing9.toString());
    assertNotEquals(plumbing1.toString(), plumbing2.toString());
  }
}
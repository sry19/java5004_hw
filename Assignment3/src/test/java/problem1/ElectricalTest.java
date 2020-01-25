package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricalTest {

  Electrical electrical1;
  Electrical electrical2;
  Electrical electrical3;
  Electrical electrical4;
  Electrical electrical5;
  Electrical electrical6;
  Electrical electrical7;
  Electrical electrical8;
  Electrical electrical9;
  Cleaning cleaning;

  @Before
  public void setUp() throws Exception {
    electrical1 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    electrical2 = new Electrical("401 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    electrical3 = new Electrical("225 Terry Ave.", PropertySize.MEDIUM, true, 3, 3, 2, true);
    electrical4 = new Electrical("225 Terry Ave.", PropertySize.SMALL, false, 3, 3, 2, true);
    electrical5 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 5, 3, 2, true);
    electrical6 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 2, 2, true);
    electrical7 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 3, true);
    electrical8 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, false);
    electrical9 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 2, true);
    cleaning = new Cleaning("225 Terry Ave.", PropertySize.SMALL, true, 3, 3);
  }

  @Test(expected = EmployeeExceedException.class)
  public void invalidEmployees() {
    Electrical electrical10 = new Electrical("225 Terry Ave.", PropertySize.SMALL, true, 3, 3, 8,
        true);
  }

  @Test
  public void isComplex() {
    assertTrue(electrical1.isComplex());
  }

  @Test
  public void getEmployees() {
    assertEquals((Integer) 2, electrical1.getEmployees());
  }

  @Test
  public void getExtraFee() {
    assertTrue(50 == electrical1.getExtraFee());
  }

  @Test
  public void calculatePrice() {
  }

  @Test
  public void testEquals() {
    assertTrue(electrical1.equals(electrical1));
    assertTrue(electrical1.equals(electrical9));
    assertFalse(electrical1.equals(electrical2));
    assertFalse(electrical1.equals(electrical3));
    assertFalse(electrical1.equals(electrical4));
    assertFalse(electrical1.equals(electrical5));
    assertFalse(electrical1.equals(electrical6));
    assertFalse(electrical1.equals(electrical7));
    assertFalse(electrical1.equals(electrical8));
    assertFalse(electrical1.equals(null));
    assertFalse(electrical1.equals(cleaning));
  }

  @Test
  public void testHashCode() {
    assertEquals(electrical1.hashCode(), electrical1.hashCode());
    assertEquals(electrical1.hashCode(), electrical9.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical2.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical3.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical4.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical5.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical6.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical7.hashCode());
    assertNotEquals(electrical1.hashCode(), electrical8.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(electrical1.toString(), electrical1.toString());
    assertEquals(electrical1.toString(), electrical9.toString());
    assertNotEquals(electrical1.toString(), electrical2.toString());
  }
}
package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GardeningTest {

  Gardening gardening1;
  Gardening gardening2;
  Gardening gardening3;
  Gardening gardening4;
  Gardening gardening5;
  Gardening gardening6;
  Gardening gardening7;
  WindowCleaning windowCleaning;
  final double PRECISION = 0.00001;

  @Before
  public void setUp() throws Exception {
    gardening1 = new Gardening("225 Terry Ave.", PropertySize.SMALL, true, 3, 3);
    gardening2 = new Gardening("225 Terry Ave.", PropertySize.MEDIUM, true, 2, 3);
    gardening3 = new Gardening("225 Terry Ave.", PropertySize.LARGE, true, 0, 3);
    gardening4 = new Gardening("225 Terry Ave.", PropertySize.LARGE, true, 0, 1);
    gardening5 = new Gardening("225 Terry Ave.", PropertySize.SMALL, true, 3, 3);
    gardening6 = new Gardening("225 Terry Ave.", PropertySize.SMALL, false, 3, 3);
    gardening7 = new Gardening("225 Terry Ave.", PropertySize.SMALL, true, 2, 3);
    windowCleaning = new WindowCleaning("225 Terry Ave.", PropertySize.SMALL, true, 3, 3);
  }

  @Test
  public void calculatePrice() {
    assertTrue(Math.abs((Double) gardening1.calculatePrice() - (Double) 90.0) < PRECISION);
    assertTrue(Math.abs((Double) gardening2.calculatePrice() - (Double) 162.0) < PRECISION);
    assertTrue(Math.abs((Double) gardening3.calculatePrice() - (Double) 306.0) < PRECISION);
  }

  @Test
  public void calculateExtraFeeRate() {
    gardening1.calculateExtraFeeRate();
    assertTrue(gardening1.getExtraFeeRate() == 0.0);
  }

  @Test
  public void testEquals() {
    assertTrue(gardening1.equals(gardening5));
    assertTrue(gardening1.equals(gardening1));
    assertFalse(gardening1.equals(gardening6));
    assertFalse(gardening1.equals(gardening7));
    assertFalse(gardening3.equals(gardening4));
    assertFalse(gardening3.equals(null));
    assertFalse(gardening3.equals(windowCleaning));
  }

  @Test
  public void testHashCode() {
    assertTrue(gardening1.hashCode() == gardening1.hashCode());
    assertTrue(gardening1.hashCode() == gardening5.hashCode());
    assertFalse(gardening1.hashCode() == gardening6.hashCode());
    assertFalse(gardening1.hashCode() == gardening7.hashCode());
    assertFalse(gardening1.hashCode() == gardening4.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Gardening {Exterior {Basic Service {Service { Address = 225 Terry Ave., Size = SMALL, CarryOutMonthly = true, Pets = 3, Previous services = 0, Floors = 3}}}}";
    assertEquals(expected, gardening1.toString());
  }
}
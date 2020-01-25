package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CleaningTest {

  Cleaning cleaning1;
  Cleaning cleaning2;
  Cleaning cleaning3;
  Cleaning cleaning4;
  Cleaning cleaning5;
  Cleaning cleaning6;
  Painting painting;
  final double PRECISION = 0.00001;

  @Before
  public void setUp() throws Exception {
    cleaning1 = new Cleaning("225 Terry Ave.", PropertySize.SMALL, true, 0, 3);
    cleaning2 = new Cleaning("225 Terry Ave.", PropertySize.SMALL, true, 1, 3);
    cleaning3 = new Cleaning("225 Terry Ave.", PropertySize.MEDIUM, true, 3, 3);
    cleaning4 = new Cleaning("225 Terry Ave.", PropertySize.LARGE, true, 3, 3);
    cleaning5 = new Cleaning("225 Terry Ave.", PropertySize.SMALL, true, 0, 3);
    cleaning6 = new Cleaning("401 Terry Ave.", PropertySize.SMALL, true, 0, 3);
    painting = new Painting("225 Terry Ave.", PropertySize.SMALL, true, 0, 3);
  }

  @Test
  public void calculateExtraFeeRate() {
    assertTrue(cleaning1.getExtraFeeRate() == 0);
    assertTrue(cleaning2.getExtraFeeRate() == 0.05);
    assertTrue(cleaning3.getExtraFeeRate() == 0.07);
  }

  @Test
  public void calculatePrice() {
    assertTrue(Math.abs((Double) cleaning1.calculatePrice() - (Double) 72.0) < PRECISION);
    assertTrue(Math.abs((Double) cleaning2.calculatePrice() - (Double) 75.6) < PRECISION);
    assertTrue(Math.abs((Double) cleaning3.calculatePrice() - (Double) 154.08) < PRECISION);
  }

  @Test
  public void calculateHour() {
    assertEquals((Integer) 1, cleaning1.calculateHour());
    assertEquals((Integer) 2, cleaning3.calculateHour());
    assertEquals((Integer) 4, cleaning4.calculateHour());
  }

  @Test
  public void updateDiscount() {
    cleaning1.updateDiscount();
    assertTrue(Math.abs((Double) cleaning1.getDiscount() - (Double) 0.9) < PRECISION);
    cleaning1.setPreCarryOutTimes(9);
    cleaning1.updateDiscount();
    assertTrue(Math.abs((Double) cleaning1.getDiscount() - (Double) 0.5) < PRECISION);
  }

  @Test
  public void getBaseFee() {
    assertTrue(cleaning1.getBaseFee() == 0);
  }

  @Test
  public void setBaseFee() {
    cleaning1.setBaseFee(40);
    assertTrue(cleaning1.getBaseFee() == 40);
  }

  @Test
  public void getDiscount() {
    assertTrue(Math.abs((Double) cleaning1.getDiscount() - (Double) 1.0) < PRECISION);
  }

  @Test
  public void setDiscount() {
    cleaning1.setDiscount(0.8);
    assertTrue(Math.abs((Double) cleaning1.getDiscount() - (Double) 0.8) < PRECISION);
  }

  @Test
  public void getExtraFeeRate() {
    assertTrue(Math.abs((Double) cleaning1.getExtraFeeRate() - (Double) 0.0) < PRECISION);
    assertTrue(Math.abs((Double) cleaning2.getExtraFeeRate() - (Double) 0.05) < PRECISION);
    assertTrue(Math.abs((Double) cleaning3.getExtraFeeRate() - (Double) 0.07) < PRECISION);
  }

  @Test
  public void setExtraFeeRate() {
    cleaning1.setExtraFeeRate(0.1);
    assertTrue(Math.abs((Double) cleaning1.getExtraFeeRate() - (Double) 0.1) < PRECISION);
  }

  @Test
  public void getHour() {
    assertEquals((Double) 1.0, (Double) cleaning1.getHour());
  }

  @Test
  public void setHour() {
    cleaning1.setHour(9.0);
    assertEquals((Double) 9.0, (Double) cleaning1.getHour());
  }

  @Test
  public void getPets() {
    assertTrue(cleaning1.getPets() == 0);
  }

  @Test
  public void getFloors() {
    assertTrue(cleaning1.getFloors() == 3);
  }

  @Test
  public void getExtraFee() {
    assertTrue(0 == cleaning1.getExtraFee());
  }

  @Test
  public void setExtraFee() {
    cleaning1.setExtraFee(50);
    assertTrue(50 == cleaning1.getExtraFee());
  }

  @Test
  public void setBaseRate() {
    cleaning1.setBaseRate(100);
    assertTrue(cleaning1.getBaseRate() == 100);
  }

  @Test
  public void setPreCarryOutTimes() {
    cleaning1.setPreCarryOutTimes(5);
    assertTrue(cleaning1.getPreCarryOutTimes() == 5);
  }

  @Test
  public void getAddress() {
    assertEquals("225 Terry Ave.", cleaning1.getAddress());
  }

  @Test
  public void getSize() {
    assertEquals(PropertySize.SMALL, cleaning1.getSize());
  }

  @Test
  public void isCarryOutMonthly() {
    assertTrue(cleaning1.isCarryOutMonthly());
  }

  @Test
  public void getPreCarryOutTimes() {
    assertEquals((Integer) 0, cleaning1.getPreCarryOutTimes());
  }

  @Test
  public void getBaseRate() {
    assertTrue(cleaning1.getBaseRate() == 80);
  }

  @Test
  public void testEquals() {
    assertTrue(cleaning1.equals(cleaning1));
    assertFalse(cleaning1.equals(cleaning2));
    assertFalse(cleaning1.equals(cleaning3));
    assertTrue(cleaning1.equals(cleaning5));
    assertFalse(cleaning1.equals(cleaning6));
    assertFalse(cleaning1.equals(null));
    assertFalse(cleaning1.equals(painting));
  }

  @Test
  public void testHashCode() {
    assertTrue(cleaning1.hashCode() == cleaning5.hashCode());
    assertTrue(cleaning1.hashCode() == cleaning1.hashCode());
    assertFalse(cleaning1.hashCode() == cleaning2.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Cleaning { Address = 225 Terry Ave., Size = SMALL, CarryOutMonthly = true, Pets = 0, Previous services = 0}";
    assertEquals(expected, cleaning1.toString());
  }
}
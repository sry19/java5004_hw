package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaintingTest {

  Painting painting1;
  Painting painting2;
  Painting painting3;
  Painting painting4;
  Painting painting5;
  Painting painting6;
  Painting painting7;
  Painting painting8;
  Cleaning cleaning;
  final double PRECISION = 0.00001;

  @Before
  public void setUp() throws Exception {
    painting1 = new Painting("225 Terry Ave.",PropertySize.SMALL,true,3,3);
    painting2 = new Painting("225 Terry Ave.",PropertySize.SMALL,true,3,3);
    painting3 = new Painting("225 Terry Ave.",PropertySize.MEDIUM,true,3,3);
    painting4 = new Painting("225 Terry Ave.",PropertySize.LARGE,true,3,3);
    painting5 = new Painting("401 Terry Ave.",PropertySize.SMALL,true,3,3);
    painting6 = new Painting("225 Terry Ave.",PropertySize.SMALL,true,1,3);
    painting7 = new Painting("225 Terry Ave.",PropertySize.SMALL,true,0,3);
    painting7 = new Painting("225 Terry Ave.",PropertySize.SMALL,true,-1,-3);
    cleaning = new Cleaning("225 Terry Ave.",PropertySize.SMALL,true,0,3);
  }

  @Test
  public void calculateExtraFeeRate() {
    painting5.calculateExtraFeeRate();
    assertTrue(painting5.getExtraFeeRate()==0.07);
    painting6.calculateExtraFeeRate();
    assertTrue(painting6.getExtraFeeRate()==0.05);
    painting7.calculateExtraFeeRate();
    assertTrue(painting7.getExtraFeeRate()==0.0);
  }

  @Test
  public void calculatePrice() {
    assertTrue(Math.abs((Double)painting1.calculatePrice()-(Double)1232.64 )< PRECISION);
    assertTrue(Math.abs((Double)painting3.calculatePrice()-(Double)1232.64 )< PRECISION);
    assertTrue(Math.abs((Double)painting4.calculatePrice()-(Double)1848.96 )< PRECISION);
  }

  @Test
  public void testEquals() {
    assertTrue(painting1.equals(painting1));
    assertTrue(painting1.equals(painting2));
    assertFalse(painting1.equals(painting3));
    assertFalse(painting1.equals(painting4));
    assertFalse(painting1.equals(painting5));
    assertFalse(painting1.equals(painting6));
    assertFalse(painting1.equals(null));
    assertFalse(painting1.equals(cleaning));
  }

  @Test
  public void testHashCode() {
    assertTrue(painting1.hashCode() == painting1.hashCode());
    assertTrue(painting1.hashCode() == painting2.hashCode());
    assertFalse(painting1.hashCode() == painting3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(painting1.toString(),painting2.toString());
    assertEquals(painting1.toString(),painting1.toString());
    assertNotEquals(painting1.toString(),painting3.toString());
  }

  @Test
  public void calculateHour() {
    assertEquals((Integer)16,painting1.calculateHour());
    assertEquals((Integer)16,painting3.calculateHour());
    assertEquals((Integer)24,painting4.calculateHour());
  }

  @Test
  public void updateDiscount() {
    painting1.updateDiscount();
    assertTrue(Math.abs((Double)painting1.getDiscount()-(Double)0.9 )< PRECISION);
    painting1.setPreCarryOutTimes(9);
    painting1.updateDiscount();
    assertTrue(Math.abs((Double)painting1.getDiscount()-(Double)0.5 )< PRECISION);
  }

  @Test
  public void getBaseFee() {
    assertTrue(painting1.getBaseFee() == 0);
  }

  @Test
  public void setBaseFee() {
    painting1.setBaseFee(40);
    assertTrue(painting1.getBaseFee() == 40);
  }

  @Test
  public void getDiscount() {
    assertTrue(Math.abs((Double)painting1.getDiscount()-(Double)1.0 )< PRECISION);
  }

  @Test
  public void setDiscount() {
    painting1.setDiscount(0.8);
    assertTrue(Math.abs((Double)painting1.getDiscount()-(Double)0.8 )< PRECISION);
  }

  @Test
  public void getExtraFeeRate() {
    assertTrue(Math.abs((Double)painting5.getExtraFeeRate()-(Double)0.07 )< PRECISION);
    assertTrue(Math.abs((Double)painting6.getExtraFeeRate()-(Double)0.05 )< PRECISION);
    assertTrue(Math.abs((Double)painting7.getExtraFeeRate()-(Double)0.0 )< PRECISION);
  }

  @Test
  public void setExtraFeeRate() {
    painting1.setExtraFeeRate(0.1);
    assertTrue(Math.abs((Double)painting1.getExtraFeeRate()-(Double)0.1 )< PRECISION);
  }

  @Test
  public void getHour() {
    assertEquals((Double)16.0,(Double)painting1.getHour());
    assertEquals((Double)16.0,(Double)painting3.getHour());
    assertEquals((Double)24.0,(Double)painting4.getHour());
  }

  @Test
  public void setHour() {
    painting1.setHour(9.0);
    assertEquals((Double)9.0,(Double)painting1.getHour());
  }

  @Test
  public void getPets() {
    assertTrue(painting1.getPets() == 3);
  }

  @Test
  public void getFloors() {
    assertTrue(painting1.getFloors() == 3);
  }

  @Test
  public void getExtraFee() {
    assertTrue(0==painting1.getExtraFee());
  }

  @Test
  public void setExtraFee() {
    painting1.setExtraFee(50);
    assertTrue(50==painting1.getExtraFee());
  }

  @Test
  public void setBaseRate() {
    painting1.setBaseRate(100);
    assertTrue(painting1.getBaseRate() == 100);
  }

  @Test
  public void setPreCarryOutTimes() {
    painting1.setPreCarryOutTimes(5);
    assertTrue(painting1.getPreCarryOutTimes() == 5);
  }

  @Test
  public void getAddress() {
    assertEquals("225 Terry Ave.", painting1.getAddress());
  }

  @Test
  public void getSize() {
    assertEquals(PropertySize.SMALL,painting1.getSize());
  }

  @Test
  public void isCarryOutMonthly() {
    assertTrue(painting1.isCarryOutMonthly());
  }

  @Test
  public void getPreCarryOutTimes() {
    assertEquals((Integer)0,painting1.getPreCarryOutTimes());
  }

  @Test
  public void getBaseRate() {
    assertTrue(painting1.getBaseRate()==80);
  }

}
package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowCleaningTest {

  WindowCleaning windowCleaning1;
  WindowCleaning windowCleaning2;
  WindowCleaning windowCleaning3;
  WindowCleaning windowCleaning4;
  WindowCleaning windowCleaning5;
  WindowCleaning windowCleaning6;
  WindowCleaning windowCleaning7;
  Cleaning cleaning;
  final double PRECISION = 0.00001;

  @Before
  public void setUp() throws Exception {
    windowCleaning1 = new WindowCleaning("225 Terry Ave.",PropertySize.SMALL,true,3,3);
    windowCleaning2 = new WindowCleaning("225 Terry Ave.",PropertySize.MEDIUM,true,2,3);
    windowCleaning3 = new WindowCleaning("225 Terry Ave.",PropertySize.LARGE,true,0,3);
    windowCleaning4 = new WindowCleaning("225 Terry Ave.",PropertySize.LARGE,true,0,1);
    windowCleaning5 = new WindowCleaning("225 Terry Ave.",PropertySize.SMALL,true,3,3);
    windowCleaning6 = new WindowCleaning("225 Terry Ave.",PropertySize.SMALL,false,3,3);
    windowCleaning7 = new WindowCleaning("225 Terry Ave.",PropertySize.SMALL,true,2,3);
    cleaning = new Cleaning("225 Terry Ave.",PropertySize.SMALL,true,3,3);
  }

  @Test(expected = FloorExceedException.class)
  public void invalidFloor() {
    WindowCleaning windowCleaning4 = new WindowCleaning("225 Terry Ave.",PropertySize.SMALL,true,3,4);
  }

  @Test
  public void calculatePrice() {
    assertTrue(Math.abs((Double)windowCleaning1.calculatePrice()-(Double)75.6 )< PRECISION);
    assertTrue(Math.abs((Double)windowCleaning2.calculatePrice()-(Double)151.2 )< PRECISION);
    assertTrue(Math.abs((Double)windowCleaning3.calculatePrice()-(Double)302.4 )< PRECISION);
  }

  @Test
  public void calculateExtraFeeRate() {
    windowCleaning1.calculateExtraFeeRate();
    assertTrue(Math.abs((Double)windowCleaning1.getExtraFeeRate()-(Double)0.05 )< PRECISION);
    windowCleaning4.calculateExtraFeeRate();
    assertTrue(Math.abs((Double)windowCleaning4.getExtraFeeRate()-(Double)0.0 )< PRECISION);
  }

  @Test
  public void testEquals() {
    assertTrue(windowCleaning1.equals(windowCleaning5));
    assertTrue(windowCleaning1.equals(windowCleaning1));
    assertFalse(windowCleaning1.equals(windowCleaning6));
    assertFalse(windowCleaning1.equals(windowCleaning7));
    assertFalse(windowCleaning3.equals(windowCleaning4));
    assertFalse(windowCleaning3.equals(null));
    assertFalse(windowCleaning3.equals(cleaning));
  }

  @Test
  public void testHashCode() {
    assertTrue(windowCleaning1.hashCode()==windowCleaning1.hashCode());
    assertTrue(windowCleaning1.hashCode()==windowCleaning5.hashCode());
    assertFalse(windowCleaning1.hashCode()==windowCleaning6.hashCode());
    assertFalse(windowCleaning1.hashCode()==windowCleaning7.hashCode());
    assertFalse(windowCleaning1.hashCode()==windowCleaning4.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(windowCleaning1.toString(),windowCleaning1.toString());
    assertEquals(windowCleaning1.toString(),windowCleaning5.toString());
    assertNotEquals(windowCleaning1.toString(),windowCleaning4.toString());
    assertNotEquals(windowCleaning1.toString(),windowCleaning6.toString());
    assertNotEquals(windowCleaning1.toString(),windowCleaning7.toString());
  }
}
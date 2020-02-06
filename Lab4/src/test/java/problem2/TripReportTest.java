package problem2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TripReportTest {
  TripReport tripReport1;
  TripReport tripReport2;
  TripReport tripReport3;
  TripReport tripReport4;
  TripReport tripReport5;
  TripReport tripReport6;
  Bus bus1;
  Bus bus2;

  @Before
  public void setUp() throws Exception {
    bus1 = new Bus("bus", (float)(3.0) ,(float)3.0);
    bus2 = new Bus("bus", (float)(4.0) ,(float)3.0);
    tripReport1 = new TripReport(bus1,bus1.getAverageSpeed(), (float)3.0,1 );
    tripReport2 = new TripReport(bus1,bus1.getAverageSpeed(), (float)3.0,1 );
    tripReport3 = new TripReport(bus2,bus1.getAverageSpeed(), (float)3.0,1 );
    tripReport4 = new TripReport(bus1,(float)5.0, (float)3.0,1 );
    tripReport5 = new TripReport(bus1,bus1.getAverageSpeed(), (float)4.0,1 );
    tripReport6 = new TripReport(bus1,bus1.getAverageSpeed(), (float)3.0,3 );
  }

  @Test
  public void testEquals() {
    assertEquals(tripReport1,tripReport1);
    assertEquals(tripReport1,tripReport2);
    assertNotEquals(tripReport1,tripReport3);
    assertNotEquals(tripReport1,tripReport4);
    assertNotEquals(tripReport1,tripReport5);
    assertNotEquals(tripReport1,tripReport6);
    assertNotEquals(tripReport1,null);
    assertNotEquals(tripReport1,bus1);
  }

  @Test
  public void testHashCode() {
    assertEquals(tripReport1.hashCode(),tripReport1.hashCode());
    assertEquals(tripReport1.hashCode(),tripReport2.hashCode());
    assertNotEquals(tripReport1.hashCode(),tripReport3.hashCode());
    assertNotEquals(tripReport1.hashCode(),tripReport4.hashCode());
    assertNotEquals(tripReport1.hashCode(),tripReport5.hashCode());
    assertNotEquals(tripReport1.hashCode(),tripReport6.hashCode());
    assertNotEquals(tripReport1.hashCode(),bus1.hashCode());
  }
}
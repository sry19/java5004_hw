package problem2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FleetManagerTest {

  FleetManager fleetManager;
  Bus bus;

  @Before
  public void setUp() throws Exception {
    fleetManager = new FleetManager();
    bus = new Bus("bus", (float)(3.0) ,(float)4.0);
  }

  @Test
  public void drive() {
    TripReport tripReport = new TripReport(bus,bus.getAverageSpeed(), (float)3.0,1 );
    assertEquals(tripReport, fleetManager.drive(bus));
  }

  @Test
  public void testDrive() {
    TripReport tripReport = new TripReport(bus,bus.getAverageSpeed(), (float)3.0,1 );
    assertEquals(tripReport, fleetManager.drive((float)3.0, bus));
  }

  @Test
  public void testDrive1() {
    TripReport tripReport = new TripReport(bus,bus.getAverageSpeed(), (float)3.0,1 );
    assertEquals(tripReport, fleetManager.drive((float)3.0, bus,1));
  }

  @Test
  public void testDrive2() {
    TripReport tripReport = new TripReport(bus,bus.getAverageSpeed(), (float)3.0,1 );
    assertEquals(tripReport, fleetManager.drive((float)3.0, bus,1, (float)3.0));

    Bus bus1 = new Bus("bus", (float)(3.0) ,(float)3.0);
    TripReport tripReport1 = new TripReport(bus1,bus1.getAverageSpeed(), (float)3.0,1 );
    assertEquals(tripReport1, fleetManager.drive((float)3.0, bus1,1, (float)4.0));
  }
}
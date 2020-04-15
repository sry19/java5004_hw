package problem2;

import static org.junit.Assert.*;

import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class OlderVehiclesFilterTest {
  OlderVehiclesFilter olderVehiclesFilter;

  @Before
  public void setUp() throws Exception {
    Vehicle vehicle = new Vehicle("make","model",1999, new Color(1,0,0));
    Vehicle vehicle1 = new Vehicle("make","model",1998, new Color(1,0,0));
    Vehicle vehicle2 = new Vehicle("make","model",2000, new Color(1,0,0));
    olderVehiclesFilter = new OlderVehiclesFilter(vehicle1,vehicle2,vehicle);
  }

  @Test
  public void filterVWvehilces() {
    assertEquals("[make = make;model = model;year = 2000]",olderVehiclesFilter.filterVWvehilces().toString());
  }
}
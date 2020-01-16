package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

  Vehicle vehicle;
  Owner owner;

  @Before
  public void setUp() throws Exception {
    owner = new Owner("Amy", "Brown", "3489");
    vehicle = new Vehicle(163, "abs", owner);
  }

  @Test
  public void getVIN() {
    assertEquals((Integer) 163, vehicle.getVIN());
  }

  @Test
  public void getLicensePlate() {
    assertEquals("abs", vehicle.getLicensePlate());
  }

  @Test
  public void getOwner() {
    assertEquals(owner, vehicle.getOwner());
  }

  @Test
  public void setVIN() {
    vehicle.setVIN(333);
    assertEquals((Integer) 333, vehicle.getVIN());
  }

  @Test
  public void setLicensePlate() {
    vehicle.setLicensePlate("xxx");
    assertEquals("xxx", vehicle.getLicensePlate());
  }
}
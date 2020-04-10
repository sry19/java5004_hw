package reservationsystem.controller;

import static org.junit.Assert.*;

import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import reservationsystem.model.Theater;

public class ReservationsServiceTest {

  Theater theater;
  Theater theater1;
  Theater theater2;
  ReservationsService reservationsService;
  ReservationsService reservationsService1;
  ReservationsService reservationsService2;

  @Before
  public void setUp() throws Exception {
    theater = new Theater("rr",4);
    reservationsService = new ReservationsService(theater);
    reservationsService1 = new ReservationsService(theater);
    theater1 = new Theater("r",4);
    reservationsService2 = new ReservationsService(theater1);
  }

  @Test
  public void reserve() {
  }

  @Test
  public void reserveWithoutWheelchairAccess() {
  }


  @Test
  public void show() {
    reservationsService.show();
  }

  @Test
  public void performAction() {
    //reservationsService.performAction("reserve 7");
  }

  @Test
  public void testEquals() {
    assertEquals(reservationsService,reservationsService);
    assertEquals(reservationsService,reservationsService1);
    assertNotEquals(reservationsService,reservationsService2);
    assertFalse(reservationsService.equals(null));
    assertFalse(reservationsService.equals(theater));
  }

  @Test
  public void testHashCode() {
    assertEquals(reservationsService.hashCode(),reservationsService1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("ReservationsService{theater=Theater{name='rr', rowList=[  1  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   2  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   3  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   4  = = = = = = = = = = = = = = = =], wheelchairAccessRow=[4]}, numOfRows=4, center=2, rowList=[  1  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   2  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   3  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   4  = = = = = = = = = = = = = = = =]}",reservationsService.toString());
  }
}
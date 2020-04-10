package reservationsystem.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SeatTest {

  Seat seat;
  Seat seat1;
  Seat seat2;
  Seat seat3;

  @Before
  public void setUp() throws Exception {
    seat = new Seat('A',null);
    seat1 = new Seat('A',null);
    seat2 = new Seat('A',"ss");
    seat3 = new Seat('b',null);
  }

  @Test
  public void setReservedFor() {
    seat.setReservedFor("ad");
    assertTrue(seat.getReservedFor().equals("ad"));
  }

  @Test
  public void getReservedFor() {
    assertNull(seat.getReservedFor());
  }

  @Test
  public void testEquals() {
    seat.setReservedFor("ad");
    seat1.setReservedFor("ad");
    assertEquals(seat,seat);
    assertEquals(seat,seat1);
    assertNotEquals(seat,seat3);
    assertNotEquals(seat,seat2);
    assertFalse(seat.equals(null));
    assertFalse(seat.equals(new ArrayList<String>()));
  }

  @Test
  public void testHashCode() {
    seat.setReservedFor("ss");
    assertEquals(seat2.hashCode(),seat.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(" _",seat.toString());
    assertEquals(" x",seat2.toString());
  }
}
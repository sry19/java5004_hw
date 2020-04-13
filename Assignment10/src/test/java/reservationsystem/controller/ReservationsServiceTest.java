package reservationsystem.controller;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
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
  ByteArrayInputStream inputStream;
  ByteArrayOutputStream outStream;

  @Before
  public void setUp() throws Exception {
    theater = new Theater("rr",4);
    reservationsService = new ReservationsService(theater);
    reservationsService1 = new ReservationsService(theater);
    theater1 = new Theater("r",4);
    reservationsService2 = new ReservationsService(theater1);
    theater2 = new Theater("rr",5);
    this.outStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outStream));
  }

  @After
  public void tearDown() throws Exception {
    System.setIn(System.in);
    System.setOut(System.out);
  }

  @Test
  public void reserveSeat() {
    inputStream = new ByteArrayInputStream("reserve 11".getBytes());
    System.setIn(inputStream);
    outStream.reset();
    Theater theater = new Theater("ss",14);
    ReservationsService reservationsService = new ReservationsService(theater);
    reservationsService.reserveSeat(3,3);
    assertEquals("What's your name\n"
        + "I’ve reserved 3 seats for you at the ss in row 4, reserve 11.\n"
        + "", outStream.toString());
  }

  @Test
  public void show() {
   reservationsService.show();
  }

  @Test
  public void testEquals() {
    assertEquals(reservationsService,reservationsService);
    assertEquals(reservationsService,reservationsService1);
    assertNotEquals(reservationsService,reservationsService2);
    assertFalse(reservationsService.equals(null));
    assertFalse(reservationsService.equals(theater));
    assertNotEquals(reservationsService,reservationsService2);
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
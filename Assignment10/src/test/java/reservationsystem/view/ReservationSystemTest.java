package reservationsystem.view;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import reservationsystem.controller.ReservationsService;
import reservationsystem.model.Theater;

public class ReservationSystemTest {
  private ByteArrayInputStream inputStream;
  private ByteArrayOutputStream outStream;


  @Before
  public void setUp() throws Exception {
    this.outStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outStream));
  }

  @After
  public void tearDown() throws Exception {
    System.setIn(System.in);
    System.setOut(System.out);
  }

  @Test
  public void main() throws Exception {
    inputStream = new ByteArrayInputStream("done".getBytes());
    System.setIn(inputStream);
    outStream.reset();
    ReservationSystem.main(new String[]{});
    assertEquals("What would you like to do?\n" +
        "Have a nice day!\n"+"", outStream.toString());
  }
}
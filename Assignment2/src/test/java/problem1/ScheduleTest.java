package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScheduleTest {
  Lunch lunch;
  Dinner dinner;
  Schedule schedule1;

  @Before
  public void setUp() throws Exception {
    lunch = new Lunch("C", 50);
    dinner = new Dinner("B",40);
    schedule1 = new Schedule();
  }

  @Test
  public void bookingLunch() throws NoEventException, EventCannotBookedException {
    Lunch lunch1 = new Lunch("A", 30);
    schedule1.bookingLunch(lunch1);
    assertEquals(lunch1, schedule1.getLunch());
  }

  @Test(expected = EventCannotBookedException.class)
  public void invalidBookingLunch() throws EventCannotBookedException {
    Lunch lunch1 = new Lunch("A", 30);
    Lunch lunch2 = new Lunch("B", 40);
    schedule1.bookingLunch(lunch1);
    schedule1.bookingLunch(lunch2);
  }

  @Test
  public void bookingDinner() throws NoEventException, EventCannotBookedException {
    Dinner dinner1 = new Dinner("A", 30);
    schedule1.bookingDinner(dinner1);
    assertEquals(dinner1, schedule1.getDinner());
  }

  @Test(expected = EventCannotBookedException.class)
  public void invalidBookingDinner() throws EventCannotBookedException {
    Dinner dinner1 = new Dinner("A", 30);
    Dinner dinner2 = new Dinner("B", 40);
    schedule1.bookingDinner(dinner1);
    schedule1.bookingDinner(dinner2);
  }

  @Test
  public void getLunchBooked() {
    assertEquals(false,schedule1.getLunchBooked());
  }

  @Test
  public void getDinnerBooked() {
    assertEquals(false,schedule1.getDinnerBooked());
  }
}
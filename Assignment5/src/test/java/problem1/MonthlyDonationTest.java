package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class MonthlyDonationTest {

  MonthlyDonation monthlyDonation1;
  MonthlyDonation monthlyDonation2;
  MonthlyDonation monthlyDonation3;
  MonthlyDonation monthlyDonation4;
  MonthlyDonation monthlyDonation5;
  MonthlyDonation monthlyDonation6;
  MonthlyDonation monthlyDonation7;
  MonthlyDonation monthlyDonation8;

  @Before
  public void setUp() throws Exception {
    monthlyDonation1 = new MonthlyDonation(30, LocalDate.of(2020, 4, 4));
    monthlyDonation2 = new MonthlyDonation(30, LocalDate.of(2020, 5, 4));
    monthlyDonation3 = new MonthlyDonation(30);
    monthlyDonation4 = new MonthlyDonation(30, LocalDate.of(2019, 4, 3));
    monthlyDonation5 = new MonthlyDonation(30, LocalDate.of(2019, 4, 3));
    monthlyDonation6 = new MonthlyDonation(30, LocalDate.of(2019, 4, 3));
    monthlyDonation7 = new MonthlyDonation(300, LocalDate.of(2019, 4, 3));
    monthlyDonation8 = new MonthlyDonation(30, LocalDate.of(2022, 4, 4));
  }

  @Test
  public void setCancellationDate() {
    monthlyDonation3.setCancellationDate(LocalDate.of(2021, 4, 1));
  }

  @Test(expected = InvalidDateException.class)
  public void invalidSetCancellationDate() {
    monthlyDonation3.setCancellationDate(LocalDate.of(2020, 1, 1));
  }

  @Test(expected = InvalidDateException.class)
  public void invalidSetCancellationDate2() {
    monthlyDonation1.setCancellationDate(LocalDate.of(2020, 3, 4));
  }

  @Test
  public void getCancellationDate() {
    monthlyDonation3.setCancellationDate(LocalDate.of(2020, 5, 1));
    assertTrue(LocalDate.of(2020, 5, 1).equals(monthlyDonation3.getCancellationDate()));
  }

  @Test
  public void getExpectedDonation() {
    monthlyDonation2.setCancellationDate(LocalDate.of(2020, 6, 1));
    assertEquals(Integer.valueOf(30), monthlyDonation2.getExpectedDonation(2020));
    assertEquals(Integer.valueOf(0), monthlyDonation2.getExpectedDonation(2021));
    assertEquals(Integer.valueOf(0), monthlyDonation2.getExpectedDonation(2019));

    monthlyDonation2.setCancellationDate(LocalDate.of(2021, 3, 3));
    assertEquals(Integer.valueOf(240), monthlyDonation2.getExpectedDonation(2020));

    monthlyDonation4.setCancellationDate(LocalDate.of(2020, 3, 3));
    assertEquals(Integer.valueOf(90), monthlyDonation4.getExpectedDonation(2020));

    monthlyDonation5.setCancellationDate(LocalDate.of(2021, 3, 3));
    assertEquals(Integer.valueOf(360), monthlyDonation5.getExpectedDonation(2020));

    monthlyDonation2.setCancellationDate(LocalDate.of(2020, 6, 1));
    assertEquals(Integer.valueOf(30), monthlyDonation2.getExpectedDonation(2020));

    monthlyDonation2.setCancellationDate(LocalDate.of(2020, 6, 30));
    assertEquals(Integer.valueOf(60), monthlyDonation2.getExpectedDonation(2020));

    assertEquals(Integer.valueOf(360), monthlyDonation6.getExpectedDonation(2020));
    assertEquals(Integer.valueOf(360), monthlyDonation6.getExpectedDonation(2021));
    assertEquals(Integer.valueOf(270), monthlyDonation6.getExpectedDonation(2019));

    assertEquals(Integer.valueOf(0), monthlyDonation8.getExpectedDonation(2020));
  }

  @Test
  public void testEquals() {
    assertTrue(monthlyDonation5.equals(monthlyDonation6));
    assertTrue(monthlyDonation5.equals(monthlyDonation5));
    assertFalse(monthlyDonation1.equals(monthlyDonation2));
    assertFalse(monthlyDonation1.equals(null));
    assertFalse(monthlyDonation1.equals(LocalDate.of(2020, 1, 1)));
    assertFalse(monthlyDonation6.equals(monthlyDonation7));
    assertFalse(monthlyDonation3.equals(monthlyDonation1));
    monthlyDonation6.setCancellationDate(LocalDate.of(2021, 5, 5));
    monthlyDonation5.setCancellationDate(LocalDate.of(2020, 12, 20));
    assertFalse(monthlyDonation5.equals(monthlyDonation6));
  }

  @Test
  public void testHashcode() {
    assertEquals(monthlyDonation5.hashCode(), monthlyDonation6.hashCode());
    monthlyDonation6.setCancellationDate(LocalDate.of(2021, 5, 5));
    monthlyDonation5.setCancellationDate(LocalDate.of(2020, 12, 20));
    assertNotEquals(monthlyDonation5.hashCode(), monthlyDonation6.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(
        "MonthlyDonation{Donation{amount=30, localDate=2020-04-04}, cancellationDate=null}",
        monthlyDonation1.toString());
  }
}
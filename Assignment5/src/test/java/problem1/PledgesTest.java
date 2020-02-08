package problem1;

import static org.junit.Assert.*;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import java.time.LocalDate;
import java.util.EmptyStackException;
import org.junit.Before;
import org.junit.Test;

public class PledgesTest {

  Pledges pledges1;
  Pledges pledges2;
  Pledges pledges3;
  Pledges pledges4;
  Pledges pledges5;
  Pledges pledges6;
  Pledges pledges7;
  Pledges pledges8;
  Pledges pledges9;
  OneTimeDonation oneTimeDonation;

  @Before
  public void setUp() throws Exception {
    pledges1 = new Pledges(30, LocalDate.of(2020, 2, 6), LocalDate.of(2020, 3, 6));
    pledges2 = new Pledges(40, LocalDate.of(2020, 4, 4));
    pledges3 = new Pledges(50);
    pledges4 = new Pledges(29);
    pledges5 = new Pledges(30, LocalDate.of(2020, 2, 7), LocalDate.of(2020, 3, 6));
    pledges6 = new Pledges(50);
    pledges9 = new Pledges(30, LocalDate.of(2020, 2, 6), LocalDate.of(2020, 3, 5));
    oneTimeDonation = new OneTimeDonation(30, LocalDate.of(2020, 5, 5));
  }

  @Test(expected = InvalidDateException.class)
  public void invalidDonationDate() throws InvalidDateException {
    pledges7 = new Pledges(30, LocalDate.of(1999, 1, 1));
  }

  @Test(expected = InvalidDateException.class)
  public void invalidDonationDate1() throws InvalidDateException {
    pledges8 = new Pledges(30, LocalDate.now(), LocalDate.of(1000, 1, 1));
  }

  @Test
  public void getDonationDate() {
    assertTrue(pledges1.getDonationDate().equals(LocalDate.of(2020, 3, 6)));
  }

  @Test
  public void changeDonationDate() {
    assertNull(pledges3.getDonationDate());
    pledges3.changeDonationDate(LocalDate.of(2020, 4, 6));
    assertTrue(pledges3.getDonationDate().equals(LocalDate.of(2020, 4, 6)));

    pledges2.changeDonationDate(LocalDate.of(2020, 4, 3));
    assertTrue(pledges2.getDonationDate().equals(LocalDate.of(2020, 4, 3)));

    pledges2.changeDonationDate(LocalDate.of(2020, 5, 1));
    assertTrue(pledges2.getDonationDate().equals(LocalDate.of(2020, 5, 1)));

    assertNull(pledges4.getDonationDate());
    pledges4.changeDonationDate(LocalDate.of(2020, 1, 1));
    assertNull(pledges4.getDonationDate());

    pledges2.changeDonationDate(LocalDate.of(2020, 5, 8));
    assertTrue(pledges2.getDonationDate().equals(LocalDate.of(2020, 5, 8)));
  }

  @Test
  public void getExpectedDonation() {
    assertEquals(Integer.valueOf(30), pledges1.getExpectedDonation(2020));
    assertEquals(Integer.valueOf(0), pledges1.getExpectedDonation(2021));
    assertEquals(Integer.valueOf(0), pledges3.getExpectedDonation(2020));
  }

  @Test
  public void testEquals() {
    assertFalse(pledges3.equals(pledges4));
    assertFalse(pledges3.equals(null));
    assertTrue(pledges3.equals(pledges3));
    assertFalse(pledges1.equals(pledges5));
    assertFalse(pledges1.equals(oneTimeDonation));
    assertFalse(pledges1.equals(pledges4));
    assertFalse(pledges1.equals(pledges9));
    assertFalse(pledges1.equals(pledges3));
    assertFalse(pledges3.equals(pledges1));
    assertTrue(pledges3.equals(pledges6));
  }

  @Test
  public void testHashcode() {
    assertEquals(pledges3.hashCode(), pledges6.hashCode());
    assertNotEquals(pledges1.hashCode(), pledges5.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Pledges{Donation{amount=30, localDate=2020-02-06}, donationDate=2020-03-06}",
        pledges1.toString());
  }
}
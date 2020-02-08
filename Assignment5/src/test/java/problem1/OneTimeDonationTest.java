package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class OneTimeDonationTest {

  OneTimeDonation oneTimeDonation;
  OneTimeDonation oneTimeDonation1;
  OneTimeDonation oneTimeDonation2;
  OneTimeDonation oneTimeDonation3;
  OneTimeDonation oneTimeDonation4;
  OneTimeDonation oneTimeDonation5;

  @Before
  public void setUp() throws Exception {
    oneTimeDonation = new OneTimeDonation(500, LocalDate.of(2020, 4, 22));
    oneTimeDonation1 = new OneTimeDonation(500, LocalDate.of(2021, 4, 22));
    oneTimeDonation2 = new OneTimeDonation(30);
    oneTimeDonation3 = new OneTimeDonation(500, LocalDate.of(2020, 4, 22));
    oneTimeDonation4 = new OneTimeDonation(600, LocalDate.of(2020, 4, 22));
    oneTimeDonation5 = new OneTimeDonation(500, LocalDate.of(2020, 4, 23));
  }

  @Test
  public void getExpectedDonation() {
    assertEquals(Integer.valueOf(500), oneTimeDonation.getExpectedDonation(2020));
    assertEquals(Integer.valueOf(0), oneTimeDonation1.getExpectedDonation(2020));
    assertEquals(Integer.valueOf(30), oneTimeDonation2.getExpectedDonation(2020));
  }

  @Test
  public void testEquals() {
    assertTrue(oneTimeDonation.equals(oneTimeDonation));
    assertTrue(oneTimeDonation.equals(oneTimeDonation3));
    assertFalse(oneTimeDonation.equals(oneTimeDonation4));
    assertFalse(oneTimeDonation.equals(oneTimeDonation5));
    assertFalse(oneTimeDonation.equals(null));
    assertFalse(oneTimeDonation.equals(LocalDate.of(2020, 2, 2)));
  }

  @Test
  public void testHashcode() {
    assertEquals(oneTimeDonation.hashCode(), oneTimeDonation3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("OneTimeDonation{Donation{amount=500, localDate=2020-04-22}}",
        oneTimeDonation.toString());
  }
}
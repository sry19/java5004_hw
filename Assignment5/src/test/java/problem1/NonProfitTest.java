package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class NonProfitTest {

  Donation donation1;
  Donation donation2;
  Donation donation3;
  NonProfit nonProfit;

  @Before
  public void setUp() throws Exception {
    donation1 = new OneTimeDonation(30);
    donation2 = new MonthlyDonation(40, LocalDate.of(2020, 5, 5));
    donation3 = new Pledges(50, LocalDate.of(2020, 5, 7));
    nonProfit = new NonProfit("NONPROFIT");
    nonProfit.addDonation(donation1);
  }

  @Test
  public void getDonations() {
    ArrayList<Donation> arrayList = new ArrayList<>();
    arrayList.add(donation1);
    //assertArrayEquals(arrayList, nonProfit.getDonations());
  }

  @Test
  public void addDonation() {
    nonProfit.addDonation(donation2);
    nonProfit.addDonation(donation3);
    ArrayList<Donation> arrayList = new ArrayList<>();
    arrayList.add(donation1);
    arrayList.add(donation2);
    arrayList.add(donation3);

  }

  @Test
  public void getTotalDonationsForYear() {
    nonProfit.addDonation(donation2);
    nonProfit.addDonation(donation3);
    assertTrue(400 == nonProfit.getTotalDonationsForYear(2020));
  }
}
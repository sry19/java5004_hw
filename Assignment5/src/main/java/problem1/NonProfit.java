package problem1;

import java.util.ArrayList;

/**
 * The type Non profit.
 */
public class NonProfit {
  private String organizationName;
  private ArrayList<Donation> donations;

  /**
   * Instantiates a new Non profit.
   *
   * @param organizationName the organization name
   */
  public NonProfit(String organizationName) {
    this.organizationName = organizationName;
    this.donations = new ArrayList<>();
  }

  /**
   * Add donation.
   *
   * @param donation the donation
   */
  public void addDonation(Donation donation) {
    this.donations.add(donation);
  }

  /**
   * Gets donations.
   *
   * @return the donations
   */
  public ArrayList<Donation> getDonations() {
    return this.donations;
  }

  /**
   * Gets total donations for year.
   *
   * @param year the year
   * @return the total donations for year
   */
  public Integer getTotalDonationsForYear(Integer year) {
    Integer sum = 0;
    for (Donation donation: this.donations) {
      sum += donation.getExpectedDonation(year);
    }
    return sum;
  }
}

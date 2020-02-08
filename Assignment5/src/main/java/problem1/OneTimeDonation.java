package problem1;

import java.time.LocalDate;

/**
 * The type One time donation.
 */
public class OneTimeDonation extends Donation {

  /**
   * Instantiates a new One time donation.
   *
   * @param amount    the amount
   * @param localDate the local date
   */
  public OneTimeDonation(Integer amount, LocalDate localDate) {
    super(amount, localDate);
  }

  /**
   * Instantiates a new One time donation.
   *
   * @param amount the amount
   */
  public OneTimeDonation(Integer amount) {
    super(amount);
  }

  @Override
  public Integer getExpectedDonation(Integer year) {
    if (this.getLocalDate().getYear() == year) {
      return this.getAmount();
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    return "OneTimeDonation{" + super.toString() + "}";
  }
}

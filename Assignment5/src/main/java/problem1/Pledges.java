package problem1;

import java.time.LocalDate;

/**
 * The type Pledges.
 */
public class Pledges extends Donation {

  private LocalDate donationDate;

  /**
   * Instantiates a new Pledges.
   *
   * @param amount       the amount
   * @param localDate    the local date
   * @param donationDate the donation date
   */
  public Pledges(Integer amount, LocalDate localDate, LocalDate donationDate)
      throws InvalidDateException {
    super(amount, localDate);
    if (donationDate.isBefore(LocalDate.now())) {
      throw new InvalidDateException();
    }
    this.donationDate = donationDate;
  }

  /**
   * Gets donation date.
   *
   * @return the donation date
   */
  public LocalDate getDonationDate() {
    return this.donationDate;
  }

  /**
   * Instantiates a new Pledges.
   *
   * @param amount       the amount
   * @param donationDate the donation date
   */
  public Pledges(Integer amount, LocalDate donationDate) throws InvalidDateException {
    super(amount);
    if (donationDate.isBefore(LocalDate.now())) {
      throw new InvalidDateException();
    }
    this.donationDate = donationDate;
  }

  /**
   * Instantiates a new Pledges.
   *
   * @param amount the amount
   */
  public Pledges(Integer amount) {
    super(amount);
  }

  /**
   * Change donation date.
   *
   * @param localDate the local date
   */
  public void changeDonationDate(LocalDate localDate) {
    if (this.donationDate == null && localDate.isAfter(localDate.now())) {
      this.donationDate = localDate;
    } else if (localDate.isAfter(localDate.now()) && localDate.now().isBefore(this.donationDate)) {
      this.donationDate = localDate;
    }
    return;
  }

  @Override
  public Integer getExpectedDonation(Integer year) {
    if (this.donationDate == null) {
      return 0;
    } else if (this.donationDate.getYear() == year) {
      return this.getAmount();
    } else {
      return 0;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    Pledges pledges = (Pledges) o;

    if (donationDate == null || pledges.donationDate == null) {
      return donationDate == null && pledges.donationDate == null;
    }
    return donationDate.equals(pledges.donationDate);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    if (donationDate == null) {
      return result;
    }
    result = 31 * result + donationDate.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Pledges{" + super.toString() +
        ", donationDate=" + donationDate +
        '}';
  }
}

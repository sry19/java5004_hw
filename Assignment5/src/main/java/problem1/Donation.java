package problem1;

import java.time.LocalDate;

/**
 * The type Donation.
 */
public abstract class Donation implements IDonation {

  private Integer amount;
  private LocalDate localDate;

  /**
   * Instantiates a new Donation.
   *
   * @param amount    the amount
   * @param localDate the local date
   */
  public Donation(Integer amount, LocalDate localDate) {
    this.amount = amount;
    this.localDate = localDate;
  }

  /**
   * Instantiates a new Donation.
   *
   * @param amount the amount
   */
  public Donation(Integer amount) {
    this.amount = amount;
    this.localDate = LocalDate.now();
  }

  /**
   * Gets amount.
   *
   * @return the amount
   */
  public Integer getAmount() {
    return this.amount;
  }

  /**
   * Gets local date.
   *
   * @return the local date
   */
  public LocalDate getLocalDate() {
    return this.localDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Donation donation = (Donation) o;

    if (!amount.equals(donation.amount)) {
      return false;
    }
    return localDate.equals(donation.getLocalDate());
  }

  @Override
  public int hashCode() {
    int result = amount.hashCode();
    result = 31 * result + localDate.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Donation{" +
        "amount=" + amount +
        ", localDate=" + localDate +
        '}';
  }
}

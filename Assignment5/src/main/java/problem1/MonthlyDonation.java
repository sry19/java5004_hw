package problem1;

import java.time.LocalDate;
import java.time.Period;
import jdk.vm.ci.meta.Local;

/**
 * The type Monthly donation.
 */
public class MonthlyDonation extends Donation {

  private LocalDate cancellationDate;
  private static final Integer NUM_OF_MONTH = 12;

  /**
   * Instantiates a new Monthly donation.
   *
   * @param amount    the amount
   * @param localDate the local date
   */
  public MonthlyDonation(Integer amount, LocalDate localDate) {
    super(amount, localDate);
  }

  /**
   * Instantiates a new Monthly donation.
   *
   * @param amount the amount
   */
  public MonthlyDonation(Integer amount) {
    super(amount);
  }

  /**
   * Sets cancellation date.
   *
   * @param localDate the local date
   * @throws InvalidDateException the invalid date exception
   */
  public void setCancellationDate(LocalDate localDate) throws InvalidDateException {
    if (localDate.compareTo(localDate.now()) < 0 || localDate.isBefore(this.getLocalDate())) {
      throw new InvalidDateException();
    }
    this.cancellationDate = localDate;
  }

  /**
   * Gets cancellation date.
   *
   * @return the cancellation date
   */
  public LocalDate getCancellationDate() {
    return this.cancellationDate;
  }

  @Override
  public Integer getExpectedDonation(Integer year) {
    if (this.cancellationDate == null) {
      if (this.getLocalDate().getYear() < year) {
        return NUM_OF_MONTH * this.getAmount();
      } else if (this.getLocalDate().getYear() == year) {
        return this.getAmount() * (NUM_OF_MONTH - this.getLocalDate().getMonth().getValue() + 1);
      } else {
        return 0;
      }
    }
    if (this.cancellationDate.getYear() < year || this.getLocalDate().getYear() > year) {
      return 0;
    } else if (this.cancellationDate.getYear() > year && this.getLocalDate().getYear() == year) {
      return this.getAmount() * (NUM_OF_MONTH - this.getLocalDate().getMonth().getValue() + 1);
    } else if (this.cancellationDate.getYear() > year && this.getLocalDate().getYear() < year) {
      return NUM_OF_MONTH * this.getAmount();
    } else {
      if (this.getLocalDate().getYear() == year) {
        return this.getAmount() * (this.getLocalDate().until(this.cancellationDate).getMonths()
            + 1);
      } else {
        return this.getAmount() * (this.cancellationDate.getMonth().getValue());
      }
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

    MonthlyDonation that = (MonthlyDonation) o;

    if (cancellationDate == null || that.cancellationDate == null) {
      return (cancellationDate == null && that.cancellationDate == null);
    }
    return cancellationDate.equals(that.cancellationDate);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    if (cancellationDate == null) {
      return result;
    }
    result = 31 * result + cancellationDate.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "MonthlyDonation{" + super.toString() +
        ", cancellationDate=" + cancellationDate +
        '}';
  }
}

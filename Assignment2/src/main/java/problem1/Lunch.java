package problem1;

import java.lang.Math;
import java.util.Objects;

/**
 * The type Lunch.
 */
public class Lunch extends Event {

  private long sandwiches;
  private static final double RATE = 1.05;
  private static final int MAX_LUNCH = 90;
  private static final int MIN_LUNCH = 15;

  /**
   * constructor that creates a lunch event
   *
   * @param clientName     the name of the client
   * @param numOfAttendees the number of attendees
   * @throws IllegalArgumentException invalid input exception
   */
  public Lunch(String clientName, int numOfAttendees) throws IllegalArgumentException {
    super(clientName, numOfAttendees);
    if (this.getNumOfAttendees() >= MIN_LUNCH && this.getNumOfAttendees() <= MAX_LUNCH) {
      this.sandwiches = Math.round(RATE * this.getNumOfAttendees());
    } else {
      throw new IllegalArgumentException("message, if appropriate");
    }
  }

  /**
   * return the number of sandwiches
   *
   * @return the number of sandwiches
   */
  public long getSandwiches() {
    return this.sandwiches;
  }

  /**
   * overrides the equals method
   *
   * @param o an object
   * @return true if they are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lunch lunch = (Lunch) o;
    return sandwiches == lunch.sandwiches && this.getNumOfAttendees() == lunch.getNumOfAttendees()
        && this.getClientName() == lunch.getClientName();
  }

  /**
   * overrides the hashcode method
   *
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(sandwiches, this.getClientName(), this.getNumOfAttendees());
  }
}

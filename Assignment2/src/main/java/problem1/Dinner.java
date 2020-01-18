package problem1;

import java.lang.Math;
import java.util.Objects;

/**
 * The type Dinner.
 */
public class Dinner extends Event {

  private long nonVegetarian;
  private long vegetarian;
  private static final double NOVEG_RATE = 0.8;
  private static final double VEG_RATE = 0.2;
  private static final int MAX_DINNER = 50;
  private static final int MIN_DINNER = 10;

  /**
   * constructor that creates a dinner event
   *
   * @param clientName     the name of the client
   * @param numOfAttendees the number of attendees
   * @throws IllegalArgumentException invalid input exception
   */
  public Dinner(String clientName, int numOfAttendees) throws IllegalArgumentException {
    super(clientName, numOfAttendees);
    if (numOfAttendees >= MIN_DINNER && numOfAttendees <= MAX_DINNER) {
      this.nonVegetarian = Math.round(NOVEG_RATE * numOfAttendees);
      this.vegetarian = Math.round(VEG_RATE * numOfAttendees);
    } else {
      throw new IllegalArgumentException("message, if appropriate");
    }
  }

  /**
   * return the number of non-vegetarian
   *
   * @return the number of non-vegetarian
   */
  public long getNonVegetarian() {
    return this.nonVegetarian;
  }

  /**
   * return the number of vegetarian
   *
   * @return the number of vegetarian
   */
  public long getVegetarian() {
    return this.vegetarian;
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
    Dinner dinner = (Dinner) o;
    return this.nonVegetarian == dinner.nonVegetarian &&
        this.vegetarian == dinner.vegetarian && dinner.getClientName() == this.getClientName() &&
        dinner.getNumOfAttendees() == this.getNumOfAttendees();
  }

  /**
   * overrides the hashcode method
   *
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.nonVegetarian, this.vegetarian, this.getClientName(),
        this.getNumOfAttendees());
  }
}

package problem1;

import java.lang.Math;

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
}

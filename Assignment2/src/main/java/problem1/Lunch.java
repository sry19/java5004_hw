package problem1;

import java.lang.Math;

public class Lunch extends Event{
  private long sandwiches;
  private static final double RATE = 1.05;
  private static final int MAX_LUNCH = 90;
  private static final int MIN_LUNCH = 15;

  /**
   * constructor that creates a lunch event
   * @param clientName the name of the client
   * @param numOfAttendees the number of attendees
   * @throws IllegalArgumentException
   */
  public Lunch(String clientName, int numOfAttendees) throws IllegalArgumentException {
    super(clientName, numOfAttendees);
    if (this.getNumOfAttendees() >= MIN_LUNCH && this.getNumOfAttendees() <= MAX_LUNCH) {
      this.sandwiches = Math.round(RATE * this.getNumOfAttendees());
    }
    else {
      throw new IllegalArgumentException("message, if appropriate");
    }
  }

  /**
   * return the number of sandwiches
   * @return the number of sandwiches
   */
  public long getSandwiches() {
    return this.sandwiches;
  }



}

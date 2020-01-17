package problem1;

/**
 * a class representing an event
 */
public class Event {

  private String clientName;
  private int numOfAttendees;

  /**
   * constructor that creates an event
   *
   * @param clientName     the name of the client
   * @param numOfAttendees the number of attendees
   */
  public Event(String clientName, int numOfAttendees) {
    this.clientName = clientName;
    this.numOfAttendees = numOfAttendees;
  }

  /**
   * return the name of the client
   *
   * @return the name of the client
   */
  public String getClientName() {
    return this.clientName;
  }

  /**
   * return the number of attendees
   *
   * @return the number of attendees
   */
  public int getNumOfAttendees() {
    return this.numOfAttendees;
  }


}

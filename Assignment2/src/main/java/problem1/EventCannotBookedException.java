package problem1;

/**
 * The type Event cannot be booked exception.
 */
public class EventCannotBookedException extends Exception {

  /**
   * Instantiates a new Event cannot be booked exception.
   */
  public EventCannotBookedException() {
    super("The event cannot be added");
  }

}

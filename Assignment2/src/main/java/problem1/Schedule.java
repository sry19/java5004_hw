package problem1;

/**
 * The type Schedule.
 */
public class Schedule {

  private boolean lunchBooked;
  private boolean dinnerBooked;
  private Lunch lunch;
  private Dinner dinner;

  /**
   * constructor that creates a schedule
   */
  public Schedule() {
    this.lunch = null;
    this.dinner = null;
    this.lunchBooked = false;
    this.dinnerBooked = false;
  }

  /**
   * books a lunch event
   *
   * @param lunch a lunch event
   * @throws EventCannotBookedException the event cannot booked exception
   */
  public void bookingLunch(Lunch lunch) throws EventCannotBookedException {
    if (!this.lunchBooked) {
      this.lunchBooked = true;
      this.lunch = lunch;
    } else {
      throw new EventCannotBookedException();
    }
  }

  /**
   * books a dinner event
   *
   * @param dinner a dinner event
   * @throws EventCannotBookedException the event cannot booked exception
   */
  public void bookingDinner(Dinner dinner) throws EventCannotBookedException {
    if (!this.dinnerBooked) {
      this.dinnerBooked = true;
      this.dinner = dinner;
    } else {
      throw new EventCannotBookedException();
    }
  }

  /**
   * Gets lunch booked.
   *
   * @return the lunch booked
   */
  public boolean getLunchBooked() {
    return this.lunchBooked;
  }

  /**
   * Gets dinner booked.
   *
   * @return the dinner booked
   */
  public boolean getDinnerBooked() {
    return this.dinnerBooked;
  }

  /**
   * Gets lunch.
   *
   * @return the lunch
   * @throws NoEventException the no event exception
   */
  public Lunch getLunch() throws NoEventException {
    if (this.lunchBooked) {
      return this.lunch;
    } else {
      throw new NoEventException();
    }
  }

  /**
   * Gets dinner.
   *
   * @return the dinner
   * @throws NoEventException the no event exception
   */
  public Dinner getDinner() throws NoEventException {
    if (this.dinnerBooked) {
      return this.dinner;
    } else {
      throw new NoEventException();
    }
  }
}

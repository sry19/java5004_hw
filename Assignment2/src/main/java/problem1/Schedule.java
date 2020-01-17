package problem1;

public class Schedule {
  private boolean lunchBooked;
  private boolean dinnerBooked;
  private Lunch lunch;
  private Dinner dinner;

  /**
   * constructor that creates a schedule
   */
  public Schedule () {
  }

  /**
   * books a lunch event
   * @param lunch a lunch event
   * @throws IllegalArgumentException
   */
  public void bookingLunch(Lunch lunch) throws IllegalArgumentException{
    if (!this.lunchBooked) {
      this.lunch = lunch;
    }
    else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }

  /**
   * books a dinner event
   * @param dinner a dinner event
   * @throws IllegalArgumentException
   */
  public void bookingDinner(Dinner dinner) throws IllegalArgumentException{
    if (!this.dinnerBooked) {
      this.dinner = dinner;
    }
    else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }

  /**
   * return the updated schedule
   * @param e an event
   * @throws IllegalArgumentException
   */
  public void updateSchedule(Object e) throws IllegalArgumentException{
    if (!this.lunchBooked && e.getClass() == lunch.getClass()) {
      this.lunchBooked = true;
      this.lunch = (Lunch) e;
    }
    else if (!this.dinnerBooked && e.getClass() == dinner.getClass()) {
      this.dinnerBooked = true;
      this.dinner = (Dinner) e;
    }
    else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }
}

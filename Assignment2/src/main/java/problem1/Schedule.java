package problem1;

public class Schedule {

  private boolean lunchBooked;
  private boolean dinnerBooked;
  private Lunch lunch;
  private Dinner dinner;

//  /**
//   * constructor that creates a schedule
//   */
//  public Schedule() {
//    this.lunch = new Lunch("empty", 15);
//    this.dinner = new Dinner("empty", 10);
//  }

  /**
   * books a lunch event
   *
   * @param lunch a lunch event
   * @throws IllegalArgumentException invalid input exception
   */
  public void bookingLunch(Lunch lunch) throws IllegalArgumentException {
    if (!this.lunchBooked) {
      this.lunchBooked = true;
      this.lunch = lunch;
    } else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }

  /**
   * books a dinner event
   *
   * @param dinner a dinner event
   * @throws IllegalArgumentException invalid input exception
   */
  public void bookingDinner(Dinner dinner) throws IllegalArgumentException {
    if (!this.dinnerBooked) {
      this.dinnerBooked = true;
      this.dinner = dinner;
    } else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }

  /**
   * return the updated schedule
   *
   * @param e an event
   * @throws IllegalArgumentException invalid input exception
   */
  public void updateSchedule(Object e) throws IllegalArgumentException {
    if (!this.lunchBooked && e.getClass() == lunch.getClass()) {
      this.lunchBooked = true;
      this.lunch = (Lunch) e;
    } else if (!this.dinnerBooked && e.getClass() == dinner.getClass()) {
      this.dinnerBooked = true;
      this.dinner = (Dinner) e;
    } else {
      throw new IllegalArgumentException("This event cannot be added to the schedule");
    }
  }

  public boolean isLunchBooked() {
    return this.lunchBooked;
  }

  public boolean isDinnerBooked() {
    return this.dinnerBooked;
  }

  public Lunch getLunch() throws IllegalArgumentException{
    if (lunchBooked) {
      return this.lunch;
    }
    else {
      throw new IllegalArgumentException("Lunch event is not booked");
    }
  }

  public Dinner getDinner() throws IllegalArgumentException{
    if (dinnerBooked) {
      return this.dinner;
    }
    else{
      throw new IllegalArgumentException("Dinner event is not booked");
    }
  }
}

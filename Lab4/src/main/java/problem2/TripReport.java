package problem2;

/**
 * The type Trip report.
 */
public class TripReport {

  private Vehicle vehicle;
  private Float speed;
  private Float distance;
  private Integer tripDuration;

  /**
   * Instantiates a new Trip report.
   *
   * @param vehicle      the vehicle
   * @param speed        the speed
   * @param distance     the distance
   * @param tripDuration the trip duration
   */
  public TripReport(Vehicle vehicle, Float speed, Float distance, Integer tripDuration) {
    this.vehicle = vehicle;
    this.speed = speed;
    this.distance = distance;
    this.tripDuration = tripDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TripReport that = (TripReport) o;

    if (!vehicle.equals(that.vehicle)) {
      return false;
    }
    if (!speed.equals(that.speed)) {
      return false;
    }
    if (!distance.equals(that.distance)) {
      return false;
    }
    return tripDuration.equals(that.tripDuration);
  }

  @Override
  public int hashCode() {
    int result = vehicle.hashCode();
    result = 31 * result + speed.hashCode();
    result = 31 * result + distance.hashCode();
    result = 31 * result + tripDuration.hashCode();
    return result;
  }
}

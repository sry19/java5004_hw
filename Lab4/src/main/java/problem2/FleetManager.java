package problem2;

/**
 * The type Fleet manager.
 */
public class FleetManager {

  /**
   * Instantiates a new Fleet manager.
   */
  public FleetManager() {
  }

  /**
   * Drive trip report.
   *
   * @param vehicle the vehicle
   * @return the trip report
   */
  public TripReport drive(AbstractVehicle vehicle) {
    TripReport tripReport = new TripReport(vehicle, vehicle.getAverageSpeed(), (float) 3.0,
        Math.round((float) 3.0 / vehicle.getAverageSpeed()));
    return tripReport;
  }

  /**
   * Drive trip report.
   *
   * @param distance the distance
   * @param vehicle  the vehicle
   * @return the trip report
   */
  public TripReport drive(float distance, AbstractVehicle vehicle) {
    TripReport tripReport = new TripReport(vehicle, vehicle.getAverageSpeed(), distance,
        Math.round(distance / vehicle.getAverageSpeed()));
    return tripReport;
  }

  /**
   * Drive trip report.
   *
   * @param distance the distance
   * @param vehicle  the vehicle
   * @param duration the duration
   * @return the trip report
   */
  public TripReport drive(float distance, AbstractVehicle vehicle, Integer duration) {
    TripReport tripReport = new TripReport(vehicle, vehicle.getAverageSpeed(), distance, duration);
    return tripReport;
  }

  /**
   * Drive trip report.
   *
   * @param distance the distance
   * @param vehicle  the vehicle
   * @param duration the duration
   * @param speed    the speed
   * @return the trip report
   */
  public TripReport drive(float distance, AbstractVehicle vehicle, Integer duration, float speed) {
    if (speed > vehicle.getMaxSpeed()) {
      speed = vehicle.getMaxSpeed();
    }
    TripReport tripReport = new TripReport(vehicle, speed, distance, duration);
    return tripReport;
  }
}

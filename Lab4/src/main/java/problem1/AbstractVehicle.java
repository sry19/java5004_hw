package problem1;

/**
 * The type Abstract vehicle.
 */
public abstract class AbstractVehicle implements Vehicle {

  private String id;
  private Float averageSpeed;
  private Float maxSpeed;

  /**
   * Instantiates a new Abstract vehicle.
   *
   * @param id           the id
   * @param averageSpeed the average speed
   * @param maxSpeed     the max speed
   */
  public AbstractVehicle(String id, Float averageSpeed, Float maxSpeed) {
    this.id = id;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets average speed.
   *
   * @return the average speed
   */
  public Float getAverageSpeed() {
    return this.averageSpeed;
  }

  /**
   * Gets max speed.
   *
   * @return the max speed
   */
  public Float getMaxSpeed() {
    return this.maxSpeed;
  }

}

package problem1;

/**
 * The type Abstract service.
 */
public abstract class AbstractService implements Service {

  private static final Integer MIN_VAL = 0;
  private String address;
  private PropertySize size;
  private boolean carryOutMonthly;
  private Integer preCarryOutTimes;
  private Integer baseRate;
  private Integer pets;
  private Integer floors;
  private Integer extraFee;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   */
  public AbstractService(String address, PropertySize size, boolean carryOutMonthly, Integer pets, Integer floors) {
    this.address = address;
    this.size = size;
    this.carryOutMonthly = carryOutMonthly;
    this.baseRate = MIN_VAL;
    this.extraFee = MIN_VAL;
    this.preCarryOutTimes = MIN_VAL;
    this.pets = isValidPets(pets);
    this.floors = isValidFloors(floors);
  }

  private Integer isValidPets(Integer pets) {
    if (pets < MIN_VAL) {
      return MIN_VAL;
    }
    else {
      return pets;
    }
  }

  private Integer isValidFloors(Integer floors) {
    final Integer MIN_FLOOR = 1;
    if (floors < MIN_FLOOR) {
      return MIN_FLOOR;
    }
    else {
      return floors;
    }
  }

  public Integer getPets() {
    return this.pets;
  }

  public Integer getFloors() {
    return this.floors;
  }

  public Integer getExtraFee() {
    return this.extraFee;
  }

  public void setExtraFee(Integer extraFee) {
    this.extraFee = extraFee;
  }

  /**
   * sets the base rate
   *
   * @param baseRate the base rate
   */
  public void setBaseRate(Integer baseRate) {
    this.baseRate = baseRate;
  }

  /**
   * Sets the number of services previously carried out at the address
   *
   * @param preCarryOutTimes The number of services previously carried out at the address
   */
  public void setPreCarryOutTimes(Integer preCarryOutTimes) {
    this.preCarryOutTimes = preCarryOutTimes;
  }

  /**
   * Gets address.
   *
   * @return the address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * Gets size.
   *
   * @return the size
   */
  public PropertySize getSize() {
    return this.size;
  }

  /**
   * Is carry out monthly boolean.
   *
   * @return the boolean
   */
  public boolean isCarryOutMonthly() {
    return this.carryOutMonthly;
  }

  /**
   * Gets pre carry out times.
   *
   * @return the pre carry out times
   */
  public Integer getPreCarryOutTimes() {
    return this.preCarryOutTimes;
  }

  /**
   * Gets base rate.
   *
   * @return the base rate
   */
  public Integer getBaseRate() {
    return this.baseRate;
  }

}

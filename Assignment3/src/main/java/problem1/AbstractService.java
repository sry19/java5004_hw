package problem1;

import java.util.Objects;

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
   * @param pets            the pets
   * @param floors          the floors
   */
  public AbstractService(String address, PropertySize size, boolean carryOutMonthly, Integer pets,
      Integer floors) {
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
    } else {
      return pets;
    }
  }

  private Integer isValidFloors(Integer floors) {
    final Integer MIN_FLOOR = 1;
    if (floors < MIN_FLOOR) {
      return MIN_FLOOR;
    } else {
      return floors;
    }
  }

  /**
   * Gets pets.
   *
   * @return the pets
   */
  public Integer getPets() {
    return this.pets;
  }

  /**
   * Gets floors.
   *
   * @return the floors
   */
  public Integer getFloors() {
    return this.floors;
  }

  /**
   * Gets extra fee.
   *
   * @return the extra fee
   */
  public Integer getExtraFee() {
    return this.extraFee;
  }

  /**
   * Sets extra fee.
   *
   * @param extraFee the extra fee
   */
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }
    AbstractService service = (AbstractService) o;
    return (this.getAddress() == service.getAddress() && this.getSize() == service.getSize()
        && this.isCarryOutMonthly() == service.isCarryOutMonthly()
        && this.getPets() == service.getPets() && this.getPreCarryOutTimes() == service
        .getPreCarryOutTimes() && this.getFloors() == service.getFloors());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(this.getAddress(), this.getSize(), this.isCarryOutMonthly(), this.getPets(),
            this.getPreCarryOutTimes(), this.getFloors());
  }

  @Override
  public String toString() {
    return "Service { Address = " + this.getAddress() + ", Size = " + this.getSize()
        + ", CarryOutMonthly = " + this.isCarryOutMonthly() + ", Pets = " + this.getPets()
        + ", Previous services = " + this.getPreCarryOutTimes() + ", Floors = " + this.getFloors()
        + "}";
  }

}

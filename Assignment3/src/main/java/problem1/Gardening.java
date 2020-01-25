package problem1;

import java.util.Objects;

/**
 * The type Gardening.
 */
public class Gardening extends AbstractExterior{

  private static final Integer WASTE_REMOVAL_FEE = 20;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public Gardening(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
    this.setExtraFee(WASTE_REMOVAL_FEE);
  }

  /**
   * Calculate the price of the service
   *
   * @return the price of the service
   */
  @Override
  public double calculatePrice() {
    this.updateDiscount();
    return (this.getBaseRate() * this.getHour() + this.getExtraFee()) * this.getDiscount();
  }

  /**
   * Calculate the rate of the extra fee
   */
  @Override
  public void calculateExtraFeeRate() {
    return;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }
    Gardening gardening = (Gardening) o;
    return (this.getAddress() == gardening.getAddress()
        && this.getSize() == gardening.getSize()
        && this.isCarryOutMonthly() == gardening.isCarryOutMonthly()
        && this.getPets() == gardening.getPets()
        && this.getPreCarryOutTimes() == gardening
        .getPreCarryOutTimes() && this.getFloors() == gardening.getFloors());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(this.getAddress(), this.getSize(), this.isCarryOutMonthly(), this.getPets(),
            this.getPreCarryOutTimes(), this.getFloors());
  }

  @Override
  public String toString() {
    return "Gardening { Address = " + this.getAddress() + ", Size = " + this.getSize()
        + ", CarryOutMonthly = " + this.isCarryOutMonthly() + ", Pets = " + this.getPets()
        + "Previous services = " + this.getPreCarryOutTimes() + ", Floors = " + this.getFloors()
        + "}";
  }
}

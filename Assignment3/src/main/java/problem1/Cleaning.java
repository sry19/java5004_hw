package problem1;

import java.util.Objects;

/**
 * The type Cleaning.
 */
public class Cleaning extends AbstractInterior {

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public Cleaning(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }
    Cleaning cleaning = (Cleaning) o;
    return (this.getAddress() == cleaning.getAddress() && this.getSize() == cleaning.getSize()
        && this.isCarryOutMonthly() == cleaning.isCarryOutMonthly()
        && this.getPets() == cleaning.getPets() && this.getPreCarryOutTimes()==cleaning.getPreCarryOutTimes());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(this.getAddress(), this.getSize(), this.isCarryOutMonthly(), this.getPets(),this.getPreCarryOutTimes());
  }

  @Override
  public String toString() {
    return "Cleaning { Address = " + this.getAddress() + ", Size = " + this.getSize()
        + ", CarryOutMonthly = " + this.isCarryOutMonthly() + ", Pets = " + this.getPets()
        + "Previous services = " + this.getPreCarryOutTimes() + "}";
  }
}

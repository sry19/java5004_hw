package problem1;

import java.util.Objects;

/**
 * The type Painting.
 */
public class Painting extends AbstractInterior {

  private static final Integer INI_VAL_INT = 0;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public Painting(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
    this.setHour(this.calculateHour());
  }

  /**
   * calculates the hours needed
   *
   * @return the hours needed
   */
  @Override
  public Integer calculateHour() {
    final Integer S_ONE_HOUR = 16;
    final Integer M_TWO_HOUR = 16;
    final Integer L_FOUR_HOUR = 24;

    switch (this.getSize()) {
      case SMALL:
        return S_ONE_HOUR;
      case MEDIUM:
        return M_TWO_HOUR;
      case LARGE:
        return L_FOUR_HOUR;
    }
    return INI_VAL_INT;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }
    Painting painting = (Painting) o;
    return (this.getAddress() == painting.getAddress() && this.getSize() == painting.getSize()
        && this.isCarryOutMonthly() == painting.isCarryOutMonthly()
        && this.getPets() == painting.getPets() && this.getPreCarryOutTimes() == painting
        .getPreCarryOutTimes());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(this.getAddress(), this.getSize(), this.isCarryOutMonthly(), this.getPets(),
            this.getPreCarryOutTimes());
  }

  @Override
  public String toString() {
    return "Painting { Address = " + this.getAddress() + ", Size = " + this.getSize()
        + ", CarryOutMonthly = " + this.isCarryOutMonthly() + ", Pets = " + this.getPets()
        + "Previous services = " + this.getPreCarryOutTimes() + "}";
  }
}

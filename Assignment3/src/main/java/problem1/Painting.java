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
  public String toString() {
    return "Painting {" + super.toString() + "}";
  }
}

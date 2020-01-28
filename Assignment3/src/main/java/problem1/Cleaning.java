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
  public String toString() {
    return "Cleaning {" + super.toString() + "}";
  }
}

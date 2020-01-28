package problem1;

import java.util.Objects;

/**
 * The type Plumbing.
 */
public class Plumbing extends AbstractSpecialistService {

  private static final Integer PERMITTING_FEE = 20;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   * @param employees       the number of employees
   * @param complex         true if it is complex, false otherwise
   */
  public Plumbing(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors, Integer employees, boolean complex) {
    super(address, size, carryOutMonthly, pets, floors, employees, complex);
    this.setExtraFee(PERMITTING_FEE);
  }

  /**
   * Calculate the price of the service
   *
   * @return the price of the service
   */
  @Override
  public double calculatePrice() {
    return this.getBaseRate() * this.getEmployees() + this.getExtraFee();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Plumbing {" + super.toString() + "}";
  }
}

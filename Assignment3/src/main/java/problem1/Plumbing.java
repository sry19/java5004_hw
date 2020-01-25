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
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }
    Plumbing plumbing = (Plumbing) o;
    return (this.getAddress() == plumbing.getAddress()
        && this.getSize() == plumbing.getSize()
        && this.isCarryOutMonthly() == plumbing.isCarryOutMonthly()
        && this.getPets() == plumbing.getPets()
        && this.getPreCarryOutTimes() == plumbing
        .getPreCarryOutTimes() && this.getFloors() == plumbing.getFloors()
        && this.getEmployees() == plumbing.getEmployees() && this.isComplex() == plumbing
        .isComplex());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(this.getAddress(), this.getSize(), this.isCarryOutMonthly(), this.getPets(),
            this.getPreCarryOutTimes(), this.getFloors(), this.isComplex(), this.getEmployees());
  }

  @Override
  public String toString() {
    return "Plumbing { Address = " + this.getAddress() + ", Size = " + this.getSize()
        + ", CarryOutMonthly = " + this.isCarryOutMonthly() + ", Pets = " + this.getPets()
        + "Previous services = " + this.getPreCarryOutTimes() + ", Floors = " + this.getFloors()
        + ", isComplex = " + this.isComplex() + ", Employees = " + this.getEmployees() + "}";
  }
}

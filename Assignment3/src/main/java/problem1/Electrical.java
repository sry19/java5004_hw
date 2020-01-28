package problem1;

import java.util.Objects;

/**
 * The type Electrical.
 */
public class Electrical extends AbstractSpecialistService {

  private static final Integer PERMITTING_FEE = 50;
  private static final Integer MAX_EMPLOYEE = 4;

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
   * @throws EmployeeExceedException the employee exceed exception
   */
  public Electrical(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors, Integer employees, boolean complex)
      throws EmployeeExceedException {
    super(address, size, carryOutMonthly, pets, floors, employees, complex);
    if (this.getEmployees() > MAX_EMPLOYEE) {
      throw new EmployeeExceedException();
    }
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
  public String toString() {
    return "Electrical {" + super.toString() + "}";
  }

}

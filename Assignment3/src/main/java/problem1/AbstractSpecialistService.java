package problem1;

import java.util.Objects;

/**
 * The type Abstract specialist service.
 */
public abstract class AbstractSpecialistService extends AbstractService {

  private static final Integer BASE_RATE = 200;
  private boolean complex;
  private Integer employees;

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
  public AbstractSpecialistService(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors,
      Integer employees, boolean complex) {
    super(address, size, carryOutMonthly, pets, floors);
    this.complex = complex;
    this.employees = this.isValidEmployee(employees);
    this.setBaseRate(BASE_RATE);
  }

  private Integer isValidEmployee(Integer employees) {
    final Integer MIN_EMPLOYEE = 1;
    final Integer S_M_MIN_EMPLOYEE = 2;
    final Integer L_MIN_EMPLOYEE = 3;
    if (this.complex) {
      if (this.getSize() == PropertySize.SMALL || this.getSize() == PropertySize.MEDIUM) {
        return Math.max(employees, S_M_MIN_EMPLOYEE);
      } else if (this.getSize() == PropertySize.LARGE) {
        return Math.max(employees, L_MIN_EMPLOYEE);
      }
    }
    if (employees < MIN_EMPLOYEE) {
      return MIN_EMPLOYEE;
    } else {
      return employees;
    }
  }

  /**
   * Is complex boolean.
   *
   * @return the boolean
   */
  public boolean isComplex() {
    return this.complex;
  }

  /**
   * Gets employees.
   *
   * @return the employees
   */
  public Integer getEmployees() {
    return this.employees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    AbstractSpecialistService that = (AbstractSpecialistService) o;

    if (complex != that.complex) {
      return false;
    }
    return employees.equals(that.employees);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (complex ? 1 : 0);
    result = 31 * result + employees.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Specialist Service {" + super.toString()
        + ", isComplex = " + this.complex + ", Employees = " + this.employees + "}";
  }

}

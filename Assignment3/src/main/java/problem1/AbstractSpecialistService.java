package problem1;

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
   * @param employees       the number of employees
   * @param complex         true if it is complex, false otherwise
   */
  public AbstractSpecialistService(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors,
      Integer employees, boolean complex) {
    super(address, size, carryOutMonthly, pets, floors);
    this.complex = true;
    this.employees = this.isValidEmployee(employees);
    this.setBaseRate(BASE_RATE);
  }

  private Integer isValidEmployee(Integer employees) {
    final Integer MIN_EMPLOYEE = 1;
    if (employees < MIN_EMPLOYEE) {
      return MIN_EMPLOYEE;
    } else {
      return employees;
    }
  }

  public boolean isComplex() {
    return this.complex;
  }

  public Integer getEmployees() {
    return this.employees;
  }

  public void setEmployees(Integer employees) {
    this.employees = employees;
  }
}

package problem1;

/**
 * The type Employee exceed exception.
 */
public class EmployeeExceedException extends IllegalArgumentException {

  /**
   * Instantiates a new Employee exceed exception.
   */
  public EmployeeExceedException() {
    super("The number of the employees exceeds the maximum value.");
  }
}

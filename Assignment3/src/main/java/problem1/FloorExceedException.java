package problem1;

/**
 * The type Floor exceed exception.
 */
public class FloorExceedException extends IllegalArgumentException {

  /**
   * Instantiates a new Floor exceed exception.
   */
  public FloorExceedException() {
    super("The number of floors exceeds the maximum value.");
  }
}

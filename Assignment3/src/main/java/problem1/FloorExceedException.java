package problem1;

public class FloorExceedException extends IllegalArgumentException {

  public FloorExceedException() {
    super("The maximum number of floors that the company can work with is 3.");
  }
}

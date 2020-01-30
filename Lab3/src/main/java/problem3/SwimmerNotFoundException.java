package problem3;

public class SwimmerNotFoundException extends IllegalArgumentException {

  public SwimmerNotFoundException() {
    super("SwimmerNotFound");
  }
}

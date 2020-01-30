package problem1;

public class OutOfRangeException extends IllegalArgumentException{
  public OutOfRangeException() {
    super("The input is out of range");
  }
}

package problem2;

/**
 * The type Exceeds dimension exception.
 */
public class ExceedDimensionException extends Exception {

  /**
   * Instantiates a new Exceeds dimension exception.
   */
  public ExceedDimensionException() {
    super("the mail item is bigger than the locker");
  }

}

package problem2;

/**
 * The type Main.
 */
public class Main {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    try {
      HomebakeProcessor processor = new HomebakeProcessor();
      processor.argumentParser(args);
      HomebakeData homebakeData = new HomebakeData(processor.getOperation(), processor.getFormula(),
          processor.getWarningsFlag(), processor.getVerboseFlag(), processor.getDebugFlag());
      System.out.println("success!");
    } catch (InvalidArgumentException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}

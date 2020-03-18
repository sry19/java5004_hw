package problem2;

public class Main {

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

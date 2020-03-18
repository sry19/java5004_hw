package problem2;

/**
 * The type Homebake data.
 */
public class HomebakeData {

  private String operation;
  private String formula;
  private String warningsFlag;
  private String verboseFlag;
  private String debugFlag;

  /**
   * Instantiates a new Homebake data.
   *
   * @param operation    the operation
   * @param formula      the formula
   * @param warningsFlag the warnings flag
   * @param verboseFlag  the verbose flag
   * @param debugFlag    the debug flag
   */
  public HomebakeData(String operation, String formula, String warningsFlag, String verboseFlag,
      String debugFlag) {
    this.operation = operation;
    this.formula = formula;
    this.warningsFlag = warningsFlag;
    this.verboseFlag = verboseFlag;
    this.debugFlag = debugFlag;
  }
}

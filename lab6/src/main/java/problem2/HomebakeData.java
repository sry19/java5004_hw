package problem2;

public class HomebakeData {

  private String operation;
  private String formula;
  private String warningsFlag;
  private String verboseFlag;
  private String debugFlag;

  public HomebakeData(String operation, String formula, String warningsFlag, String verboseFlag, String debugFlag) {
    this.operation = operation;
    this.formula = formula;
    this.warningsFlag = warningsFlag;
    this.verboseFlag = verboseFlag;
    this.debugFlag = debugFlag;
  }
}

package problem2;

public class HomebakeProcessor {
  private String operation;
  private String formula;
  private String warningsFlag;
  private String verboseFlag;
  private String debugFlag;
  private static final int MAX_ARGS = 5;

  public HomebakeProcessor() {
    this.operation = null;
    this.formula = null;
    this.warningsFlag = null;
    this.verboseFlag = null;
    this.debugFlag = null;
  }

  public void argumentParser(String[] args) throws InvalidArgumentException {
    if (args.length > MAX_ARGS) {
      throw new InvalidArgumentException("Invalid number of arguments");
    }
    for (int i=0; i < args.length; i++) {
      if (args[i].equals("-install") || args[i].equals("-uninstall") || args[i].equals("-update")) {
        if (this.operation == null) {
          this.operation = args[i];
        }
        else {
          throw new InvalidArgumentException("Repeated option");
        }
      }
      else if (args[i].equals("-q") && this.warningsFlag == null) {
        this.warningsFlag = "-q";
      }
      else if (args[i].equals("-v") && this.verboseFlag == null) {
        this.verboseFlag = "-v";
      }
      else if (args[i].equals("-d") && this.debugFlag == null) {
        this.debugFlag = "-d";
      }
      else if (this.formula == null) {
        this.formula = args[i];
      }
      else {
        throw new InvalidArgumentException("Option name not found");
      }
    }
    if (this.operation == null || this.formula == null) {
      throw new InvalidArgumentException("Lack required arguments");
    }
  }

  public String getOperation() {
    return operation;
  }

  public String getFormula() {
    return formula;
  }

  public String getWarningsFlag() {
    return warningsFlag;
  }

  public String getVerboseFlag() {
    return verboseFlag;
  }

  public String getDebugFlag() {
    return debugFlag;
  }
}

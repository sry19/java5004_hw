package problem2;

/**
 * The type Homebake processor.
 */
public class HomebakeProcessor {

  private String operation;
  private String formula;
  private String warningsFlag;
  private String verboseFlag;
  private String debugFlag;
  private static final int MAX_ARGS = 5;

  /**
   * Instantiates a new Homebake processor.
   */
  public HomebakeProcessor() {
    this.operation = null;
    this.formula = null;
    this.warningsFlag = null;
    this.verboseFlag = null;
    this.debugFlag = null;
  }

  /**
   * Argument parser.
   *
   * @param args the args
   * @throws InvalidArgumentException the invalid argument exception
   */
  public void argumentParser(String[] args) throws InvalidArgumentException {
    if (args.length > MAX_ARGS) {
      throw new InvalidArgumentException("Invalid number of arguments");
    }
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-install") || args[i].equals("-uninstall") || args[i].equals("-update")) {
        if (this.operation == null) {
          this.operation = args[i];
        } else {
          throw new InvalidArgumentException("Repeated option");
        }
      } else if (args[i].equals("-q") && this.warningsFlag == null) {
        this.warningsFlag = "-q";
      } else if (args[i].equals("-v") && this.verboseFlag == null) {
        this.verboseFlag = "-v";
      } else if (args[i].equals("-d") && this.debugFlag == null) {
        this.debugFlag = "-d";
      } else if (this.formula == null) {
        this.formula = args[i];
      } else {
        throw new InvalidArgumentException("Option name not found");
      }
    }
    if (this.operation == null || this.formula == null) {
      throw new InvalidArgumentException("Lack required arguments");
    }
  }

  /**
   * Gets operation.
   *
   * @return the operation
   */
  public String getOperation() {
    return operation;
  }

  /**
   * Gets formula.
   *
   * @return the formula
   */
  public String getFormula() {
    return formula;
  }

  /**
   * Gets warnings flag.
   *
   * @return the warnings flag
   */
  public String getWarningsFlag() {
    return warningsFlag;
  }

  /**
   * Gets verbose flag.
   *
   * @return the verbose flag
   */
  public String getVerboseFlag() {
    return verboseFlag;
  }

  /**
   * Gets debug flag.
   *
   * @return the debug flag
   */
  public String getDebugFlag() {
    return debugFlag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    HomebakeProcessor processor = (HomebakeProcessor) o;

    if (!operation.equals(processor.operation)) {
      return false;
    }
    if (!formula.equals(processor.formula)) {
      return false;
    }
    if (!warningsFlag.equals(processor.warningsFlag)) {
      return false;
    }
    if (!verboseFlag.equals(processor.verboseFlag)) {
      return false;
    }
    return debugFlag.equals(processor.debugFlag);
  }

  @Override
  public int hashCode() {
    int result = (operation == null ? 0 : operation.hashCode());
    result = 31 * result + (formula == null ? 0 : formula.hashCode());
    result = 31 * result + (warningsFlag == null ? 0 : warningsFlag.hashCode());
    result = 31 * result + (verboseFlag == null ? 0 : verboseFlag.hashCode());
    result = 31 * result + (debugFlag == null ? 0 : debugFlag.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "HomebakeProcessor{" +
        "operation='" + operation + '\'' +
        ", formula='" + formula + '\'' +
        ", warningsFlag='" + warningsFlag + '\'' +
        ", verboseFlag='" + verboseFlag + '\'' +
        ", debugFlag='" + debugFlag + '\'' +
        '}';
  }
}

package reservationsystem.controller.commandlineparser;


import java.util.Arrays;
import java.util.Objects;
import reservationsystem.controller.commandlineparser.exceptions.InvalidOptionException;

/**
 * Default CommandLine Parser.
 */
public class CommandLineParser implements ICommandLineParser {

  private Options options;

  /**
   * Create a new Command Line Parser.
   */
  public CommandLineParser() {
    this.options = new Options();
  }

  /**
   * The main method needed by a command line parser is parse. This method validate the raw command
   * line input, if the input is valid, return a ICommandLine ADT, otherwise print out the error and
   * usage
   *
   * @param options The options for the command line to validate.
   * @param args    the raw command line input.
   * @return a ICommandLine ADT.
   * @throws InvalidOptionException if the current option is not valid.
   */
  @Override
  public ICommandLine parse(Options options, String[] args) {
    this.options = createFromArgs(options, args);
    return new CommandLine(this.options);
  }

  /**
   * Create the options from raw arguments and preset options.
   *
   * @param options the preset options.
   * @param args    the input argument.
   * @return a built options.
   * @throws InvalidOptionException if the current option is not valid.
   */
  private Options createFromArgs(Options options, String[] args) {
    Options newOptions = new Options();
    for (int i = 0; i < args.length; i++) {
      if (!newOptions.hasOption(args[i])) {
        if (!options.hasOption(args[i])) {
          System.out.println(args[i] + " is an invalid option.\n");
          break;
        }
        newOptions.updateOption(options.getOption(args[i]));
      }
      Option curOption = newOptions.getOption(args[i]);
      if (curOption.hasSubArgs() || curOption.hasSubArg()) {
        i += 1;
        if (i < args.length) {
          newOptions.updateOption(curOption.updateValue(args[i]));
        }
      }
    }
    return newOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandLineParser that = (CommandLineParser) o;
    return options.equals(that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    return "CommandLineParser{" +
        "options=" + options +
        '}';
  }
}
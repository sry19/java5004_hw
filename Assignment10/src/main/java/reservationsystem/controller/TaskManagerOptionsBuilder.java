package reservationsystem.controller;

import reservationsystem.controller.commandlineparser.Option;
import reservationsystem.controller.commandlineparser.Options;
import reservationsystem.controller.commandlineparser.exceptions.InvalidSplitterException;
import reservationsystem.controller.commandlineparser.exceptions.OptionExistedException;

public class TaskManagerOptionsBuilder extends Options {

  public static Options build() throws InvalidSplitterException, OptionExistedException {
    Option option1 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    Option option2 = new Option.Builder(OptionConstants.SHOW)
        .addDescription(OptionConstants.SHOW_DES)
        .addRequired(false).addHasSubArg(false).addHasSubArgs(false)
        .build();

    Options options = new Options();
    options.addOption(option1);
    options.addOption(option2);
    return options;
  }
}

package reservationsystem.controller;

import reservationsystem.controller.commandlineparser.Executable;
import reservationsystem.controller.commandlineparser.ICommandLine;

public class TaskManagerExe implements Executable {

  /**
   * Execute according to ICommandLine.
   *
   * @param iCommandLine the provided ICommandLine.
   * @throws Exception if anything goes wrong.
   */
  @Override
  public void execute(ICommandLine iCommandLine, ReservationsService reservationsService) throws Exception {
    if (iCommandLine.hasOption(OptionConstants.RESERVE)) {
      reservationsService.reserve(iCommandLine.getOptionValue(OptionConstants.RESERVE));
    } else if (iCommandLine.hasOption(OptionConstants.SHOW)) {
      reservationsService.show();
    }
  }
}

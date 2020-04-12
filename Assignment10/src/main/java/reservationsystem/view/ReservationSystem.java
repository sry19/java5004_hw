package reservationsystem.view;


import java.util.Scanner;
import reservationsystem.controller.ReservationsService;
import reservationsystem.controller.TaskManagerExe;
import reservationsystem.controller.TaskManagerOptionsBuilder;
import reservationsystem.controller.commandlineparser.CommandLineParser;
import reservationsystem.controller.commandlineparser.ICommandLine;
import reservationsystem.controller.commandlineparser.exceptions.InvalidOptionException;
import reservationsystem.controller.commandlineparser.exceptions.InvalidSplitterException;
import reservationsystem.controller.commandlineparser.exceptions.OptionExistedException;
import reservationsystem.model.Theater;

public class ReservationSystem {

  public static void main(String[] args)
      throws Exception {
    CommandLineParser commandLineParser = new CommandLineParser();
    TaskManagerExe taskManagerExe = new TaskManagerExe();
    Theater theater = new Theater("Roxy", 15);
    ReservationsService reservationsService = new ReservationsService(theater);
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to do?");
    String action = scanner.nextLine();

    while (!action.equals("done")) {
      String[] arg = action.split(" ");
      CommandLineParser commandLineParser1 = new CommandLineParser();
      ICommandLine iCommandLine1 = commandLineParser1.parse(TaskManagerOptionsBuilder.build(), arg);
      taskManagerExe.execute(iCommandLine1,reservationsService);
      //reservationsService.performAction(action);
      System.out.println("What would you like to do?");
      scanner = new Scanner(System.in);
      action = scanner.nextLine();

    }
    System.out.println("Have a nice day!");
  }

}

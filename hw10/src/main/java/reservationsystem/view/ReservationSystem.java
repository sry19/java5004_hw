package reservationsystem.view;


import java.util.Scanner;
import reservationsystem.controller.ReservationsService;
import reservationsystem.model.Theater;

public class ReservationSystem {

  public static void main(String[] args) {
    Theater theater = new Theater("Roxy", 15);
    ReservationsService reservationsService = new ReservationsService(theater);
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to do?");
    String action = scanner.nextLine();
    while (!action.equals("done")) {
      reservationsService.performAction(action);
      System.out.println("What would you like to do?");
      scanner = new Scanner(System.in);
      action = scanner.nextLine();
    }
    System.out.println("Have a nice day!");
  }

}

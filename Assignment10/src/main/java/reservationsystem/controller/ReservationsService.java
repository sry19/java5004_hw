package reservationsystem.controller;


import java.util.List;
import java.util.Scanner;
import reservationsystem.model.Row;
import reservationsystem.model.Seat;
import reservationsystem.model.Theater;

public class ReservationsService {

  private Theater theater;
  private Integer numOfRows;
  private Integer center;
  private List<Row> rowList;

  public ReservationsService(Theater theater) {
    this.theater = theater;
    this.rowList = this.theater.getRowList();
    this.numOfRows = theater.getRowList().size();
    this.center = (this.numOfRows) / 2;
  }

  public void reserve(String value) {
    try {
      int number = Integer.parseInt(value);
      if (number <= 0) {
        System.out.println("Sorry, please enter a positive number.");
        return;
      }
      Scanner scanner = new Scanner(System.in);
      System.out.println("Do you need wheelchair accessible seats?");
      String wheelchair = scanner.nextLine();
      if (wheelchair.equals("yes") || wheelchair.equals("Yes")) {
        boolean result = this.reserveWithWheelchairAccess(number);
        if (!result) {
          System.out.println("Sorry, we don’t have that many seats together for you.");
        }
      } else {
        boolean result = this.reserveWithoutWheelchairAccess(number);
        if (!result) {
          boolean anotherResult = this.reserveWithWheelchairAccess(number);
          if (!anotherResult) {
            System.out.println("Sorry, we don’t have that many seats together for you.");
          }
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("Sorry, you must enter a valid number. ");
    }
  }

  private boolean reserveWithoutWheelchairAccess(int number) {
    int offset = 0;
    while (this.center + offset < this.numOfRows || this.center - offset >= 0) {
      if (this.center + offset < this.numOfRows &&
          this.rowList.get(this.center + offset).getNumOfSeats() >= number &&
          !this.rowList.get(this.center + offset).isWheelchairAccessible()) {
        this.reserveSeat(this.center + offset, number);
        return true;
      } else if (this.center - offset >= 0 &&
          this.rowList.get(this.center - offset).getNumOfSeats() >= number &&
          !this.rowList.get(this.center - offset).isWheelchairAccessible()) {
        this.reserveSeat(this.center - offset, number);
        return true;
      }
      offset += 1;
    }
    return false;
  }

  private boolean reserveWithWheelchairAccess(int number) {
    int offset = 0;
    while (this.center + offset < this.numOfRows || this.center - offset >= 0) {
      if (this.center + offset < this.numOfRows &&
          this.rowList.get(this.center + offset).getNumOfSeats() >= number &&
          this.theater.getWheelchairAccessRow().contains(this.center + offset + 1)) {
        this.reserveSeat(this.center + offset, number);
        return true;
      } else if (this.center - offset >= 0 &&
          this.rowList.get(this.center - offset).getNumOfSeats() >= number &&
          this.theater.getWheelchairAccessRow().contains(this.center - offset + 1)) {
        this.reserveSeat(this.center - offset, number);
        return true;
      }
      offset += 1;
    }
    return false;
  }

  public void show() {
    for (Row row: this.rowList) {
      System.out.println(row.toString());
    }
  }

  public void performAction(String input) {
    if (input == null) {
      System.out.println("Please enter a command. Try again please.");
      return;
    }
    String[] args = input.split(" ");
    String action = args[0].trim();
    if (action.equals("reserve")) {
      if (args.length == 2) {
        this.reserve(args[1]);
      } else {
        System.out.println("You enter a invalid command. Try again please.");
      }
    } else if (action.equals("show")) {
      this.show();
    } else {
      System.out.println("You enter a invalid command. Try again please.");
    }
  }

  private void reserveSeat(int row, int number) {
    int availableSeats = this.rowList.get(row).getNumOfSeats();
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name");
    String username = scanner.nextLine();
    int count = 0;
    for (Seat seat : this.rowList.get(row)) {
      if (seat.getReservedFor() == null) {
        seat.setReservedFor(username);
        count += 1;
        if (count == number) {
          break;
        }
      }
    }
    this.rowList.get(row).setNumOfSeats(availableSeats - number);
    System.out.println(String
        .format("I’ve reserved %d seats for you at the %s in row %d, %s.", number,
            this.theater.getName(), row + 1, username));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ReservationsService that = (ReservationsService) o;

    if (!theater.equals(that.theater)) {
      return false;
    }
    if (!numOfRows.equals(that.numOfRows)) {
      return false;
    }
    return rowList.equals(that.rowList);
  }

  @Override
  public int hashCode() {
    int result = theater.hashCode();
    result = 31 * result + numOfRows.hashCode();
    result = 31 * result + center.hashCode();
    result = 31 * result + rowList.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "ReservationsService{" +
        "theater=" + theater +
        ", numOfRows=" + numOfRows +
        ", center=" + center +
        ", rowList=" + rowList +
        '}';
  }
}


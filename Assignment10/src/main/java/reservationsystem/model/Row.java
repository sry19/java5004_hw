package reservationsystem.model;

import java.util.ArrayList;

import java.util.List;


/**
 * The type Row.
 */
public class Row extends ArrayList<Seat> {

  private Integer rowNumber;
  private boolean wheelchairAccessible;
  private Integer numOfSeats;
  private static final int MAX_SEATS = 16;

  /**
   * Instantiates a new Row.
   *
   * @param rowNumber            the row number
   * @param wheelchairAccessible the wheelchair accessible
   */
  public Row(Integer rowNumber, boolean wheelchairAccessible) {
    super(Row.createRow(MAX_SEATS));
    this.rowNumber = rowNumber;
    this.wheelchairAccessible = wheelchairAccessible;
    this.numOfSeats = MAX_SEATS;
  }

  /**
   * Create row list.
   *
   * @param rowNumber the row number
   * @return the list
   */
  public static List<Seat> createRow(int rowNumber) {
    List<Seat> seats = new ArrayList<>();
    for (int i = 0;i<rowNumber;i++) {
      seats.add(new Seat((char) (65 + i),null));
    }
    return seats;
  }

  /**
   * Gets row number.
   *
   * @return the row number
   */
  public Integer getRowNumber() {
    return rowNumber;
  }

  /**
   * Is wheelchair accessible boolean.
   *
   * @return the boolean
   */
  public boolean isWheelchairAccessible() {
    return wheelchairAccessible;
  }

  /**
   * Gets num of seats.
   *
   * @return the num of seats
   */
  public Integer getNumOfSeats() {
    return numOfSeats;
  }

  /**
   * Sets num of seats.
   *
   * @param numOfSeats the num of seats
   */
  public void setNumOfSeats(Integer numOfSeats) {
    this.numOfSeats = numOfSeats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Row row = (Row) o;

    if (wheelchairAccessible != row.wheelchairAccessible) {
      return false;
    }
    if (!rowNumber.equals(row.rowNumber)) {
      return false;
    }
    return numOfSeats.equals(row.numOfSeats);
  }

  /**
   * Sets wheelchair accessible.
   *
   * @param wheelchairAccessible the wheelchair accessible
   */
  public void setWheelchairAccessible(boolean wheelchairAccessible) {
    this.wheelchairAccessible = wheelchairAccessible;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + rowNumber.hashCode();
    result = 31 * result + (wheelchairAccessible ? 1 : 0);
    result = 31 * result + numOfSeats.hashCode();
    return result;
  }

  @Override
  public String toString() {
    String s = String.format(" %2d ",this.rowNumber);
    for (Seat seat: this) {
      s += this.checkToString(seat.toString());
    }
    return s;
  }

  private String checkToString(String original) {
    if (original.equals(" _") && this.wheelchairAccessible) {
      return " =";
    }
    return original;
  }
}

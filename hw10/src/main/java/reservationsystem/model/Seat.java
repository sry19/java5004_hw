package reservationsystem.model;

public class Seat {

  private Character name;
  private String reservedFor;

  public Seat(Character name, String reservedFor) {
    this.name = name;
    this.reservedFor = reservedFor;
  }

  public void setReservedFor(String reservedFor) {
    this.reservedFor = reservedFor;
  }

  public String getReservedFor() {
    return reservedFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Seat seat = (Seat) o;

    if (!name.equals(seat.name)) {
      return false;
    }
    return reservedFor.equals(seat.reservedFor);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + reservedFor.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return reservedFor == null ? " _":" x";
  }
}

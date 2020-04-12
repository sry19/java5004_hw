package reservationsystem.model;

/**
 * The type Seat.
 */
public class Seat {

  private Character name;
  private String reservedFor;

  /**
   * Instantiates a new Seat.
   *
   * @param name        the name
   * @param reservedFor the reserved for
   */
  public Seat(Character name, String reservedFor) {
    this.name = name;
    this.reservedFor = reservedFor;
  }

  /**
   * Sets reserved for.
   *
   * @param reservedFor the reserved for
   */
  public void setReservedFor(String reservedFor) {
    this.reservedFor = reservedFor;
  }

  /**
   * Gets reserved for.
   *
   * @return the reserved for
   */
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
    if (reservedFor == null && seat.reservedFor == null) {
      return true;
    }
    if (reservedFor == null || seat.reservedFor == null) {
      return false;
    }
    return reservedFor.equals(seat.reservedFor);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    if (reservedFor == null) {
      return result;
    }
    result = 31 * result + reservedFor.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return reservedFor == null ? " _":" x";
  }
}

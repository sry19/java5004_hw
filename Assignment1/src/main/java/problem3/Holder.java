package problem3;

/**
 * Holder is a simple object that has a first name and a last name.
 */
public class Holder {

  private String firstName;
  private String lastName;

  /**
   * Constructor that creates a holder
   *
   * @param firstName the holder's first name
   * @param lastName  the holder's last name
   */
  public Holder(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * return the holder's first name
   *
   * @return the holder's first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * return the holder's last name
   *
   * @return the holder's last name
   */
  public String getLastName() {
    return this.lastName;
  }
}

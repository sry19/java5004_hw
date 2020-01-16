/**
 * Represents an Person with their details--first name, last name
 */
public class Person {

  private String firstName;
  private String lastName;

  /**
   * Creates a new person given the author's first name and last name. *
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * return a person's fist name
   *
   * @return a person's fist name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * return a person's last name
   *
   * @return a person's last name
   */
  public String getLastName() {
    return this.lastName;
  }
}

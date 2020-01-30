package problem1;

/**
 * The type Name.
 */
public class Name {
    private String firstName;
    private String lastName;

  /**
   * Instantiates a new Name.
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public Name(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return this.lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Name name = (Name) o;

    if (!firstName.equals(name.firstName)) {
      return false;
    }
    return lastName.equals(name.lastName);
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Name { firstName = " + this.firstName + ", lastName = " + this.lastName + "}" ;
  }
}

package problem2;

/**
 * The type Individual.
 */
public abstract class Individual extends Creators {

  private String firstName;
  private String lastName;

  /**
   * Instantiates a new Individual.
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public Individual(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Individual that = (Individual) o;

    if (!firstName.equals(that.firstName)) {
      return false;
    }
    return lastName.equals(that.lastName);
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Individual{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}

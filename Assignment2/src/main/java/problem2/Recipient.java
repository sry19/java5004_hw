package problem2;

import java.util.Objects;

/**
 * The type Recipient.
 */
public class Recipient {

  private String firstName;
  private String lastName;
  private String emailAddress;

  /**
   * Instantiates a new Recipient.
   *
   * @param firstName    the first name
   * @param lastName     the last name
   * @param emailAddress the email address
   */
  public Recipient(String firstName, String lastName, String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
  }

  /**
   * overrides the equals method
   *
   * @param o an object
   * @return true if they are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return firstName.equals(recipient.firstName) &&
        lastName.equals(recipient.lastName) &&
        emailAddress.equals(recipient.emailAddress);
  }

  /**
   * overrides the hashcode method
   *
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress);
  }
}

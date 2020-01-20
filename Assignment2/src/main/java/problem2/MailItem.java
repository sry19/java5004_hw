package problem2;

import java.util.Objects;

/**
 * The type Mail item.
 */
public class MailItem extends Cube {

  private Recipient recipient;

  /**
   * Instantiates a new Mail item.
   *
   * @param width     the width
   * @param height    the height
   * @param depth     the depth
   * @param recipient the recipient
   * @throws IllegalArgumentException the illegal argument exception
   */
  public MailItem(Integer width, Integer height, Integer depth, Recipient recipient)
      throws IllegalArgumentException {
    super(width, height, depth);
    this.recipient = recipient;
  }

  /**
   * Gets recipient.
   *
   * @return the recipient
   */
  public Recipient getRecipient() {
    return this.recipient;
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
    MailItem mailItem = (MailItem) o;
    return this.getWidth().equals(mailItem.getWidth()) &&
        this.getHeight().equals(mailItem.getHeight()) &&
        this.getDepth().equals(mailItem.getDepth()) &&
        this.recipient.equals(mailItem.recipient);
  }

  /**
   * overrides the hashcode method
   *
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.getWidth(), this.getHeight(), this.getDepth(), this.recipient);
  }
}

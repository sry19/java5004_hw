package problem2;

import java.util.Objects;

/**
 * The type Mail item.
 */
public class MailItem {

  private Integer width;
  private Integer height;
  private Integer depth;
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
    if (isValidInput(width, height, depth)) {
      this.width = width;
      this.height = height;
      this.depth = depth;
      this.recipient = recipient;
    } else {
      throw new IllegalArgumentException("inputs are invalid");
    }
  }

  /**
   * tests if inputs are valid
   *
   * @param width  the width
   * @param height the height
   * @param depth  the depth
   * @return true if inputs are valid, false otherwise
   */
  private boolean isValidInput(Integer width, Integer height, Integer depth) {
    final int MIN_LENGTH = 1;
    if (width >= MIN_LENGTH && height >= MIN_LENGTH && depth >= MIN_LENGTH) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Gets width.
   *
   * @return the width
   */
  public Integer getWidth() {
    return this.width;
  }

  /**
   * Gets height.
   *
   * @return the height
   */
  public Integer getHeight() {
    return this.height;
  }

  /**
   * Gets depth.
   *
   * @return the depth
   */
  public Integer getDepth() {
    return this.depth;
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
    return width.equals(mailItem.width) &&
        height.equals(mailItem.height) &&
        depth.equals(mailItem.depth) &&
        recipient.equals(mailItem.recipient);
  }

  /**
   * overrides the hashcode method
   *
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(width, height, depth, recipient);
  }
}

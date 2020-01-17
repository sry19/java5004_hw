package problem2;

/**
 * The type Locker.
 */
public class Locker {

  private Integer maxWidth;
  private Integer maxHeight;
  private Integer maxDepth;
  private MailItem mailItem;

  /**
   * Instantiates a new Locker.
   *
   * @param maxWidth  the max width
   * @param maxHeight the max height
   * @param maxDepth  the max depth
   */
  public Locker(Integer maxWidth, Integer maxHeight, Integer maxDepth) {
    if (isValidInput(maxWidth, maxHeight, maxDepth)) {
      this.maxWidth = maxWidth;
      this.maxHeight = maxHeight;
      this.maxDepth = maxDepth;
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
   * Add mail.
   *
   * @param mailItem the mail item
   * @throws Exception the exception
   */
  public void addMail(MailItem mailItem) throws Exception {
    if (this.mailItem != null) {
      throw new LockerOccupiedException();
    } else if (mailItem.getWidth() > this.maxWidth || mailItem.getHeight() > this.maxHeight
        || mailItem.getDepth() > this.maxDepth) {
      throw new ExceedDimensionException();
    } else {
      this.mailItem = mailItem;
    }
  }

  /**
   * Pickup mail mail item.
   *
   * @param recipient the recipient
   * @return the mail item
   * @throws MailCannotPickupException the mail cannot be picked up exception
   */
  public MailItem pickupMail(Recipient recipient) throws MailCannotPickupException {
    if (this.mailItem == null || !this.mailItem.getRecipient().equals(recipient)) {
      throw new MailCannotPickupException();
    } else {
      MailItem tmp = this.mailItem;
      this.mailItem = null;
      return tmp;
    }
  }

  /**
   * Gets max width.
   *
   * @return the max width
   */
  public Integer getMaxWidth() {
    return this.maxWidth;
  }

  /**
   * Gets max height.
   *
   * @return the max height
   */
  public Integer getMaxHeight() {
    return this.maxHeight;
  }

  /**
   * Gets max depth.
   *
   * @return the max depth
   */
  public Integer getMaxDepth() {
    return this.maxDepth;
  }

  /**
   * Gets mail item.
   *
   * @return the mail item
   */
  public MailItem getMailItem() {
    return this.mailItem;
  }
}

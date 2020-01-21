package problem2;

/**
 * The type Locker.
 */
public class Locker extends Cube {

  private MailItem mailItem;

  /**
   * Instantiates a new Locker.
   *
   * @param maxWidth  the max width
   * @param maxHeight the max height
   * @param maxDepth  the max depth
   */
  public Locker(Integer maxWidth, Integer maxHeight, Integer maxDepth)
      throws IllegalArgumentException {
    super(maxWidth, maxHeight, maxDepth);
    this.mailItem = null;
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
    } else if (mailItem.getWidth() > this.getMaxWidth() || mailItem.getHeight() > this
        .getMaxHeight()
        || mailItem.getDepth() > this.getMaxDepth()) {
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
    return this.getWidth();
  }

  /**
   * Gets max height.
   *
   * @return the max height
   */
  public Integer getMaxHeight() {
    return this.getHeight();
  }

  /**
   * Gets max depth.
   *
   * @return the max depth
   */
  public Integer getMaxDepth() {
    return this.getDepth();
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

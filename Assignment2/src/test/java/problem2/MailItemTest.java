package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MailItemTest {

  Recipient recipient;
  Recipient recipient1;
  MailItem mailItem;
  MailItem mailItem1;
  MailItem mailItem2;
  MailItem mailItem3;
  MailItem mailItem4;
  MailItem mailItemCopy;

  @Before
  public void setUp() throws Exception {
    recipient = new Recipient("Amy", "Brown", "abc@neu.edu");
    recipient1 = new Recipient("Emma", "Brown", "abc@neu.edu");
    mailItem = new MailItem(3, 4, 5, recipient);
    mailItemCopy = new MailItem(3, 4, 5, recipient);
    mailItem1 = new MailItem(4, 4, 5, recipient);
    mailItem2 = new MailItem(3, 5, 5, recipient);
    mailItem3 = new MailItem(3, 4, 6, recipient);
    mailItem4 = new MailItem(3, 4, 5, recipient1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidWidth() {
    MailItem mailItem1 = new MailItem(0, 4, 5, recipient);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidHeight() {
    MailItem mailItem2 = new MailItem(3, 0, 5, recipient);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidDepth() {
    MailItem mailItem3 = new MailItem(3, 4, 0, recipient);
  }

  @Test
  public void getWidth() {
    assertEquals(Integer.valueOf(3), mailItem.getWidth());
  }

  @Test
  public void getHeight() {
    assertEquals(Integer.valueOf(4), mailItem.getHeight());
  }

  @Test
  public void getDepth() {
    assertEquals(Integer.valueOf(5), mailItem.getDepth());
  }

  @Test
  public void getRecipient() {
    assertEquals(recipient, mailItem.getRecipient());
  }

  @Test
  public void testEquals() {
    assertTrue(mailItem.equals(mailItemCopy));
    assertTrue(mailItem.equals(mailItem));
    assertFalse(mailItem.equals(mailItem1));
    assertFalse(mailItem.equals(mailItem2));
    assertFalse(mailItem.equals(mailItem3));
    assertFalse(mailItem.equals(mailItem4));
    assertFalse(mailItem.equals(recipient));
    assertFalse(mailItem.equals(null));
  }

  @Test
  public void testHashcode() {
    assertEquals(mailItem.hashCode(), mailItemCopy.hashCode());
    assertEquals(mailItem.hashCode(), mailItem.hashCode());
    assertNotEquals(mailItem.hashCode(), mailItem1.hashCode());
    assertNotEquals(mailItem.hashCode(), mailItem2.hashCode());
    assertNotEquals(mailItem.hashCode(), mailItem3.hashCode());
    assertNotEquals(mailItem.hashCode(), mailItem4.hashCode());
  }
}
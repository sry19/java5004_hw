package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LockerTest {

  Recipient recipient;
  Recipient recipient2;
  MailItem mail1;
  MailItem mail2;
  MailItem mail3;
  MailItem mail4;
  Locker locker;
  Locker locker1;

  @Before
  public void setUp() throws Exception {
    recipient = new Recipient("Amy", "Brown", "abc@neu.edu");
    recipient2 = new Recipient("Emma", "Brown", "abc@neu.edu");
    mail1 = new MailItem(1, 1, 1, recipient);
    mail2 = new MailItem(5, 4, 1, recipient2);
    mail3 = new MailItem(2, 8, 1, recipient2);
    mail4 = new MailItem(2, 4, 9, recipient2);
    locker = new Locker(3, 4, 5);
    locker1 = new Locker(3, 4, 5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMaxWidth() {
    Locker locker3 = new Locker(0, 3, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMaxHeight() {
    Locker locker4 = new Locker(3, 0, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidMaxDepth() {
    Locker locker5 = new Locker(3, 3, 0);
  }

  @Test
  public void addMail() throws Exception {
    locker.addMail(mail1);
    assertEquals(mail1, locker.getMailItem());
  }

  @Test(expected = LockerOccupiedException.class)
  public void invalidAddMailLockerOccupied() throws Exception {
    locker.addMail(mail1);
    locker.addMail(mail1);
  }

  @Test(expected = ExceedDimensionException.class)
  public void invalidAddMailExceedDimension() throws Exception {
    locker1.addMail(mail2);
  }

  @Test(expected = ExceedDimensionException.class)
  public void invalidAddMailExceedDimension2() throws Exception {
    locker1.addMail(mail3);
  }

  @Test(expected = ExceedDimensionException.class)
  public void invalidAddMailExceedDimension3() throws Exception {
    locker1.addMail(mail4);
  }

  @Test
  public void pickupMail() throws Exception {
    locker1.addMail(mail1);
    assertTrue(mail1.equals(locker1.pickupMail(recipient)));
  }

  @Test(expected = MailCannotPickupException.class)
  public void nothingPicked() throws MailCannotPickupException {
    locker.pickupMail(recipient);
  }

  @Test(expected = MailCannotPickupException.class)
  public void noMatchedMail() throws Exception {
    locker.addMail(mail1);
    locker.pickupMail(recipient2);
  }

  @Test
  public void getMaxWidth() {
    assertEquals(Integer.valueOf(3), locker1.getMaxWidth());
  }

  @Test
  public void getMaxHeight() {
    assertEquals(Integer.valueOf(4), locker1.getMaxHeight());
  }

  @Test
  public void getMaxDepth() {
    assertEquals(Integer.valueOf(5), locker1.getMaxDepth());
  }

  @Test
  public void getMailItem() throws Exception {
    locker.addMail(mail1);
    assertEquals(mail1, locker.getMailItem());
  }
}
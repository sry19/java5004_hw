package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecipientTest {

  Recipient recipient;
  Recipient recipient1;
  Recipient recipient2;
  Recipient recipient3;
  Recipient recipient4;

  @Before
  public void setUp() throws Exception {
    recipient = new Recipient("Amy","Brown","abc@neu.edu");
    recipient1 = new Recipient("Amy","Brown","abc@neu.edu");
    recipient2 = new Recipient("Emma","Brown","abc@neu.edu");
    recipient3 = new Recipient("Amy","White","abc@neu.edu");
    recipient4 = new Recipient("Amy","Brown","abcefg@neu.edu");
  }

  @Test
  public void testEquals(){
    assertTrue(recipient.equals(recipient1));
    assertFalse(recipient.equals(recipient2));
    assertFalse(recipient.equals(recipient3));
    assertFalse(recipient.equals(recipient4));
    assertFalse(recipient.equals((Integer)5));
    assertFalse(recipient.equals(null));
  }

  @Test
  public void testHashcode(){
    assertEquals(recipient.hashCode(), recipient1.hashCode());
    assertNotEquals(recipient.hashCode(),recipient2.hashCode());
    assertNotEquals(recipient.hashCode(),recipient3.hashCode());
    assertNotEquals(recipient.hashCode(),recipient4.hashCode());
  }
}
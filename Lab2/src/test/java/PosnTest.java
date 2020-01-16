import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PosnTest {

  Posn posn1;
  Posn posn2;
  Posn posn3;
  Posn posn4;
  Name name;
  private Integer CORRECT_X = 3;
  private Integer WRONG_X = 4;
  private Integer CORRECT_Y = 4;
  private Integer WRONG_Y = 5;

  @Before
  public void setUp() throws Exception {
    posn1 = new Posn(CORRECT_X,CORRECT_Y);
    posn2 = new Posn(CORRECT_X,CORRECT_Y);
    posn3 = new Posn(WRONG_X,CORRECT_Y);
    posn4 = new Posn(CORRECT_X,WRONG_Y );
    name = new Name("Amy","n/a","Brown");
  }

  @Test
  public void getX() {
    assertEquals(CORRECT_X,posn1.getX());
  }

  @Test
  public void getY() {
    assertEquals(CORRECT_Y,posn1.getY());
  }

  @Test
  public void testEquals() {
    assertTrue(posn1.equals(posn2));
    assertFalse(posn1.equals(null));
    assertFalse(posn1.equals(posn3));
    assertFalse(posn1.equals(posn4));
    assertFalse(posn1.equals(name));
  }

  @Test
  public void testHashCode() {
    assertEquals(posn1.hashCode(),posn2.hashCode());
    assertNotEquals(posn1.hashCode(),posn3.hashCode());
    assertNotEquals(posn1.hashCode(),posn4.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Posn",posn1.toString());
  }
}
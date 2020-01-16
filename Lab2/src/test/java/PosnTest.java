import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PosnTest {

  Posn posn1;
  Posn posn2;
  Posn posn3;
  Posn posn4;
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
  }

  @Test
  public void getX() {
    assertEquals((Integer)3,posn1.getX());
  }

  @Test
  public void getY() {
    assertEquals((Integer)4,posn1.getY());
  }

  @Test
  public void testEquals() {

  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testToString() {
  }
}
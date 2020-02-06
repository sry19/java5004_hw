package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RockTest {

  Rock rock;

  @Before
  public void setUp() throws Exception {
    rock = new Rock();
  }

  @Test
  public void beats() {
    Scissors scissors = new Scissors();
    Paper paper = new Paper();
    assertTrue(rock.beats(scissors));
    assertFalse(rock.beats(paper));
  }
}
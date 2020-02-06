package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScissorsTest {

  Scissors scissors;

  @Before
  public void setUp() throws Exception {
    scissors = new Scissors();
  }

  @Test
  public void beats() {
    Paper paper = new Paper();
    Rock rock = new Rock();
    assertTrue(scissors.beats(paper));
    assertFalse(scissors.beats(rock));
  }
}
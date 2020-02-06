package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaperTest {

  Paper paper;

  @Before
  public void setUp() throws Exception {
    paper = new Paper();
  }

  @Test
  public void beats() {
    Rock rock = new Rock();
    Scissors scissors = new Scissors();
    assertTrue(paper.beats(rock));
    assertFalse(paper.beats(scissors));
  }
}
package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BagOfWordsTest {

  IBagOfWords iBagOfWords1;
  IBagOfWords iBagOfWords2;

  @Before
  public void setUp() throws Exception {
    iBagOfWords1 = BagOfWords.emptyBagOfWords();
    iBagOfWords2 = BagOfWords.emptyBagOfWords();
  }

  @Test
  public void emptyBagOfWords() {
    IBagOfWords iBagOfWords3;
    iBagOfWords3 = BagOfWords.emptyBagOfWords();
    assertTrue(iBagOfWords3.isEmpty());
  }

  @Test
  public void isEmpty() {
    assertTrue(iBagOfWords1.isEmpty());
    iBagOfWords1 = iBagOfWords1.add("frog");
    assertFalse(iBagOfWords1.isEmpty());
  }

  @Test
  public void size() {
    assertTrue(0==iBagOfWords1.size());
    iBagOfWords1 = iBagOfWords1.add("frog");
    assertTrue(1==iBagOfWords1.size());
  }

  @Test
  public void add() {
    iBagOfWords1 = iBagOfWords1.add("lemon");
    iBagOfWords1 = iBagOfWords1.add("lime");

    iBagOfWords2 = iBagOfWords2.add("lime");
    iBagOfWords2 = iBagOfWords2.add("lemon");

    assertEquals(iBagOfWords1, iBagOfWords2);
  }

  @Test
  public void contains() {
    iBagOfWords1 = iBagOfWords1.add("lemon");
    assertTrue(iBagOfWords1.contains("lemon"));
    assertFalse(iBagOfWords1.contains("lime"));
  }

  @Test
  public void testEquals() {
    iBagOfWords1 = iBagOfWords1.add("lemon");
    iBagOfWords1 = iBagOfWords1.add("lime");

    iBagOfWords2 = iBagOfWords2.add("lime");
    iBagOfWords2 = iBagOfWords2.add("lemon");

    assertEquals(iBagOfWords1, iBagOfWords2);
    assertEquals(iBagOfWords1, iBagOfWords1);
    assertFalse(iBagOfWords1.equals(null));
    assertFalse(iBagOfWords1.equals("string"));
  }

  @Test
  public void testHashCode() {
    assertEquals(iBagOfWords1.hashCode(), iBagOfWords2.hashCode());
    iBagOfWords1 = iBagOfWords1.add("lime");
    iBagOfWords2 = iBagOfWords2.add("lemon");
    assertNotEquals(iBagOfWords1.hashCode(), iBagOfWords2.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("BagOfWords{strings=EmptyNode{}}", iBagOfWords1.toString());
  }
}
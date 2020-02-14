package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyNodeTest {

  ILinkedList emptyNode1;
  ILinkedList emptyNode2;
  ILinkedList element;

  @Before
  public void setUp() throws Exception {
    emptyNode1 = new EmptyNode();
    emptyNode2 = new EmptyNode();
    element = new ElementNode("aa", emptyNode2);
  }

  @Test
  public void count() {
    assertEquals((Integer) 0, emptyNode1.count());
  }

  @Test
  public void add() {
    ILinkedList element = emptyNode1.add("frog");
    assertEquals("frog", element.getValue());
  }

  @Test
  public void getValue() {
    assertNull(emptyNode1.getValue());
  }

  @Test
  public void getRest() {
    assertNull(emptyNode1.getRest());
  }

  @Test
  public void contains() {
    assertFalse(emptyNode1.contains("apple"));
  }

  @Test
  public void testHashCode() {
    assertEquals(31, emptyNode1.hashCode());
  }

  @Test
  public void testEquals() {
    assertEquals(emptyNode1, emptyNode1);
    assertEquals(emptyNode1, emptyNode2);
    assertFalse(emptyNode1.equals(element));
    assertFalse(emptyNode1.equals(null));
    assertFalse(emptyNode1.equals("string"));
  }

  @Test
  public void testToString() {
    assertEquals("EmptyNode{}", emptyNode1.toString());
  }
}
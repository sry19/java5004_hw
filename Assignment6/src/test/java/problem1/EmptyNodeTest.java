package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyNodeTest {

  ILinkedList emptyNode1;
  ILinkedList emptyNode2;

  @Before
  public void setUp() throws Exception {
    emptyNode1 = new EmptyNode();
    emptyNode2 = new EmptyNode();
  }

  @Test
  public void count() {
    assertEquals((Integer) 0, emptyNode1.count());
  }

  @Test
  public void add() {
    assertEquals((Integer) 0, emptyNode1.count());
    ILinkedList element = emptyNode1.add(3, "apple");
    assertEquals((Integer) 1, element.count());
  }

  @Test
  public void getValue() {
    assertNull(emptyNode1.getValue());
  }

  @Test
  public void getPriority() {
    assertNull(emptyNode1.getPriority());
  }

  @Test
  public void getRest() {
    assertNull(emptyNode1.getRest());
  }

  @Test
  public void pop() {
    assertNull(emptyNode1.pop());
  }

  @Test
  public void testHashCode() {
    assertTrue(31 == emptyNode1.hashCode());
  }

  @Test
  public void testEquals() {
    assertEquals(emptyNode1, emptyNode2);
    assertTrue(emptyNode1.equals(emptyNode1));
    assertFalse(emptyNode1.equals(null));
    assertFalse(emptyNode1.equals("string"));
  }

  @Test
  public void testToString() {
    assertEquals("EmptyNode{}", emptyNode1.toString());
  }
}
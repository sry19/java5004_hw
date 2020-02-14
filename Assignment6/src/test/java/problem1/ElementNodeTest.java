package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementNodeTest {

  ILinkedList emptyNode1;
  ILinkedList elementNode1;
  ILinkedList emptyNode2;
  ILinkedList elementNode2;
  ILinkedList emptyNode3;
  ILinkedList elementNode3;

  @Before
  public void setUp() throws Exception {
    emptyNode1 = new EmptyNode();
    elementNode1 = new ElementNode(3, "apple", emptyNode1);
    elementNode1 = elementNode1.add(2, "apple");
    elementNode1 = elementNode1.add(4, "apple");

    emptyNode2 = new EmptyNode();
    elementNode2 = new ElementNode(3, "apple", emptyNode2);
    elementNode2 = elementNode2.add(2, "apple");

    emptyNode3 = new EmptyNode();
    elementNode3 = new ElementNode(4, "apple", emptyNode3);
    elementNode3 = elementNode3.add(3, "apple");
    elementNode3 = elementNode3.add(2, "apple");
  }

  @Test
  public void count() {
    assertEquals((Integer) 3, elementNode1.count());
  }

  @Test
  public void add() {
    assertEquals(elementNode2.add(4, "apple"), elementNode1);
  }

  @Test
  public void pop() {
    assertEquals(elementNode2, elementNode1.pop());
  }

  @Test
  public void getPriority() {
    assertEquals((Integer) 4, elementNode1.getPriority());
  }

  @Test
  public void getValue() {
    assertEquals("apple", elementNode1.getValue());
  }

  @Test
  public void getRest() {
    assertEquals(elementNode2, elementNode1.getRest());
  }

  @Test
  public void testEquals() {
    assertTrue(elementNode3.equals(elementNode1));
    assertTrue(elementNode3.equals(elementNode3));
    assertFalse(elementNode1.equals(null));
    assertFalse(elementNode1.equals(emptyNode1));
    assertFalse(elementNode1.equals(elementNode2));
    elementNode2 = elementNode2.add(4, "app");
    assertFalse(elementNode1.equals(elementNode2));
  }

  @Test
  public void testHashCode() {
    assertEquals(elementNode1.hashCode(), elementNode3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(
        "ElementNode{priority=4, value='apple', rest=ElementNode{priority=3, value='apple', rest=ElementNode{priority=2, value='apple', rest=EmptyNode{}}}}",
        elementNode1.toString());
  }
}
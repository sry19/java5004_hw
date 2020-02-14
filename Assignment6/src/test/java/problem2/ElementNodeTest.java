package problem2;

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
  ILinkedList emptyNode4;
  ILinkedList elementNode4;
  ILinkedList emptyNode5;
  ILinkedList elementNode5;

  @Before
  public void setUp() throws Exception {
    emptyNode1 = new EmptyNode();
    elementNode1 = new ElementNode("apple", emptyNode1);
    elementNode1 = elementNode1.add("app");
    elementNode1 = elementNode1.add("apple");

    emptyNode2 = new EmptyNode();
    elementNode2 = new ElementNode("apple", emptyNode2);
    elementNode2 = elementNode2.add("banana");

    emptyNode3 = new EmptyNode();
    elementNode3 = new ElementNode("apple", emptyNode3);
    elementNode3 = elementNode3.add("apple");
    elementNode3 = elementNode3.add("apple");
  }

  @Test
  public void count() {
    assertEquals((Integer) 3, elementNode1.count());
  }

  @Test
  public void add() {
    emptyNode4 = new EmptyNode();
    elementNode4 = new ElementNode("apple", emptyNode4);
    elementNode4 = elementNode4.add("banana");

    assertEquals(elementNode2, elementNode4);

  }

  @Test
  public void getValue() {
    assertEquals("apple", elementNode2.getValue());
  }

  @Test
  public void getRest() {
    emptyNode4 = new EmptyNode();
    elementNode4 = new ElementNode("banana", emptyNode4);
    assertEquals(elementNode4, elementNode2.getRest());
  }

  @Test
  public void contains() {
    assertTrue(elementNode1.contains("app"));
    assertFalse(elementNode1.contains("banana"));
  }

  @Test
  public void testEquals() {
    assertFalse(elementNode2.equals(elementNode1));
    assertTrue(elementNode2.equals(elementNode2));
    assertFalse(elementNode2.equals(emptyNode1));
    assertFalse(elementNode2.equals(null));
    assertFalse(elementNode2.equals("string"));
  }

  @Test
  public void testHashCode() {
    assertFalse(elementNode2.hashCode() == elementNode1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(
        "ElementNode{ value='app, rest=ElementNode{ value='apple, rest=ElementNode{ value='apple, rest=EmptyNode{}}}}",
        elementNode1.toString());
  }
}
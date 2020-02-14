package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

  IPriorityQueue priorityQueue1;
  IPriorityQueue priorityQueue2;
  IPriorityQueue priorityQueue3;

  @Before
  public void setUp() throws Exception {
    priorityQueue1 = PriorityQueue.createEmpty();
    priorityQueue2 = PriorityQueue.createEmpty();
    priorityQueue3 = PriorityQueue.createEmpty();
  }

  @Test
  public void createEmpty() {
    IPriorityQueue priorityQueue2 = PriorityQueue.createEmpty();
    assertEquals(priorityQueue1, priorityQueue2);
  }

  @Test
  public void isEmpty() {
    assertTrue(priorityQueue1.isEmpty());
    priorityQueue1 = priorityQueue1.add((Integer) 3, "apple");
    assertFalse(priorityQueue1.isEmpty());
  }

  @Test
  public void add() {
    priorityQueue2 = priorityQueue2.add(2, "apple");
    priorityQueue2 = priorityQueue2.add(3, "apple");
    priorityQueue2 = priorityQueue2.add(3, "banana");
    priorityQueue2 = priorityQueue2.add(4, "lemon");

    priorityQueue3 = priorityQueue3.add(4, "lemon");
    priorityQueue3 = priorityQueue3.add(3, "apple");
    priorityQueue3 = priorityQueue3.add(3, "banana");
    priorityQueue3 = priorityQueue3.add(2, "apple");

    assertEquals(priorityQueue2, priorityQueue3);
  }

  @Test
  public void peek() {
    priorityQueue2 = priorityQueue2.add(2, "apple");
    priorityQueue2 = priorityQueue2.add(3, "apple");
    priorityQueue2 = priorityQueue2.add(3, "banana");
    priorityQueue2 = priorityQueue2.add(4, "lemon");
    assertEquals("lemon", priorityQueue2.peek());
  }

  @Test(expected = EmptyPriorityQueueException.class)
  public void invalidPeek() {
    priorityQueue3.peek();
  }

  @Test
  public void pop() {
    priorityQueue2 = priorityQueue2.add(2, "apple");
    priorityQueue2 = priorityQueue2.add(3, "apple");
    priorityQueue2 = priorityQueue2.add(3, "banana");

    priorityQueue3 = priorityQueue3.add(4, "lemon");
    priorityQueue3 = priorityQueue3.add(3, "apple");
    priorityQueue3 = priorityQueue3.add(3, "banana");
    priorityQueue3 = priorityQueue3.add(2, "apple");

    assertEquals(priorityQueue3.pop(), priorityQueue2);
  }

  @Test(expected = EmptyPriorityQueueException.class)
  public void invalidPop() {
    priorityQueue3.pop();
  }

  @Test
  public void testEquals() {
    priorityQueue1 = priorityQueue1.add(2, "apple");

    priorityQueue2 = priorityQueue2.add(2, "apple");
    priorityQueue2 = priorityQueue2.add(3, "apple");
    priorityQueue2 = priorityQueue2.add(3, "banana");
    priorityQueue2 = priorityQueue2.add(4, "lemon");

    priorityQueue3 = priorityQueue3.add(4, "lemon");
    priorityQueue3 = priorityQueue3.add(3, "apple");
    priorityQueue3 = priorityQueue3.add(3, "banana");
    priorityQueue3 = priorityQueue3.add(2, "apple");

    assertEquals(priorityQueue2, priorityQueue3);
    assertEquals(priorityQueue2, priorityQueue2);
    assertFalse(priorityQueue2.equals(null));
    assertFalse(priorityQueue2.equals("string"));
    assertFalse(priorityQueue2.equals(priorityQueue1));

    priorityQueue1 = priorityQueue1.add(3, "banana");
    assertFalse(priorityQueue2.equals(priorityQueue1));
  }

  @Test
  public void testHashCode() {
    assertEquals(priorityQueue2.hashCode(), priorityQueue3.hashCode());
  }

  @Test
  public void testToString() {
    priorityQueue2 = priorityQueue2.add(2, "apple");
    priorityQueue2 = priorityQueue2.add(3, "apple");
    priorityQueue2 = priorityQueue2.add(3, "banana");
    priorityQueue2 = priorityQueue2.add(4, "lemon");

    assertEquals(
        "PriorityQueue{front=ElementNode{priority=4, value='lemon', rest=ElementNode{priority=3, value='apple', rest=ElementNode{priority=3, value='banana', rest=ElementNode{priority=2, value='apple', rest=EmptyNode{}}}}}}",
        priorityQueue2.toString());
  }
}
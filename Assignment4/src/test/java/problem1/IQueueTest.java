package problem1;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import org.junit.Before;
import org.junit.Test;

public class IQueueTest {

  IQueue queue1;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void enqueue() throws EmptyQueueException {
    queue1.enqueue(4);
    queue1.enqueue(5);
    assertEquals((Integer) 4, queue1.front());
    queue1.enqueue(6);
    queue1.enqueue(7);
    assertEquals((Integer) 4, queue1.front());
  }

  @Test
  public void dequeue() throws EmptyQueueException {
    queue1.enqueue(3);
    queue1.enqueue(7);
    queue1.enqueue(2);
    queue1.enqueue(1);
    assertEquals((Integer) 3, queue1.dequeue());
    assertEquals((Integer) 7, queue1.dequeue());
    assertEquals((Integer) 2, queue1.dequeue());
    assertEquals((Integer) 1, queue1.dequeue());
  }

  @Test(expected = EmptyQueueException.class)
  public void invalidDequeue() throws EmptyQueueException {
    queue1.dequeue();
  }

  @Test
  public void front() throws EmptyQueueException {
    queue1.enqueue(3);
    assertEquals((Integer) 3, queue1.front());
  }

  @Test(expected = EmptyQueueException.class)
  public void invalidFront() throws EmptyQueueException {
    queue1.front();
  }

  @Test
  public void size() {
    assertTrue(queue1.size() == 0);
    queue1.enqueue(4);
    assertTrue(queue1.size() == 1);
  }
}
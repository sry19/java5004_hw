package problem1;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import org.junit.Before;
import org.junit.Test;

public class IStackTest {

  IStack stack1;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void push() {
    stack1.push(3);
    assertEquals((Integer) 3, stack1.top());
    stack1.push(2);
    assertEquals((Integer) 2, stack1.top());
  }

  @Test
  public void pop() throws EmptyStackException {
    stack1.push(3);
    stack1.push(4);
    stack1.push(5);
    stack1.push(6);
    assertEquals((Integer) 6, stack1.pop());
    assertEquals((Integer) 5, stack1.pop());
  }

  @Test(expected = EmptyStackException.class)
  public void invalidPop() throws EmptyStackException {
    stack1.pop();
  }

  @Test
  public void top() throws EmptyStackException {
    stack1.push(4);
    assertEquals((Integer) 4, stack1.top());
  }

  @Test(expected = EmptyStackException.class)
  public void invalidTop() throws EmptyStackException {
    stack1.top();
  }

  @Test
  public void isEmpty() {
    assertTrue(stack1.isEmpty());
    stack1.push(4);
    assertFalse(stack1.isEmpty());
  }
}
package problem1;

import java.util.EmptyStackException;

public class PriorityQueue implements IPriorityQueue{

  private ILinkedList front;

  private PriorityQueue() {
    this.front = new EmptyNode();
  }

  private PriorityQueue(ILinkedList element) {
    this.front = element;
  }

  public static IPriorityQueue createEmpty() {
    return new PriorityQueue();
  }

  /**
   * check whether the priority queue is empty or not
   *
   * @return the boolean
   */
  @Override
  public Boolean isEmpty() {
    if (this.front.count().equals(0)) {
      return true;
    }
    return false;
  }

  /**
   * Add an element to priority queue. If multiple elements have the same priority, we add it at the end of these elements
   *
   * @param priority the priority
   * @param value    the value
   * @return the priority queue
   */
  @Override
  public IPriorityQueue add(Integer priority, String value) {
    return new PriorityQueue(this.front.add(priority, value));
  }

  /**
   * return the string which has the top priority. If multiple elements have the same priority, we select the one which comes in first
   *
   * @return the string
   */
  @Override
  public String peek() throws EmptyPriorityQueueException {
    if (this.isEmpty()) {
      throw new EmptyPriorityQueueException();
    }
    return this.front.getValue();
  }

  /**
   * Pop an element from priority queue. If multiple elements have the same priority, the one which comes in first comes out first
   *
   * @return the priority queue
   */
  @Override
  public IPriorityQueue pop() throws EmptyPriorityQueueException{
    if (this.isEmpty()) {
      throw new EmptyPriorityQueueException();
    }
    return new PriorityQueue(this.front.pop());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    PriorityQueue that = (PriorityQueue) o;

    return front.equals(that.front);
  }

  @Override
  public int hashCode() {
    return front.hashCode();
  }

  @Override
  public String toString() {
    return "PriorityQueue{" +
        "front=" + front +
        '}';
  }
}

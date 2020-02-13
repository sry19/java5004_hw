package problem1;

/**
 * The interface Priority queue.
 */
public interface IPriorityQueue {

  /**
   * check whether the priority queue is empty or not
   *
   * @return the boolean
   */
  Boolean isEmpty();

  /**
   * Add an element to priority queue. If multiple elements have the same priority, we add it at the end of these elements
   *
   * @param priority the priority
   * @param value    the value
   * @return the priority queue
   */
  IPriorityQueue add(Integer priority, String value);

  /**
   * return the string which has the top priority. If multiple elements have the same priority, we select the one which comes in first
   *
   * @return the string
   */
  String peek();

  /**
   * Pop an element from priority queue. If multiple elements have the same priority, the one which comes in first comes out first
   *
   * @return the priority queue
   */
  IPriorityQueue pop();

}

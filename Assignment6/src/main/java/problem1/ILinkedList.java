package problem1;

/**
 * The interface Linked list.
 */
public interface ILinkedList {

  /**
   * Counts the number of nodes.
   *
   * @return the integer
   */
  Integer count();

  /**
   * Adds nodes to linked list.
   *
   * @param priority the priority
   * @param value    the value
   * @return the linked list
   */
  ILinkedList add(Integer priority, String value);

  /**
   * Gets value.
   *
   * @return the value
   */
  String getValue();

  /**
   * Gets priority.
   *
   * @return the priority
   */
  Integer getPriority();

  /**
   * Gets the rest of the linked list.
   *
   * @return the rest
   */
  ILinkedList getRest();

  /**
   * Pops the element at the head of the linked list.
   *
   * @return the linked list
   */
  ILinkedList pop();
}

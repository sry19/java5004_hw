package problem2;

/**
 * The interface Linked list.
 */
public interface ILinkedList {

  /**
   * size of the linked list.
   *
   * @return the integer
   */
  Integer count();

  /**
   * Add string to the linked list.
   *
   * @param value the value
   * @return the linked list
   */
  ILinkedList add(String value);

  /**
   * Gets value of the node.
   *
   * @return the value
   */
  String getValue();

  /**
   * Gets the rest of the linked list.
   *
   * @return the rest
   */
  ILinkedList getRest();

  /**
   * Checks if the linked list contains n
   *
   * @param n the n
   * @return the boolean
   */
  boolean contains(String n);
}

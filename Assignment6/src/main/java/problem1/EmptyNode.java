package problem1;

/**
 * The type Empty node.
 */
public class EmptyNode implements ILinkedList {

  /**
   * Instantiates a new Empty node.
   */
  public EmptyNode() {
  }

  /**
   * Counts the number of nodes.
   *
   * @return the integer
   */
  @Override
  public Integer count() {
    return 0;
  }

  /**
   * Adds nodes to linked list.
   *
   * @param priority the priority
   * @param value    the value
   * @return the linked list
   */
  @Override
  public ElementNode add(Integer priority, String value) {
    return new ElementNode(priority, value, this);
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  @Override
  public String getValue() {
    return null;
  }

  /**
   * Gets priority.
   *
   * @return the priority
   */
  @Override
  public Integer getPriority() {
    return null;
  }

  /**
   * Gets the rest of the linked list.
   *
   * @return the rest
   */
  @Override
  public ILinkedList getRest() {
    return null;
  }

  /**
   * Pops the element at the head of the linked list.
   *
   * @return the linked list
   */
  @Override
  public ILinkedList pop() {
    return null;
  }

  /**
   * a hash code value for this object.
   *
   * @return a hash code value for this object.
   */
  @Override
  public int hashCode() {
    return 31;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj other object
   * @return true if they are equal, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    return true;
  }

  /**
   * a string representation of the object.
   *
   * @return a string representation of the object.
   */
  @Override
  public String toString() {
    return "EmptyNode{}";
  }
}

package problem2;

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
   * size of the linked list.
   *
   * @return the integer
   */
  @Override
  public Integer count() {
    return 0;
  }

  /**
   * Add string to the linked list.
   *
   * @param value the value
   * @return the linked list
   */
  @Override
  public ElementNode add(String value) {
    return new ElementNode(value,this);
  }

  /**
   * Gets value of the node.
   *
   * @return the value
   */
  @Override
  public String getValue() {
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

  @Override
  public boolean contains(String n) {
    return false;
  }

  @Override
  public int hashCode() {
    return 31;
  }

  @Override
  public boolean equals(Object obj) {
    if (this==obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "EmptyNode{}";
  }
}

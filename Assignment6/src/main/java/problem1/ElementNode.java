package problem1;

import java.util.EmptyStackException;

/**
 * The type Element node.
 */
public class ElementNode implements ILinkedList {

  private Integer priority;
  private String value;
  private ILinkedList rest;

  /**
   * Instantiates a new Element node.
   *
   * @param priority the priority
   * @param value    the value
   * @param rest     the rest
   */
  public ElementNode(Integer priority, String value, ILinkedList rest) {
    this.priority = priority;
    this.value = value;
    this.rest = rest;
  }

  /**
   * Counts the number of nodes.
   *
   * @return the integer
   */
  @Override
  public Integer count() {
    return 1 + this.rest.count();
  }

  /**
   * Adds nodes to linked list.
   *
   * @param priority the priority
   * @param value    the value
   * @return the linked list
   */
  @Override
  public ILinkedList add(Integer priority, String value) {
    if (priority <= this.priority) {
      return new ElementNode(this.priority, this.value, this.rest.add(priority, value));
    }
    ILinkedList copy = new ElementNode(this.priority, this.value, this.rest);
    return new ElementNode(priority, value, copy);
  }

  /**
   * Pops the element at the head of the linked list.
   *
   * @return the linked list
   */
  @Override
  public ILinkedList pop() {
    return new ElementNode(this.rest.getPriority(), this.rest.getValue(), this.rest.getRest());
  }

  /**
   * Gets priority.
   *
   * @return the priority
   */
  @Override
  public Integer getPriority() {
    return this.priority;
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  @Override
  public String getValue() {
    return this.value;
  }

  /**
   * Gets the rest of the linked list.
   *
   * @return the rest
   */
  @Override
  public ILinkedList getRest() {
    return this.rest;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o other object
   * @return true if they are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ElementNode that = (ElementNode) o;

    if (!priority.equals(that.priority)) {
      return false;
    }
    if (!value.equals(that.value)) {
      return false;
    }
    return rest.equals(that.rest);
  }

  /**
   * a hash code value for this object.
   *
   * @return a hash code value for this object.
   */
  @Override
  public int hashCode() {
    int result = priority.hashCode();
    result = 31 * result + value.hashCode();
    result = 31 * result + rest.hashCode();
    return result;
  }

  /**
   * a string representation of the object.
   *
   * @return a string representation of the object.
   */
  @Override
  public String toString() {
    return "ElementNode{" +
        "priority=" + priority +
        ", value='" + value + '\'' +
        ", rest=" + rest +
        '}';
  }
}

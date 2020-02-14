package problem2;

/**
 * The type Element node.
 */
public class ElementNode implements ILinkedList {

  private String value;
  private ILinkedList rest;

  /**
   * Instantiates a new Element node.
   *
   * @param value the value
   * @param rest  the rest
   */
  public ElementNode(String value, ILinkedList rest) {
    this.value = value;
    this.rest = rest;
  }

  /**
   * size of the linked list.
   *
   * @return the integer
   */
  @Override
  public Integer count() {
    return 1 + this.rest.count();
  }

  /**
   * Add string to the linked list.
   *
   * @param value the value
   * @return the linked list
   */
  @Override
  public ILinkedList add(String value) {
    if (value.compareTo(this.value) >= 0) {
      return new ElementNode(this.value, this.rest.add(value));
    }
    ILinkedList copy = new ElementNode(this.value, this.rest);
    return new ElementNode(value, copy);
  }

  /**
   * Gets value of the node.
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
   * Checks if the linked list contains n
   *
   * @param n the n
   * @return the boolean
   */
  @Override
  public boolean contains(String n) {
    if (this.value.equals(n)) {
      return true;
    }
    return this.rest.contains(n);
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
    int result = value.hashCode();
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
        " value='" + value +
        ", rest=" + rest +
        '}';
  }

}

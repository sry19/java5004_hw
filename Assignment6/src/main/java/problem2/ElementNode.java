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

  @Override
  public boolean contains(String n) {
    if (this.value.equals(n)) {
      return true;
    }
    return this.rest.contains(n);
  }

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

  @Override
  public int hashCode() {
    int result = value.hashCode();
    result = 31 * result + rest.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "ElementNode{" +
        " value='" + value +
        ", rest=" + rest +
        '}';
  }

}

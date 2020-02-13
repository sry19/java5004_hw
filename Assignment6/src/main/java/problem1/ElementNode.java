package problem1;

import java.util.EmptyStackException;

public class ElementNode implements ILinkedList {

  private Integer priority;
  private String value;
  private ILinkedList rest;

  public ElementNode(Integer priority, String value, ILinkedList rest) {
    this.priority = priority;
    this.value = value;
    this.rest = rest;
  }

  public Integer count() {
    return 1 + this.rest.count();
  }

  public ILinkedList add(Integer priority, String value) {
    if (priority <= this.priority) {
      return new ElementNode(this.priority, this.value, this.rest.add(priority, value));
    }
    ILinkedList copy = new ElementNode(this.priority, this.value, this.rest);
    return new ElementNode(priority, value, copy);
  }

  public ILinkedList pop() {
    return new ElementNode(this.rest.getPriority(), this.rest.getValue(), this.rest.getRest());
  }

  public Integer getPriority() {
    return this.priority;
  }

  public String getValue() {
    return this.value;
  }

  public ILinkedList getRest() {
    return this.rest;
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

    if (!priority.equals(that.priority)) {
      return false;
    }
    if (!value.equals(that.value)) {
      return false;
    }
    return rest.equals(that.rest);
  }

  @Override
  public int hashCode() {
    int result = priority.hashCode();
    result = 31 * result + value.hashCode();
    result = 31 * result + rest.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "ElementNode{" +
        "priority=" + priority +
        ", value='" + value + '\'' +
        ", rest=" + rest +
        '}';
  }
}

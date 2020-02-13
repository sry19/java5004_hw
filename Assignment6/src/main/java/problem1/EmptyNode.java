package problem1;

public class EmptyNode implements ILinkedList{

    public EmptyNode() {
    }

    public Integer count() {
      return 0;
    }

    public ElementNode add(Integer priority, String value) {
      return new ElementNode(priority, value,this);
    }

    public String getValue() {
      return null;
    }

    public Integer getPriority(){
      return null;
    }

    public ILinkedList getRest() {
      return null;
    }

    public ILinkedList pop() {
      return null;
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

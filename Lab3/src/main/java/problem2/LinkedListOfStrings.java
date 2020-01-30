package problem2;

import java.util.HashSet;
import java.util.Objects;

public class LinkedListOfStrings implements IInterface{
  private Node head;
  private int numNodes;

  public LinkedListOfStrings() {
    this.head = null;
    this.numNodes = 0;
  }

  public static LinkedListOfStrings createEmpty() {
    return new LinkedListOfStrings();
  }

  @Override
  public boolean isEmpty() {
    if(this.numNodes == 0){
      return true;
    }
    else{
      return false;
    }
  }

  /**
   * The number of items in the list.
   *
   * @return The number of items in the list.
   */
  @Override
  public int size() {
    return this.numNodes;
  }

  @Override
  public boolean contains(String s) {
    if (this.isEmpty()){return false;}
    Node cur = this.head;
    while (cur!=null) {
      if(cur.getItem()==s){
        return true;
      }
      cur = cur.getNextNode();
    }
    return false;
  }

  @Override
  public boolean containsAll(LinkedListOfStrings stringArray) {
    if (stringArray.head==null){return true;}
    Node cur = stringArray.head;
    while (cur!=null){
      Node n = this.head;
      while (n!=null){
        if(n.getItem()==cur.getItem()){
          break;
        }
        if(n==null){return false;}
        n = n.getNextNode();
      }
      cur = cur.getNextNode();
    }
    return true;
  }

  @Override
  public LinkedListOfStrings filterLargerThan(int length) {
    LinkedListOfStrings dummy = new LinkedListOfStrings();
    Node h = dummy.head;
    if (this.isEmpty()){return dummy;}
    Node cur = this.head;
    while (cur!=null) {
      if(cur.getItem().length()>length){
        h.setNextNode(cur);
        h = h.getNextNode();
      }
      cur = cur.getNextNode();
    }
    return dummy;
  }

  @Override
  public boolean hasDuplicates() {
    if(this.isEmpty()){return false;}
    HashSet s = new HashSet(this.numNodes);
    Node cur = this.head;
    while (cur!=null){
      if(s.contains(cur.getItem())){return true;}
      s.add(cur.getItem());
      cur = cur.getNextNode();
    }
    return false;
  }

  @Override
  public LinkedListOfStrings removeDuplicates() {
    if(this.isEmpty()){return this;}
    HashSet s = new HashSet(this.numNodes);
    Node cur = this.head;
    s.add(cur.getItem());
    while (cur.getNextNode()!=null){
      if(s.contains(cur.getNextNode().getItem())){
        cur.setNextNode(cur.getNextNode().getNextNode());
      }
      s.add(cur.getNextNode().getItem());
      cur = cur.getNextNode();
    }
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedListOfStrings that = (LinkedListOfStrings) o;
    return numNodes == that.numNodes &&
        Objects.equals(head, that.head);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head, numNodes);
  }

  @Override
  public String toString() {
    return "LinkedListOfStrings{" +
        "head=" + head +
        ", numNodes=" + numNodes +
        '}';
  }

}

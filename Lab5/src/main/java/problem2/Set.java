package problem2;

import simpleRecursiveList.Empty;

public class Set implements ISet{
  private simpleRecursiveList.List head;

  private Set() {
    this.head = new simpleRecursiveList.Empty();
  }

  private Set(simpleRecursiveList.List head) {
    this.head = head;
  }

  public static ISet emptySet(){
    return new Set();
  }

  @Override
  public Boolean isEmpty() {
    return this.head.isEmpty();
  }

  @Override
  public ISet add(Integer n) {
    if (!this.head.contains(n)) {
      return new Set(this.head.add(n));
    }
    return this;
  }

  @Override
  public Boolean contains(Integer n) {
    return this.head.contains(n);
  }

  @Override
  public ISet remove(Integer ele) {
    return new Set(this.head.remove(ele));
  }

  @Override
  public Integer size() {
    return this.head.size();
  }
}

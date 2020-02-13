package problem3;

import simpleRecursiveList.Cons;

public class List implements IList {

  private IList first;
  private IList rest;

  private List(IList first, IList rest) {
    this.first =first;
    this.rest = rest;
  }

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  @Override
  public Integer size() {
    return 1 + this.getRest().size();
  }

  @Override
  public Integer length() {
    return 1 + this.first.size();
  }

  @Override
  public Integer sum() {
    return this.length() + this.size();
  }

  /**
   * Returns true if empty and false otherwise
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Given a new element {@code element} prepend it to this list
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  @Override
  public IList add(IList element) {
    return new List(element, this);
  }

  @Override
  public boolean contains(Integer element) {
    if (this.first.equals(element)) {
      return true;
    }
    return this.rest.contains(element);
  }

  @Override
  public IList getRest() {
    return this.rest;
  }

  @Override
  public IList getFirst() {
    return this.first;
  }

  @Override
  public IList removeInteger(Integer n) {
    if (this.first.contains(n)) {
      this.first.removeInteger(n);
      return this;
    }
    return this.rest.removeInteger(n);
  }

  public IList removeAllInteger(Integer n) {
    if (this.first.contains(n)) {
      this.first.removeInteger(n);
    }
    return new List(this.first, this.rest.removeInteger(n));
  }
}

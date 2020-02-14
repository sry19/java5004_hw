package problem3;

import simpleRecursiveList.Cons;

public class List implements Interface1{

  private IList first;
  private Interface1 rest;

  public List(IList first, Interface1 rest) {
    this.first =first;
    this.rest = rest;
  }

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */

  public Integer size() {
    return 1 + this.getRest().size();
  }

  public Integer length() {
    return this.first.size() + this.rest.length();
  }

  public Integer sum() {
    return this.first.sum() + this.rest.sum();
  }

  /**
   * Returns true if empty and false otherwise
   */
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Given a new element {@code element} prepend it to this list
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  public Interface1 add(IList element) {
    return new List(element, this);
  }

  public boolean contains(Integer element) {
    if (this.first.equals(element)) {
      return true;
    }
    return this.rest.contains(element);
  }

  public Interface1 getRest() {
    return this.rest;
  }

  public IList getFirst() {
    return this.first;
  }

  public Interface1 removeInteger(Integer n) {
    if (this.first.contains(n)) {
      return new List(this.first.removeInteger(n), this.rest);
    }
    return this.rest.removeInteger(n);
  }

  public Interface1 removeAllInteger(Integer n) {
    if (this.first.contains(n)) {
      return new List(this.first.removeInteger(n), this.rest.removeAllInteger(n));
    } else {
      return new List(this.first, this.rest.removeInteger(n));
    }
  }
}

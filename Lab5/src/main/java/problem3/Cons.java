package problem3;

public class Cons implements IList {

  private Integer value;
  private IList rest;

  /**
   * construct a Cons
   *
   * @param value the value of the Cons
   * @param rest the rest part of the Cons
   */
  public Cons(Integer value, IList rest) {
    this.value = value;
    this.rest = rest;
  }

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  @Override
  public Integer size() {
    return 1 + this.rest.size();
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
  public IList add(Integer element) {
    return new Cons(this.value, this.rest.add(element));
  }

  @Override
  public boolean contains(Integer element) {
    if (this.value==element) {
      return true;
    }
    return this.rest.contains(element);
  }

  @Override
  public IList getRest() {
    return this.rest;
  }

  @Override
  public Integer getValue() {
    return this.value;
  }

  @Override
  public IList removeInteger(Integer n) {
    if (n==this.value) {
      return this.rest;
    }
    return new Cons(this.value, this.rest.removeInteger(n));
  }

  @Override
  public IList removeAllInteger(Integer n) {
    if (n==this.value) {
      return this.rest.removeAllInteger(n);
    }
    return new Cons(this.value, this.rest.removeAllInteger(n));
  }

  @Override
  public Integer sum() {
    return this.value + this.rest.sum();
  }
}

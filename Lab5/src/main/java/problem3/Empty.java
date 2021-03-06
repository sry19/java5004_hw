package problem3;

public class Empty implements IList {

  public Empty() {
  }

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   * Returns true if empty and false otherwise
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Given a new element {@code element} prepend it to this list
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  @Override
  public IList add(Integer element) {
    return new Cons(element, this);
  }

  @Override
  public boolean contains(Integer element) {
    return false;
  }

  @Override
  public IList getRest() {
    return null;
  }

  @Override
  public Integer getValue() {
    return null;
  }

  @Override
  public IList removeInteger(Integer n) {
    return null;
  }

  @Override
  public IList removeAllInteger(Integer n) {
    return null;
  }

  @Override
  public Integer sum() {
    return 0;
  }
}

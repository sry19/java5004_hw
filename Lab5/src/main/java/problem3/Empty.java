package problem3;

public class Empty implements IList {

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Integer length() {
    return 0;
  }

  @Override
  public Integer sum() {
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
  public IList add(IList element) {
    return this;
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
  public IList getFirst() {
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
}

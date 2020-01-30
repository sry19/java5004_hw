package problem2;

public class Set implements ISet{
  private Integer[] set;
  private int size;

  public Set(Integer[] set, int size) {
    this.set = set;
    this.size = size;
  }

  /**
   * Creates and returns an empty Set
   *
   * @return an empty set
   */
  @Override
  public Set emptySet() {
    Integer[] empty = {};
    Set newSet = new Set(empty,0);
    return newSet;
  }

  /**
   * Checks if the Set is empty. Returns true if the Set contains no items, false otherwise.
   *
   * @return true if the Set contains no items, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return null;
  }

  /**
   * adds an Integer to a set
   *
   * @param n an Integer
   * @return a set
   */
  @Override
  public Set add(Integer n) {
    return null;
  }

  /**
   * checks if there exists an Integer in the set
   *
   * @param n an Integer
   * @return true if the given Integer is in the Set, false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    return null;
  }

  /**
   * removes an Integer from the set
   *
   * @param n an Integer
   * @return Returns a copy of the Set with the given Integer removed. If the given Integer is not
   * in the Set, returns the Set as is.
   */
  @Override
  public Set remove(Integer n) {
    return null;
  }

  /**
   * Gets the number of items in the Set
   *
   * @return the size of the set
   */
  @Override
  public Integer size() {
    return null;
  }
}

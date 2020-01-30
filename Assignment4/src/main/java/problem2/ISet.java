package problem2;

public interface ISet {

  /**
   * Creates and returns an empty Set
   *
   * @return an empty set
   */
  Set emptySet();

  /**
   * Checks if the Set is empty. Returns true if the Set contains no items, false otherwise.
   *
   * @return true if the Set contains no items, false otherwise.
   */
  Boolean isEmpty();

  /**
   * adds an Integer to a set
   *
   * @param n an Integer
   * @return a set
   */
  Set add(Integer n);

  /**
   * checks if there exists an Integer in the set
   *
   * @param n an Integer
   * @return true if the given Integer is in the Set, false otherwise.
   */
  Boolean contains(Integer n);

  /**
   * removes an Integer from the set
   *
   * @param n an Integer
   * @return Returns a copy of the Set with the given Integer removed. If the given Integer is not
   * in the Set, returns the Set as is.
   */
  Set remove(Integer n);

  /**
   * Gets the number of items in the Set
   *
   * @return the size of the set
   */
  Integer size();
}

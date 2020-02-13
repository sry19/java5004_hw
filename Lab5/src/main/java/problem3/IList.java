package problem3;

import simpleRecursiveList.List;

public interface IList {
  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();

  Integer length();

  Integer sum();

  /**
   * Returns true if empty and false otherwise
   *
   */
  Boolean isEmpty();

  /**
   * Given a new element {@code element} prepend it to this list
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  IList add(IList element);

  boolean contains(Integer element);

  IList getRest();

  IList getFirst();

  IList removeInteger(Integer n);

  IList removeAllInteger(Integer n);

}

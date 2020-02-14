package problem3;

import simpleRecursiveList.List;

public interface IList {
  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();

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
  IList add(Integer element);

  boolean contains(Integer element);

  IList getRest();

  Integer getValue();

  IList removeInteger(Integer n);

  IList removeAllInteger(Integer n);

  Integer sum();
}

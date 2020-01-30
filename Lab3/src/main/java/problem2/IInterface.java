package problem2;

/**
 * The interface Interface.
 */
public interface IInterface {

  /**
   * Is empty boolean.
   *
   * @return the boolean
   */
  boolean isEmpty();

  /**
   * Size int.
   *
   * @return the int
   */
  int size();

  /**
   * Contains boolean.
   *
   * @param s the s
   * @return the boolean
   */
  boolean contains(String s);

  /**
   * Contains all boolean.
   *
   * @param stringArray the string array
   * @return the boolean
   */
  boolean containsAll(LinkedListOfStrings stringArray);

  /**
   * Filter larger than linked list of strings.
   *
   * @param length the length
   * @return the linked list of strings
   */
  LinkedListOfStrings filterLargerThan(int length);

  /**
   * Has duplicates boolean.
   *
   * @return the boolean
   */
  boolean hasDuplicates();

  /**
   * Remove duplicates linked list of strings.
   *
   * @return the linked list of strings
   */
  LinkedListOfStrings removeDuplicates();
}

package problem2;

/**
 * The interface Bag of words.
 */
public interface IBagOfWords {

  /**
   * If the bag is empty
   *
   * @return the boolean
   */
  Boolean isEmpty();

  /**
   * Size of bag
   *
   * @return the integer
   */
  Integer size();

  /**
   * Add string to bag
   *
   * @param s the s
   * @return the bag of words
   */
  IBagOfWords add(String s);

  /**
   * Check if the bag contains the string
   *
   * @param s the s
   * @return the boolean
   */
  Boolean contains(String s);
}

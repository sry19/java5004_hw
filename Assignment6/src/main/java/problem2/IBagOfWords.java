package problem2;

/**
 * The interface Bag of words.
 */
public interface IBagOfWords {

  /**
   * Is empty boolean.
   *
   * @return the boolean
   */
  Boolean isEmpty();

  /**
   * Size integer.
   *
   * @return the integer
   */
  Integer size();

  /**
   * Add bag of words.
   *
   * @param s the s
   * @return the bag of words
   */
  IBagOfWords add(String s);

  /**
   * Contains boolean.
   *
   * @param s the s
   * @return the boolean
   */
  Boolean contains(String s);
}

package problem2;

/**
 * The type Bag of words.
 */
public class BagOfWords implements IBagOfWords {

  private ILinkedList strings;

  private BagOfWords() {
    this.strings = new EmptyNode();
  }

  private BagOfWords(ILinkedList e) {
    this.strings = e;
  }

  /**
   * creates empty bag of words.
   *
   * @return the bag of words
   */
  public static IBagOfWords emptyBagOfWords() {
    return new BagOfWords();
  }

  /**
   * check if the bag is empty
   *
   * @return the boolean
   */
  @Override
  public Boolean isEmpty() {
    if (this.strings.count().equals(0)) {
      return true;
    }
    return false;
  }

  /**
   * the size of the bag.
   *
   * @return the integer
   */
  @Override
  public Integer size() {
    return this.strings.count();
  }

  /**
   * Add s to bag of words.
   *
   * @param s the s
   * @return the bag of words
   */
  @Override
  public IBagOfWords add(String s) {
    return new BagOfWords(this.strings.add(s));
  }

  /**
   * checks if the string is in the bag
   *
   * @param s the s
   * @return the boolean
   */
  @Override
  public Boolean contains(String s) {
    return this.strings.contains(s);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BagOfWords that = (BagOfWords) o;

    return strings.equals(that.strings);
  }

  @Override
  public int hashCode() {
    return strings.hashCode();
  }

  @Override
  public String toString() {
    return "BagOfWords{" +
        "strings=" + strings +
        '}';
  }
}

package problem2;

/**
 * The type Author.
 */
public class Author extends Individual {

  /**
   * Instantiates a new Author.
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public Author(String firstName, String lastName) {
    super(firstName, lastName);
  }

  @Override
  public Boolean match(Creators creator) {
    if (creator instanceof Author) {
      if (this.equals(creator)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Author{" + super.toString() + "}";
  }
}

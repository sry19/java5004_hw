package problem2;

/**
 * The type Book.
 */
public class Book extends Item {

  /**
   * Instantiates a new Book.
   *
   * @param creators     the creators
   * @param title        the title
   * @param releasedYear the released year
   */
  public Book(Author creators, String title, Integer releasedYear) {
    super(creators, title, releasedYear);
  }

  @Override
  public String toString() {
    return "Book {" + super.toString() + "}";
  }
}

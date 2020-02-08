package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

  Author author;
  Author author1;
  Book book;
  Book book1;
  Book book2;
  Book book3;
  Book book4;

  @Before
  public void setUp() throws Exception {
    author = new Author("aa", "bb");
    author1 = new Author("aa", "bc");
    book = new Book(author, "title", 2019);
    book1 = new Book(author1, "title", 2019);
    book2 = new Book(author, "tt", 2019);
    book3 = new Book(author, "title", 2020);
    book4 = new Book(author, "title", 2019);
  }

  @Test
  public void getCreators() {
    assertEquals(author, book.getCreators());
  }

  @Test
  public void getTitle() {
    assertEquals("title", book.getTitle());
  }

  @Test
  public void getReleasedYear() {
    assertTrue(2019 == book.getReleasedYear());
  }

  @Test
  public void testEquals() {
    assertTrue(book.equals(book));
    assertTrue(book.equals(book4));
    assertFalse(book.equals(book1));
    assertFalse(book.equals(book2));
    assertFalse(book.equals(book3));
    assertFalse(book.equals(null));
    assertFalse(book.equals(author));
  }

  @Test
  public void testHashCode() {
    assertEquals(book.hashCode(), book4.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(
        "Book {Item {creators = Author{Individual{firstName='aa', lastName='bb'}}, title = title, releasedYear = 2019}}",
        book.toString());
  }
}
package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

  Author author;
  Author author1;
  Author author2;
  Author author3;
  RecordingArtist recordingArtist;

  @Before
  public void setUp() throws Exception {
    author = new Author("first", "last");
    author1 = new Author("first", "last");
    author2 = new Author("first", "las");
    author3 = new Author("firs", "last");
    recordingArtist = new RecordingArtist("first", "last");
  }

  @Test
  public void match() {
    assertTrue(author.match(author));
    assertFalse(author.match(author2));
  }

  @Test
  public void testEquals() {
    assertTrue(author.equals(author1));
    assertFalse(author.equals(author2));
    assertFalse(author.equals(author3));
    assertFalse(author.equals(null));
    assertFalse(author.equals(recordingArtist));
  }

  @Test
  public void testHashCode() {
    assertEquals(author.hashCode(), author.hashCode());
    assertEquals(author.hashCode(), author1.hashCode());
    assertNotEquals(author.hashCode(), author2.hashCode());
    assertNotEquals(author.hashCode(), author3.hashCode());
  }
}
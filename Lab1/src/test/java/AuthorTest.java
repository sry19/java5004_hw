import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

  Person amyPerson;
  Author amy;
  Email amyEmail;
  Address amyAddress;

  @Before
  public void setUp() throws Exception {
    amyPerson = new Person("Amy", "Brown");
    amyEmail = new Email("123", "org");
    amyAddress = new Address(1260, "Republican Street", "Seattle", "WA",
        98109, "USA");
    amy = new Author(amyPerson, amyEmail, amyAddress);

  }

  @Test
  public void getPerson() {
    assertEquals(amyPerson, amy.getPerson());
  }

  @Test
  public void getEmail() {
    assertEquals(amyEmail, amy.getEmail());
  }

  @Test
  public void getAddress() {
    assertEquals(amyAddress, amy.getAddress());
  }
}
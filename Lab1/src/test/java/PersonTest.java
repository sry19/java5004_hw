import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

  Person aPerson;

  @Before
  public void setUp() throws Exception {
    aPerson = new Person("Amy", "Brown");
  }

  @Test
  public void getFirstName() {
    assertEquals("Amy", aPerson.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Brown", aPerson.getLastName());
  }
}
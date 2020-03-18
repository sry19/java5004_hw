package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CheckPhoneNumberTest {

  CheckPhoneNumber records;

  @Before
  public void setUp() throws Exception {
    ArrayList<String> n = new ArrayList<>();
    n.add("Bill Gates:1 Infinite Loop:(425) 524-1234:Redmond");
    n.add("Bonnie Dunbar:Museum of Flight:206.764.5720:Seattle");
    n.add("Ichiro:Seattle Mariners:206-346-4000:Seattle");
    n.add("Ichiro:Seattle Mariners:206-346-400:Seattle");
    records = new CheckPhoneNumber(n);
  }

  @Test
  public void recordParserAll() {
    assertEquals(
        "[Bill Gates:1 Infinite Loop:425.524.1234:Redmond, Bonnie Dunbar:Museum of Flight:206.764.5720:Seattle, Ichiro:Seattle Mariners:206.346.4000:Seattle, Ichiro:Seattle Mariners:**no match**:Seattle]",
        records.recordParserAll().toString());
  }

  @Test
  public void phoneNumberParser() {
    assertEquals("425.524.1234", records.phoneNumberParser("(425) 524-1234"));
    assertEquals("206.346.4000", records.phoneNumberParser("206-346-4000"));
    assertEquals("206.222.2223", records.phoneNumberParser("206.222.2223"));
    assertEquals("**no match**", records.phoneNumberParser("22.234.3456"));
  }
}
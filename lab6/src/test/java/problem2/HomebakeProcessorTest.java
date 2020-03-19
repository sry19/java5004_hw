package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class HomebakeProcessorTest {

  HomebakeProcessor processor;
  String[] args;

  HomebakeProcessor processor2;
  String[] args2;

  HomebakeProcessor processor3;
  String[] args3;

  HomebakeProcessor processor4;
  String[] args4;

  @Before
  public void setUp() throws Exception {
    processor = new HomebakeProcessor();
    args = new String[3];
    args[0] = "-install";
    args[1] = "-hq";
    args[2] = "-q";

    processor2 = new HomebakeProcessor();
    args2 = new String[5];
    args2[0] = "-uninstall";
    args2[1] = "-v";
    args2[2] = "-q";
    args2[3] = "-d";
    args2[4] = "-dfn";

    processor3 = new HomebakeProcessor();
    args3 = new String[6];
    args3[0] = "-uninstall";
    args3[1] = "-v";
    args3[2] = "-q";
    args3[3] = "-d";
    args3[4] = "-dfn";
    args3[5] = "-uninstall";

    processor4 = new HomebakeProcessor();
    args4 = new String[3];
    args4[0] = "-install";
    args4[1] = "-hq";
    args4[2] = "-v";
  }

  @Test(expected = InvalidArgumentException.class)
  public void invalidargumentparser() {
    processor3.argumentParser(args3);
  }

  @Test(expected = InvalidArgumentException.class)
  public void invalidargumentparser2() {
    HomebakeProcessor processor = new HomebakeProcessor();
    String[] args = new String[2];
    args[0] = "-install";
    args[1] = "-uninstall";
    processor.argumentParser(args);
  }

  @Test(expected = InvalidArgumentException.class)
  public void invalidargumentparser3() {
    HomebakeProcessor processor = new HomebakeProcessor();
    String[] args = new String[2];
    args[0] = "-hq";
    args[1] = "-unins";
    processor.argumentParser(args);
  }

  @Test(expected = InvalidArgumentException.class)
  public void invalidargumentparser4() {
    HomebakeProcessor processor = new HomebakeProcessor();
    String[] args = new String[2];
    args[0] = "-q";
    args[1] = "-v";
    processor.argumentParser(args);
  }

  @Test
  public void argumentParser() {
    processor.argumentParser(args);
    processor2.argumentParser(args2);
  }

  @Test
  public void getOperation() {
    processor.argumentParser(args);
    assertEquals("-install", processor.getOperation());
  }

  @Test
  public void getFormula() {
    processor.argumentParser(args);
    assertEquals("-hq", processor.getFormula());
  }

  @Test
  public void getWarningsFlag() {
    processor.argumentParser(args);
    assertEquals("-q", processor.getWarningsFlag());
  }

  @Test
  public void getVerboseFlag() {
    processor.argumentParser(args);
    assertNull(processor.getVerboseFlag());
  }

  @Test
  public void getDebugFlag() {
    processor.argumentParser(args);
    assertNull(processor.getDebugFlag());
  }

  @Test
  public void testEquals() {
    processor.argumentParser(args);
    processor2.argumentParser(args2);
    processor4.argumentParser(args4);
    assertFalse(processor.equals(new ArrayList<String>()));
    assertNotEquals(processor, processor2);
    assertEquals(processor, processor);
    assertNotEquals(null, processor);
    assertNotEquals(processor, processor4);
  }

  @Test
  public void testHashcode() {
    processor.argumentParser(args);
    assertEquals(processor.hashCode(), processor.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("HomebakeProcessor{operation='null', formula='null', warningsFlag='null', verboseFlag='null', debugFlag='null'}", processor.toString());
  }
}
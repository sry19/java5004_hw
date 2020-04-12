package reservationsystem.controller.commandlineparser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import reservationsystem.controller.OptionConstants;
import reservationsystem.controller.commandlineparser.exceptions.InvalidSplitterException;

public class OptionTest {
  Option option1, option2;
  Option option3, option4,option5,option6,option7,option8,option9,option10;

  @Before
  public void setUp() throws Exception {
    option1 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option2 = new Option.Builder(OptionConstants.SHOW)
        .addDescription(OptionConstants.SHOW_DES)
        .addRequired(false).addHasSubArg(false).addHasSubArgs(true)
        .build();

    option3 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option4 = new Option(option1,new String[]{"1","3"});

    option5 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(true).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option6 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(true).addHasSubArg(false).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option7 = new Option.Builder("SDF")
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option8 = new Option.Builder("SDF")
        .addDescription("sd")
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();

    option9 = new Option.Builder("SDF")
        .addDescription("sd")
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .addArgSplitter(",")
        .build();

    option10 = new Option.Builder("SDF")
        .addDescription("sd")
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName("ewf")
        .addArgSplitter(",")
        .build();

  }

  @Test(expected = InvalidSplitterException.class)
  public void invalidSplitter() throws InvalidSplitterException {
    Option option = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(true).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .addArgSplitter(" ")
        .build();
  }

  @Test
  public void updateValue() {
    option1 = option1.updateValue("3");
    assertEquals("3", this.option1.getValue());
  }

  @Test
  public void printUsage() {
    option1.printUsage();
  }

  @Test
  public void getName() {
    assertEquals(OptionConstants.RESERVE, option1.getName());
  }

  @Test
  public void getDescription() {
    assertEquals(OptionConstants.RESERVE_DES, option1.getDescription());
  }

  @Test
  public void isRequired() {
    assertFalse(this.option1.isRequired());
  }

  @Test
  public void hasSubArg() {
    assertTrue(this.option1.hasSubArg());
  }

  @Test
  public void hasSubArgs() {
    assertFalse(this.option1.hasSubArgs());
  }

  @Test
  public void getArgSplitter() {
    assertNull(this.option1.getArgSplitter());
  }

  @Test
  public void getArgName() {
    assertEquals(OptionConstants.RESERVE_ARG_NAME, this.option1.getArgName());
  }

  @Test
  public void getValue() {
    this.option1 = this.option1.updateValue("3");
    assertEquals(this.option1.getValue(), "3");
  }

  @Test
  public void getValues() {
    assertNull(this.option1.getValues());
  }

  @Test
  public void getDependencies() {
    assertNull(this.option1.getDependencies());
  }

  @Test
  public void testEquals() {
    assertEquals(this.option1, this.option1);
    assertNotEquals(this.option1, null);
    assertNotEquals(this.option1, new String[]{});
    assertEquals(this.option1, option3);
    assertNotEquals(this.option1, this.option2);
    assertNotEquals(this.option1, this.option4);
    assertNotEquals(this.option1, this.option5);
    assertNotEquals(this.option5, this.option6);
    assertNotEquals(this.option7, this.option1);
    assertNotEquals(this.option7, this.option8);
    assertNotEquals(this.option9, this.option8);
    assertNotEquals(this.option9, this.option10);
  }

  @Test
  public void testHashCode() {
    assertEquals(option1.hashCode(),option3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Option{name='reserve', description='reserves seats', required=false, hasSubArg=true, hasSubArgs=false, argSplitter='null', argName='<number>', value='null', values=null, dependencies=null}",option1.toString());
  }
}
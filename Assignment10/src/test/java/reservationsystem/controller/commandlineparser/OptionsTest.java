package reservationsystem.controller.commandlineparser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import reservationsystem.controller.OptionConstants;
import reservationsystem.controller.TaskManagerOptionsBuilder;
import reservationsystem.controller.commandlineparser.exceptions.OptionExistedException;

public class OptionsTest {

  Options options1, options2;

  @Before
  public void setUp() throws Exception {
    this.options1 = TaskManagerOptionsBuilder.build();
    this.options2 = TaskManagerOptionsBuilder.build();
  }

  @Test(expected = OptionExistedException.class)
  public void addExistedOption() throws OptionExistedException {
    Option option = new Option.Builder(OptionConstants.SHOW).build();
    this.options1.addOption(option);
  }

  @Test
  public void testEquals() {
    assertEquals(this.options1, this.options1);
    assertNotEquals(this.options1, null);
    assertNotEquals(this.options1, new String[]{});
  }
  @Test
  public void addOption() {
  }

  @Test
  public void updateOption() {
  }

  @Test
  public void hasOption() {
  }

  @Test
  public void getOptionValue() {
  }

  @Test
  public void getOptionValues() {
  }

  @Test
  public void getOption() {
  }

  @Test
  public void printUsage() {
    options1.printUsage();
  }

  @Test
  public void iterator() {
  }

  @Test
  public void testHashCode() {
    assertEquals(options1.hashCode(),options2.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Options{optionMap={reserve=Option{name='reserve', description='reserves seats', required=false, hasSubArg=true, hasSubArgs=false, argSplitter='null', argName='<number>', value='null', values=null, dependencies=null}, show=Option{name='show', description='shows current available seats', required=false, hasSubArg=false, hasSubArgs=false, argSplitter='null', argName='null', value='null', values=null, dependencies=null}}}",options1.toString());
  }
}
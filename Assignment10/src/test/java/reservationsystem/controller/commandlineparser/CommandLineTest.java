package reservationsystem.controller.commandlineparser;

import static org.junit.Assert.*;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Before;
import org.junit.Test;
import reservationsystem.controller.TaskManagerOptionsBuilder;

public class CommandLineTest {

  CommandLine commandLine1, commandLine2,commandLine3;

  @Before
  public void setUp() throws Exception {
    this.commandLine1 = new CommandLine(TaskManagerOptionsBuilder.build());
    Option option = new Option.Builder("test").addDescription("testOption").build();
    Options options = TaskManagerOptionsBuilder.build();
    options.addOption(option);
    this.commandLine2 = new CommandLine(options);
    Option option1 = new Option.Builder("test").addDescription("testOption").addHasSubArg(true).addHasSubArgs(true).addArgSplitter(",").build();
    option1.updateValue("as,d");
    Options options1 = TaskManagerOptionsBuilder.build();
    options1.addOption(option1);
    this.commandLine3 = new CommandLine(options1);
  }

  @Test
  public void hasOption() {
    assertTrue(this.commandLine2.hasOption("test"));
  }

  @Test
  public void getOptionValue() {
    assertEquals(null,this.commandLine3.getOptionValue("test"));
  }

  @Test
  public void getOptionValues() {
    assertNull(this.commandLine3.getOptionValues("test"));
  }

  @Test
  public void testEquals() {
    assertEquals(this.commandLine1, this.commandLine1);
    assertNotEquals(this.commandLine1, null);
    assertNotEquals(this.commandLine1, new String[]{});
    assertNotEquals(this.commandLine1, this.commandLine2);
  }

  @Test
  public void testHashCode() {
    assertNotEquals(this.commandLine1.hashCode(), this.commandLine2.hashCode());
    assertEquals(this.commandLine1.hashCode(), this.commandLine1.hashCode());
  }

  @Test
  public void testToString() {
    System.out.println(this.commandLine1);
  }
}

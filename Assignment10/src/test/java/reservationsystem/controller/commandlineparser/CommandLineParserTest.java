package reservationsystem.controller.commandlineparser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import reservationsystem.controller.OptionConstants;
import reservationsystem.controller.TaskManagerOptionsBuilder;
import reservationsystem.controller.commandlineparser.exceptions.InvalidSplitterException;
import reservationsystem.controller.commandlineparser.exceptions.OptionExistedException;

public class CommandLineParserTest {

  CommandLineParser commandLineParser, commandLineParser2,commandLineParser3;

  @Before

  public void setUp() throws Exception {
    commandLineParser = new CommandLineParser();
    commandLineParser2 = new CommandLineParser();
    String[] args = {"show", "src/main/resources/maintest.csv", "--display"};
    commandLineParser2.parse(TaskManagerOptionsBuilder.build(), args);
  }

  @Test
  public void parse() throws OptionExistedException, InvalidSplitterException {
    Option option1 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();
    Option option2 = new Option.Builder(OptionConstants.RESERVE)
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(true).addHasSubArgs(false)
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();
    Options options = new Options();
    options.addOption(option1);
    String[] args1 = {"reserve", "11"};
    option2.updateValue("11");
    Options options1 = new Options();
    options1.addOption(option2);
    commandLineParser.parse(options,args1);
    String[] args2 = {"reserve"};
    commandLineParser.parse(options,args2);
    String[] args3 = {"reserve", "11","reserve", "11"};
    commandLineParser.parse(options,args3);
    String[] args4 = {"show","reserve", "11"};
    commandLineParser.parse(options,args4);
    Option option3 = new Option.Builder("test")
        .addDescription(OptionConstants.RESERVE_DES)
        .addRequired(false).addHasSubArg(false).addHasSubArgs(false)
        .addArgSplitter(",")
        .addArgName(OptionConstants.RESERVE_ARG_NAME)
        .build();
    options1.addOption(option3);
    String[] args5 = {"show","reserve", "11","test","1,2"};
    commandLineParser.parse(options1,args5);
  }

  @Test
  public void testEquals() {
    assertEquals(this.commandLineParser, this.commandLineParser);
    assertNotEquals(this.commandLineParser, null);
    assertNotEquals(this.commandLineParser, new String[]{});
    assertNotEquals(this.commandLineParser, this.commandLineParser2);

  }

  @Test
  public void testHashCode() {
    assertEquals(this.commandLineParser.hashCode(), this.commandLineParser.hashCode());
  }

  @Test
  public void testToString() {
    TaskManagerOptionsBuilder taskManagerOptionsBuilder = new TaskManagerOptionsBuilder();
    assertEquals("CommandLineParser{options=Options{optionMap={}}}",commandLineParser.toString());
  }
}
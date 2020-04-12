package reservationsystem.controller.tools;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayHelperTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void combineAll() {
    assertArrayEquals(new String[]{"1","2"}, tools.ArrayHelper.combineAll(new String[]{"1"},new String[]{"2"}));
    assertArrayEquals(new String[]{"1","2"},tools.ArrayHelper.combineAll(new String[]{"1","2"},null));
    assertArrayEquals(new String[]{"1","2"},tools.ArrayHelper.combineAll(null,new String[]{"1","2"}));
  }
}
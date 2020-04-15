package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class TrendingTopicsTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void countTopics() {
    List<String> input = new ArrayList<String>();
    input.add("seattle");
    input.add("wildfires");
    input.add("wildfires");
    Map<String,Long> result = new HashMap<>();
    result.put("wildfires", (long) 2);
    result.put("seattle", (long) 1);
    assertEquals(result, TrendingTopics.countTopics(input));
  }
}
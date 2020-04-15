package problem1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrendingTopics {
  public static Map<String,Long> countTopics(List<String> input) {
    Map<String,Long> result = input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    return result;
  }
}

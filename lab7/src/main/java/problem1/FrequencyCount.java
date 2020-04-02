package problem1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Frequency count.
 */
public class FrequencyCount {

  /**
   * Count frequency map.
   *
   * @param integerList the integer list
   * @return the map
   */
  public static Map<Integer, Double> countFrequency(List<Integer> integerList) {
    Map<Integer, Double> map = new HashMap<>();
    if (integerList == null) {
      return map;
    }
    for (Integer integer : integerList) {
      map.put(integer, map.getOrDefault(integer, 0.0) + 1);
    }
    int n = integerList.size();
    for (Integer key : map.keySet()) {
      map.replace(key, map.get(key) / n);
    }
    return map;
  }

}

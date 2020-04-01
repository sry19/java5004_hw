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
  public Map<Integer, Double> countFrequency(List<Integer> integerList) {
    Map<Integer, Double> map = new HashMap<>();
    for (Integer integer : integerList) {
      if (map.containsKey(integer)) {
        map.put(integer, map.get(integer) + 1);
      } else {
        map.put(integer, 1.0);
      }
    }
    int n = integerList.size();
    for (Integer key : map.keySet()) {
      map.replace(key, map.get(key) / n);
    }
    return map;
  }

}

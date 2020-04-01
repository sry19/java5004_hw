package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FrequencyCountTest {

  FrequencyCount frequencyCount;

  @Before
  public void setUp() throws Exception {
    frequencyCount = new FrequencyCount();
  }

  @Test
  public void countFrequency() {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(1);
    integerList.add(1);
    integerList.add(2);
    integerList.add(2);
    integerList.add(3);
    integerList.add(3);
    integerList.add(4);
    integerList.add(4);
    integerList.add(4);
    assertEquals("{1=0.3, 2=0.2, 3=0.2, 4=0.3}", frequencyCount.countFrequency(integerList).toString());
  }
}
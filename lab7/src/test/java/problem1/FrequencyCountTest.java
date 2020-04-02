package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FrequencyCountTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void countFrequency() {
    List<Integer> integerList = Arrays.asList(1,1,1,2,2,3,3,4,4,4);

    assertEquals("{1=0.3, 2=0.2, 3=0.2, 4=0.3}", FrequencyCount.countFrequency(integerList).toString());

  }

  @Test
  public void countFrequency1() {
    assertEquals("{}", FrequencyCount.countFrequency(null).toString());
  }

}
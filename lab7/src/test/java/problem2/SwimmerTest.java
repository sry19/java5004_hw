package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SwimmerTest {

  Swimmer swimmer1;
  Swimmer swimmer2;
  Swimmer swimmer3;
  Swimmer swimmer4;

  @Before
  public void setUp() throws Exception {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(7.0);
    doubles.add(4.5);
    doubles.add(4.0);
    swimmer1 = new Swimmer("swimmer1", doubles, doubles,doubles,doubles);

    ArrayList<Double> doubles1 = new ArrayList<>();
    doubles1.add(4.0);
    doubles1.add(5.0);
    swimmer2 = new Swimmer("swimmer2", doubles1,doubles1,doubles1,doubles1);

    swimmer3 = new Swimmer("swimmer2",doubles1,doubles,doubles,doubles);
    swimmer4 = new Swimmer("swimmer2",doubles1,doubles1,doubles,doubles);
  }

  @Test
  public void getName() {
    assertEquals("swimmer1",swimmer1.getName());
  }

  @Test
  public void getButterfly50mTimes() {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(7.0);
    doubles.add(4.5);
    doubles.add(4.0);
    assertEquals(doubles, swimmer1.getButterfly50mTimes());
  }

  @Test
  public void getBackstroke50mTimes() {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(7.0);
    doubles.add(4.5);
    doubles.add(4.0);
    assertEquals(doubles, swimmer1.getBackstroke50mTimes());
  }

  @Test
  public void getBreaststroke50mTimes() {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(7.0);
    doubles.add(4.5);
    doubles.add(4.0);
    assertEquals(doubles, swimmer1.getBreaststroke50mTimes());
  }

  @Test
  public void getFreestyle50mTimes() {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(7.0);
    doubles.add(4.5);
    doubles.add(4.0);
    assertEquals(doubles, swimmer1.getFreestyle50mTimes());
  }

  @Test
  public void compareTo() {
    assertTrue(swimmer1.compareTo(swimmer2) == 1);
  }

  @Test
  public void testEquals() {
    assertNotEquals(swimmer1,swimmer2);
    assertEquals(swimmer1,swimmer1);
    assertFalse(swimmer1.equals(null));
    assertFalse(swimmer1.equals(new ArrayList<Integer>()));
    assertNotEquals(swimmer2,swimmer3);
    assertNotEquals(swimmer2,swimmer4);
  }

  @Test
  public void testHashCode() {
    assertEquals(-1109797665,swimmer1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Swimmer{name='swimmer1', butterfly50mTimes=[4.5, 7.0, 4.5, 4.0], backstroke50mTimes=[4.5, 7.0, 4.5, 4.0], breaststroke50mTimes=[4.5, 7.0, 4.5, 4.0], freestyle50mTimes=[4.5, 7.0, 4.5, 4.0]}",swimmer1.toString());
  }
}
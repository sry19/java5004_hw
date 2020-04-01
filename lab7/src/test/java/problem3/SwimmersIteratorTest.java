package problem3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import problem2.Swimmer;

public class SwimmersIteratorTest {

  Swimmer swimmer1;
  Swimmer swimmer2;
  Swimmer swimmer3;
  SwimmersIterator swimmersIterator;
  SwimmersIterator swimmersIterator1;

  @Before
  public void setUp() throws Exception {
    ArrayList<Double> doubles = new ArrayList<>();
    doubles.add(4.5);
    doubles.add(27.18);
    doubles.add(34.5);
    doubles.add(34.0);
    doubles.add(77.0);
    swimmer1 = new Swimmer("swimmer1", doubles, doubles,doubles,doubles);

    ArrayList<Double> doubles1 = new ArrayList<>();
    doubles1.add(4.0);
    doubles1.add(5.0);
    swimmer2 = new Swimmer("swimmer2", doubles1,doubles1,doubles1,doubles1);

    ArrayList<Double> doubles2 = new ArrayList<>();
    doubles2.add(4.5);
    doubles2.add(27.18);
    doubles2.add(34.5);
    doubles2.add(34.0);
    doubles2.add(77.0);
    swimmer3 = new Swimmer("swimmer3", doubles2, doubles2,doubles2,doubles2);

    ArrayList<Swimmer> swimmers = new ArrayList<>();
    swimmers.add(swimmer1);
    swimmers.add(swimmer2);
    swimmers.add(swimmer3);
    swimmersIterator = new SwimmersIterator(swimmers);
    swimmersIterator1 = new SwimmersIterator(swimmers);
  }

  @Test
  public void hasNext() {
    assertTrue(swimmersIterator.hasNext());
  }

  @Test
  public void next() {
    assertEquals(swimmer1, swimmersIterator.next());
    assertEquals(2, swimmersIterator.getCurrent());
    assertEquals(swimmer3, swimmersIterator.next());
  }

  @Test
  public void testEquals() {
    assertEquals(swimmersIterator, swimmersIterator1);
    assertEquals(swimmersIterator,swimmersIterator);
    assertFalse(swimmersIterator.equals(null));
    assertFalse(swimmersIterator.equals(swimmer1));
  }

  @Test
  public void testHashCode() {
    assertEquals(swimmersIterator1.hashCode(), swimmersIterator.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("SwimmersIterator{swimmerList=[Swimmer{name='swimmer1', butterfly50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], backstroke50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], breaststroke50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], freestyle50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0]}, Swimmer{name='swimmer2', butterfly50mTimes=[4.0, 5.0], backstroke50mTimes=[4.0, 5.0], breaststroke50mTimes=[4.0, 5.0], freestyle50mTimes=[4.0, 5.0]}, Swimmer{name='swimmer3', butterfly50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], backstroke50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], breaststroke50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0], freestyle50mTimes=[4.5, 27.18, 34.5, 34.0, 77.0]}], current=0}",swimmersIterator.toString());
  }

}
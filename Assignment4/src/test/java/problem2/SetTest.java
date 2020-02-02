package problem2;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class SetTest {

  Set set1;
  Set set2;
  Set set5;
  Set set6;
  Set set7;
  Set set8;
  Integer[] arr = {3, 4, 5};

  @Before
  public void setUp() throws Exception {
    set1 = new Set();

    set2 = new Set();
    set2 = set2.add(3);
    set2 = set2.add(4);

    set5 = new Set();
    set5 = set5.add(3);
    set5 = set5.add(4);
    set5 = set5.add(5);

    set6 = new Set();
    set6 = set6.add(4);
    set6 = set6.add(3);
    set6 = set6.add(5);

    set7 = new Set();
    set7 = set7.add(4);
    set7 = set7.add(3);
    set7 = set7.add(8);

    set8 = new Set();
    set8 = set8.add(8);
    set8 = set8.add(0);
    set8 = set8.add(4);
  }

  @Test
  public void getSet() {
    Set s = new Set();
    s = s.add(3);
    s = s.add(4);
    Integer[] a = {3, 4};
    assertArrayEquals(a, s.getSet());
  }

  @Test
  public void emptySet() {
    Set tSet = new Set();
    assertTrue(Set.emptySet().equals(tSet));
  }

  @Test
  public void isEmpty() {
    assertTrue(set1.isEmpty());
    assertFalse(set2.isEmpty());
  }

  @Test
  public void add() {
    Set tSet = new Set();
    tSet = tSet.add(3);
    tSet = tSet.add(3);
    tSet = tSet.add(8);
    tSet = tSet.add(4);
    Set newSet = set2.add(8);
    assertEquals(newSet, tSet);
    assertEquals(set2.add(4), set2);
  }

  @Test
  public void contains() {
    assertTrue(set2.contains(3));
    assertFalse(set2.contains(8));
  }

  @Test
  public void remove() {
    Set set4 = new Set();
    set4 = set4.add(3);

    Set set7 = new Set();
    set7 = set7.add(4);

    Set set9 = new Set();
    set9 = set9.add(4);
    set9 = set9.add(3);
    set9 = set9.add(8);
    set9 = set9.add(0);
    assertTrue(set2.remove(4).equals(set4));
    assertTrue(set2.remove(7).equals(set2));
    assertTrue(set2.remove(3).equals(set7));
    assertTrue(set9.remove(3).equals(set8));
  }

  @Test
  public void size() {
    assertTrue(set2.size() == 2);
  }

  @Test
  public void testEquals() {
    assertFalse(set5.equals(set2));
    assertTrue(set5.equals(set6));
    assertFalse(set5.equals(null));
    assertFalse(set5.equals(arr));
    assertFalse(set6.equals(set7));
  }

  @Test
  public void testHashCode() {
    assertTrue(set5.hashCode() == set6.hashCode());
    assertFalse(set5.hashCode() == set1.hashCode());
    assertTrue(set5.hashCode() == set5.hashCode());
  }

  @Test
  public void testToString() {
    String str = "Set{set=[3, 4], size=2}";
    assertEquals(str, set2.toString());
  }
}
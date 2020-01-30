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
  Integer[] arr = {3,4,5};

  @Before
  public void setUp() throws Exception {
    Integer[] arr1 = {};
    set1 = new Set(arr1, 0);
    Integer[] arr2 = {3, 4};
    set2 = new Set(arr2, 2);
    Integer[] arr5 = {3, 4, 5};
    set5 = new Set(arr5, 3);
    Integer[] arr6 = {4, 3, 5};
    set6 = new Set(arr6, 3);
    Integer[] arr7 = {4, 3, 8};
    set7 = new Set(arr7, 3);
    Integer[] arr8 = {8,0,4};
    set8 = new Set(arr8, 3);
  }

  @Test
  public void emptySet() {
    Integer[] arr = {};
    Set tSet = new Set(arr, 0);
    assertTrue(set2.emptySet().equals(tSet));
  }

  @Test
  public void isEmpty() {
    assertTrue(set1.isEmpty());
    assertFalse(set2.isEmpty());
  }

  @Test
  public void add() {
    Integer[] tArr = {3, 8, 4};
    Set tSet = new Set(tArr, 3);
    Set newSet = set2.add(8);
    assertEquals(newSet, tSet);
    assertEquals(set2.add(4),set2);
  }

  @Test
  public void contains() {
    assertTrue(set2.contains(3));
    assertFalse(set2.contains(8));
  }

  @Test
  public void remove() {
    Integer[] arr4 = {3};
    Set set4 = new Set(arr4, 1);
    Integer[] arr7 = {4};
    Set set7 = new Set(arr7, 1);
    Integer[] arr9 = {4, 3, 8,0};
    Set set9 = new Set(arr9, 4);
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
    System.out.print(set2.toString());
    assertEquals(str, set2.toString());
  }
}
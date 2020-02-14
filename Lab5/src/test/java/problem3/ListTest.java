package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

  IList empty1;
  IList cons1;

  IList empty2;
  IList cons2;

  IList empty3;
  IList cons3;

  Interface1 list1;
  Interface1 emptylist1;

  Interface1 list2;
  Interface1 emptylist2;

  @Before
  public void setUp() throws Exception {
    empty1 = new Empty();
    cons1 = new Cons(5, empty1);
    cons1 = cons1.add(4);

    empty2 = new Empty();
    cons2 = new Cons(2, empty2);
    cons2 = cons2.add(4);

    emptylist1 = new EmptyList();

    list1 = new List(cons1, emptylist1);
    list1 = list1.add(cons2);
  }

  @Test
  public void size() {
    assertTrue(2 == list1.size());
  }

  @Test
  public void length() {
    assertTrue(4==list1.length());
  }

  @Test
  public void sum() {
    assertTrue(15==list1.sum());
  }

  @Test
  public void isEmpty() {
    assertFalse(list1.isEmpty());
  }

  @Test
  public void add() {
    list1 = list1.add(cons2);
    assertEquals((Integer)21, list1.sum());
  }


  @Test
  public void removeInteger() {
    empty3 = new Empty();
    cons3 = new Cons(5, empty3);
    list2 = new List(cons3, emptylist2);
    list2 = list2.add(cons3);

    list1 = list1.removeInteger(4);
    assertTrue(11==list1.sum());
  }

  @Test
  public void removeAllInteger() {
    list1 = list1.removeAllInteger(4);
    assertEquals((Integer) 7,list1.sum());
  }
}
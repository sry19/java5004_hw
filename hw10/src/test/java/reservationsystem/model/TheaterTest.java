package reservationsystem.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TheaterTest {
  Theater theater;
  Theater theater1;
  Theater theater2;
  Theater theater3;

  @Before
  public void setUp() throws Exception {
    theater = new Theater("sd",6);
    theater1 = new Theater("sd",6);
    theater2 = new Theater("s",6);
    theater3 = new Theater("sd",4);
  }

  @Test
  public void testEquals() {
    assertEquals(theater,theater1);
    assertEquals(theater,theater);
    assertNotEquals(theater,theater2);
    assertNotEquals(theater,theater3);
    assertFalse(theater.equals(null));
    assertFalse(theater.equals(new ArrayList<String>()));
  }

  @Test
  public void testHashCode() {
    assertEquals(theater.hashCode(),theater1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Theater{name='sd', rowList=[  1  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   2  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   3  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   4  = = = = = = = = = = = = = = = =,   5  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,   6  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _], wheelchairAccessRow=[4]}",theater.toString());
  }

  @Test
  public void getName() {
    assertEquals("sd",theater.getName());
  }

  @Test
  public void getRowList() {
    List<Row> list = new ArrayList<>();
    list.add(new Row(1,false));
    list.add(new Row(2,false));
    list.add(new Row(3,false));
    list.add(new Row(4,true));
    assertEquals(list,theater3.getRowList());
  }

  @Test
  public void getWheelchairAccessRow() {
    List<Integer> list = new ArrayList<>();
    list.add(4);
    assertEquals(list,theater3.getWheelchairAccessRow());
  }
}
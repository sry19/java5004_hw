package reservationsystem.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class RowTest {
  Row row;
  Row row1;
  Row row2;
  Row row3;
  Row row4;

  @Before
  public void setUp() throws Exception {
    row = new Row(4,false);
    row1 = new Row(4,false);
    row2 = new Row(3,false);
    row3 = new Row(4,true);
  }

  @Test
  public void createRow() {
    assertTrue(Row.createRow(16).size() == 16);
  }

  @Test
  public void getRowNumber() {
    assertEquals(Integer.valueOf(4),row.getRowNumber());
  }

  @Test
  public void isWheelchairAccessible() {
    assertFalse(row.isWheelchairAccessible());
  }

  @Test
  public void getNumOfSeats() {
    assertEquals(Integer.valueOf(16),row.getNumOfSeats());
  }

  @Test
  public void setNumOfSeats() {
    row.setNumOfSeats(5);
    assertEquals(Integer.valueOf(5),row.getNumOfSeats());
  }

  @Test
  public void testEquals() {
    assertEquals(row,row1);
    assertEquals(row,row);
    assertNotEquals(row,row2);
    assertNotEquals(row,row3);
    assertFalse(row.equals(null));
    assertFalse(row.equals(new ArrayList<String>()));
  }

  @Test
  public void setWheelchairAccessible() {
    row.setWheelchairAccessible(true);
    assertTrue(row.isWheelchairAccessible());
  }

  @Test
  public void testHashCode() {
    assertEquals(row.hashCode(),row1.hashCode());
    assertNotEquals(row.hashCode(),row3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("  4  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _",row.toString());
    assertEquals("  4  = = = = = = = = = = = = = = = =",row3.toString());
  }
}
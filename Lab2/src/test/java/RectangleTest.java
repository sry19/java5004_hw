import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

  private Name name;
  private Rectangle rectangle;
  private Rectangle rectangle2;
  private Rectangle rectangle3;
  private Rectangle invalidWidth;
  private Rectangle invalidHeight;

  @Before
  public void setUp() throws Exception {
    rectangle = new Rectangle(3.0, 4.0, 5.0, 6.0);
    rectangle2 = new Rectangle(3.0, 4.0, 5.0, 6.0);
    rectangle3 = new Rectangle(3.0, 4.0, 9.0, 6.0);
    name = new Name("a", "b", "c");
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidWidth() {
    invalidWidth = new Rectangle(3.0, 4.0, 0, 6.0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void setInvalidHeight() {
    invalidHeight = new Rectangle(3.0, 4.0, 5.0, -3);
  }

  @Test
  public void area() {
    assertEquals((Double) 30.0, (Double) rectangle.area());
  }

  @Test
  public void perimeter() {
    assertEquals((Double) 22.0, (Double) rectangle.perimeter());
  }

  @Test
  public void resize() {
    Rectangle rec1 = new Rectangle(3.0, 4.0, 25.0, 30.0);
    assertEquals(rec1, rectangle.resize(25.0));
  }

  @Test
  public void testToString() {
    assertEquals(String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height " +
        "%.3f", 3.0, 4.0, 5.0, 6.0), rectangle.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(rectangle.equals(rectangle));
    assertTrue(rectangle.equals(rectangle2));
    assertFalse(rectangle.equals(rectangle3));
    assertFalse(rectangle.equals(name));
  }

  @Test
  public void testHashcode() {
    assertEquals(rectangle.hashCode(), rectangle2.hashCode());
    assertNotEquals(rectangle.hashCode(), rectangle3.hashCode());
  }
}
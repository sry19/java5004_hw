package problem2;

import static org.junit.Assert.*;

import com.sun.prism.shader.FillEllipse_LinearGradient_PAD_AlphaTest_Loader;
import org.junit.Before;
import org.junit.Test;

public class CubeTest {

  Cube cube1;
  @Before
  public void setUp() throws Exception {
    cube1 = new Cube(3,4,5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidWidth(){
    Cube cube2 = new Cube(0,3,4);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidHeight(){
    Cube cube3 = new Cube(3,0,5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidDepth(){
    Cube cube4 = new Cube(3,4,0);
  }

  @Test
  public void getWidth() {
    assertEquals(Integer.valueOf(3),cube1.getWidth());
  }

  @Test
  public void getHeight() {
    assertEquals(Integer.valueOf(4),cube1.getHeight());
  }

  @Test
  public void getDepth() {
    assertEquals(Integer.valueOf(5),cube1.getDepth());
  }
}
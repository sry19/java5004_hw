package problem2;

/**
 * The type Cube.
 */
public class Cube {

  private Integer width;
  private Integer height;
  private Integer depth;

  /**
   * Instantiates a new Cube.
   *
   * @param width  the width
   * @param height the height
   * @param depth  the depth
   * @throws IllegalArgumentException the illegal argument exception
   */
  public Cube(Integer width, Integer height, Integer depth) throws IllegalArgumentException {
    if (this.isValidInput(width, height, depth)) {
      this.width = width;
      this.height = height;
      this.depth = depth;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * checks if the inputs are valid
   *
   * @param width  the width
   * @param height the height
   * @param depth  the depth
   * @return true if they are valid, false otherwise
   */
  private boolean isValidInput(Integer width, Integer height, Integer depth) {
    final int MIN_LENGTH = 1;
    if (width >= MIN_LENGTH && height >= MIN_LENGTH && depth >= MIN_LENGTH) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Gets width.
   *
   * @return the width
   */
  public Integer getWidth() {
    return this.width;
  }

  /**
   * Gets height.
   *
   * @return the height
   */
  public Integer getHeight() {
    return this.height;
  }

  /**
   * Gets depth.
   *
   * @return the depth
   */
  public Integer getDepth() {
    return this.depth;
  }
}

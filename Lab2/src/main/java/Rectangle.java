import java.util.Objects;

/**
 * This class represents a rectangle.  It defines all the operations mandated by
 * the Shape interface
 */
public class Rectangle extends AbstractShape {
  private double width, height;

  /**
   * Constructs a rectangle object with the given location of its lower-left
   * corner and dimensions
   *
   * @param x      x coordinate of the lower-left corner of this rectangle
   * @param y      y coordinate of the lower-left corner of this rectangle
   * @param width  width of this rectangle
   * @param height height of this rectangle
   */
  public Rectangle(double x, double y, double width, double height) throws IllegalArgumentException{
    super(new Point2D(x, y));
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("message");
    }
    this.width = width;
    this.height = height;
  }

  /**
   * return area
   * @return area
   */
  @Override
  public double area() {
    return this.width * this.height;
  }

  /**
   * return perimeter
   * @return perimeter
   */
  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }

  /**
   *
   * @param factor factor of resizing
   * @return resized rectangle
   */
  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    return new Rectangle(
        this.reference.getX(),
        this.reference.getY(), sqrtFactor *
        this.width,
        sqrtFactor * this.height);
  }

  /**
   * return a string representing a rectangle
   * @return  a string representing a rectangle
   */
  public String toString() {
    return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height " +
            "%.3f",
        this.reference.getX(), this.reference.getY(), this.width, this
            .height);
  }

  /**
   * return True if two objects are equal,False otherwise
   * @param o the compared object
   * @return True if two objects are equal,False otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(rectangle.width, width) == 0 &&
        Double.compare(rectangle.height, height) == 0 && Double.compare(rectangle.reference.getX(),
        reference.getX()) == 0 &&
        Double.compare(rectangle.reference.getY(), reference.getY()) == 0;
  }

  /**
   * return hashcode
   * @return hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(width, height,reference.getX(),reference.getY());
  }
}
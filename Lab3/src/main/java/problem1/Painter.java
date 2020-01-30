package problem1;

/**
 * The type Painter.
 */
public class Painter extends AbstractExhibitsArtist {

  /**
   * Instantiates a new Painter.
   *
   * @param name     the name
   * @param age      the age
   * @param genre    the genre
   * @param awards   the awards
   * @param exhibits the exhibits
   * @throws OutOfRangeException the out of range exception
   */
  public Painter(Name name, Integer age, String[] genre, String[] awards,
      String[] exhibits) throws OutOfRangeException {
    super(name, age, genre, awards, exhibits);
  }
}
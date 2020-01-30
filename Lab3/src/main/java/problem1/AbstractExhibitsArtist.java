package problem1;

/**
 * The type Abstract exhibits artist.
 */
public abstract class AbstractExhibitsArtist extends AbstractArtist{

  private String[] exhibits;

  /**
   * Instantiates a new Abstract exhibits artist.
   *
   * @param name     the name
   * @param age      the age
   * @param genre    the genre
   * @param awards   the awards
   * @param exhibits the exhibits
   * @throws OutOfRangeException the out of range exception
   */
  public AbstractExhibitsArtist(Name name, Integer age, String[] genre, String[] awards, String[] exhibits)
      throws OutOfRangeException {
    super(name, age, genre, awards);
    this.exhibits = exhibits;
  }
}

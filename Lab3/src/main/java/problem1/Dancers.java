package problem1;

/**
 * The type Dancers.
 */
public class Dancers extends AbstractMultimediaActors {

  /**
   * Instantiates a new Dancers.
   *
   * @param name       the name
   * @param age        the age
   * @param genre      the genre
   * @param awards     the awards
   * @param movies     the movies
   * @param series     the series
   * @param multimedia the multimedia
   * @throws OutOfRangeException the out of range exception
   */
  public Dancers(Name name, Integer age, String[] genre, String[] awards,
      String[] movies, String[] series, String[] multimedia) throws OutOfRangeException {
    super(name, age, genre, awards, movies, series, multimedia);
  }
}

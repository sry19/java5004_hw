package problem1;

/**
 * The type Abstract multimedia actors.
 */
public class AbstractMultimediaActors extends AbstractArtist{

  private String[] movies;
  private String[] series;
  private String[] multimedia;

  /**
   * Instantiates a new Abstract multimedia actors.
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
  public AbstractMultimediaActors(Name name, Integer age, String[] genre, String[] awards,
      String[] movies, String[] series, String[] multimedia) throws OutOfRangeException {
    super(name, age, genre, awards);
    this.movies = movies;
    this.series = series;
    this.multimedia = multimedia;
  }

}

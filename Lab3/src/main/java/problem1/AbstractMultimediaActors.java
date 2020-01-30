package problem1;

public class AbstractMultimediaActors extends AbstractArtist{

  private String[] movies;
  private String[] series;
  private String[] multimedia;

  public AbstractMultimediaActors(Name name, Integer age, String[] genre, String[] awards,
      String[] movies, String[] series, String[] multimedia) throws OutOfRangeException {
    super(name, age, genre, awards);
    this.movies = movies;
    this.series = series;
    this.multimedia = multimedia;
  }

}

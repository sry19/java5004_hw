package problem1;

public class Filmmakers extends AbstractMultimediaActors{

  public Filmmakers(Name name, Integer age, String[] genre, String[] awards,
      String[] movies, String[] series, String[] multimedia) throws OutOfRangeException {
    super(name, age, genre, awards, movies, series, multimedia);
  }
}

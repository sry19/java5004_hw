package problem1;

public class AbstractExhibitsArtist extends AbstractArtist{

  private String[] exhibits;

  public AbstractExhibitsArtist(Name name, Integer age, String[] genre, String[] awards, String[] exhibits)
      throws OutOfRangeException {
    super(name, age, genre, awards);
    this.exhibits = exhibits;
  }
}

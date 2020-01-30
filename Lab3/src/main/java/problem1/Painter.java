package problem1;

public class Painter extends AbstractExhibitsArtist {

  public Painter(Name name, Integer age, String[] genre, String[] awards,
      String[] exhibits) throws OutOfRangeException {
    super(name, age, genre, awards, exhibits);
  }
}
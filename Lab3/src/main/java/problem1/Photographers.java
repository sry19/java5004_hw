package problem1;

public class Photographers extends AbstractExhibitsArtist{

  public Photographers(Name name, Integer age, String[] genre, String[] awards,
      String[] exhibits) throws OutOfRangeException {
    super(name, age, genre, awards, exhibits);
  }
}

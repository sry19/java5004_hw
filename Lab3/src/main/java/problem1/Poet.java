package problem1;

public class Poet extends AbstractArtist {
  private String publishingCompany;
  private String lastPublishedCollection;

  public Poet(Name name, Integer age, String[] genre, String[] awards, String publishingCompany, String lastPublishedCollection) throws OutOfRangeException {
    super(name, age, genre, awards);
    this.publishingCompany = publishingCompany;
    this.lastPublishedCollection = lastPublishedCollection;
  }
}

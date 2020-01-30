package problem1;

/**
 * The type Poet.
 */
public class Poet extends AbstractArtist {
  private String publishingCompany;
  private String lastPublishedCollection;

  /**
   * Instantiates a new Poet.
   *
   * @param name                    the name
   * @param age                     the age
   * @param genre                   the genre
   * @param awards                  the awards
   * @param publishingCompany       the publishing company
   * @param lastPublishedCollection the last published collection
   * @throws OutOfRangeException the out of range exception
   */
  public Poet(Name name, Integer age, String[] genre, String[] awards, String publishingCompany, String lastPublishedCollection) throws OutOfRangeException {
    super(name, age, genre, awards);
    this.publishingCompany = publishingCompany;
    this.lastPublishedCollection = lastPublishedCollection;
  }
}

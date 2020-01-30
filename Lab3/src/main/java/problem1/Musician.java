package problem1;

/**
 * The type Musician.
 */
public class Musician extends AbstractArtist {

  private String recordingCompany;
  private String lastRecordAlbum;

  /**
   * Instantiates a new Musician.
   *
   * @param name             the name
   * @param age              the age
   * @param genre            the genre
   * @param awards           the awards
   * @param recordingCompany the recording company
   * @param lastRecordAlbum  the last record album
   * @throws OutOfRangeException the out of range exception
   */
  public Musician(Name name, Integer age, String[] genre, String[] awards, String recordingCompany, String lastRecordAlbum)
      throws OutOfRangeException {
    super(name, age, genre, awards);
    this.recordingCompany = recordingCompany;
    this.lastRecordAlbum = lastRecordAlbum;
  }
}


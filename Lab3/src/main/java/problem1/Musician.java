package problem1;

public class Musician extends AbstractArtist {

  private String recordingCompany;
  private String lastRecordAlbum;

  public Musician(Name name, Integer age, String[] genre, String[] awards, String recordingCompany, String lastRecordAlbum)
      throws OutOfRangeException {
    super(name, age, genre, awards);
    this.recordingCompany = recordingCompany;
    this.lastRecordAlbum = lastRecordAlbum;
  }
}


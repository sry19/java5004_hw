package problem2;

/**
 * The type Recording artist.
 */
public class RecordingArtist extends Individual {

  /**
   * Instantiates a new Recording artist.
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public RecordingArtist(String firstName, String lastName) {
    super(firstName, lastName);
  }

  @Override
  public Boolean match(Creators creator) {
    if (creator instanceof RecordingArtist) {
      return this.equals(creator);
    }
    return false;
  }

  @Override
  public String toString() {
    return "RecordingArtist{" + super.toString() + "}";
  }
}

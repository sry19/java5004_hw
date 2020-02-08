package problem2;

/**
 * The type Music.
 */
public class Music extends Item {

  /**
   * Instantiates a new Music.
   *
   * @param creators     the creators
   * @param title        the title
   * @param releasedYear the released year
   */
  public Music(RecordingArtist creators, String title, Integer releasedYear) {
    super(creators, title, releasedYear);
  }

  /**
   * Instantiates a new Music.
   *
   * @param creators     the creators
   * @param title        the title
   * @param releasedYear the released year
   */
  public Music(Band creators, String title, Integer releasedYear) {
    super(creators, title, releasedYear);
  }

  @Override
  public String toString() {
    return "Music {" + super.toString() + "}";
  }
}

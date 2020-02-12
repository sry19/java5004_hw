package problem2;

import java.util.ArrayList;

/**
 * The type Band.
 */
public class Band extends Group {

  private String name;
  private ArrayList<RecordingArtist> members;

  /**
   * Instantiates a new Band.
   *
   * @param name    the name
   * @param members the members
   */
  public Band(String name, ArrayList<RecordingArtist> members) {
    this.name = name;
    this.members = members;
  }

  /**
   * Contains artist boolean.
   *
   * @param creators creators
   * @return the boolean
   */
  public Boolean match(ICreator creators) {
    return members.contains(creators);
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets members.
   *
   * @return the members
   */
  public ArrayList<RecordingArtist> getMembers() {
    return this.members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Band band = (Band) o;

    if (!name.equals(band.name)) {
      return false;
    }

    if (this.members.size() != band.getMembers().size()) {
      return false;
    }
    for (RecordingArtist recordingArtist : this.members) {
      for (int i = 0; i < band.getMembers().size(); i++) {
        if (band.getMembers().get(i).equals(recordingArtist)) {
          break;
        }
        if (i == band.getMembers().size() - 1) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    int sum = 0;
    for (RecordingArtist member : members) {
      sum = sum + member.hashCode();
    }
    return 31 * result + sum;
  }

  @Override
  public String toString() {
    return "Band{" +
        "name='" + name + '\'' +
        ", members=" + members +
        '}';
  }
}

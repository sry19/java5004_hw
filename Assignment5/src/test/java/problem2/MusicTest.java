package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class MusicTest {

  RecordingArtist recordingArtist;
  RecordingArtist recordingArtist1;
  RecordingArtist recordingArtist2;
  ArrayList<RecordingArtist> members;
  Band band;
  Music music;
  Music music1;

  @Before
  public void setUp() throws Exception {
    recordingArtist = new RecordingArtist("ab", "bc");
    music = new Music(recordingArtist, "title", 1996);

    recordingArtist1 = new RecordingArtist("cc", "dd");
    recordingArtist2 = new RecordingArtist("ee", "ff");
    members = new ArrayList<>();
    members.add(recordingArtist2);
    members.add(recordingArtist1);
    band = new Band("name", members);
    music1 = new Music(band, "tle", 2020);
  }

  @Test
  public void testToString() {
    assertEquals(
        "Music {Item {creators = RecordingArtist{Individual{firstName='ab', lastName='bc'}}, title = title, releasedYear = 1996}}",
        music.toString());
  }
}
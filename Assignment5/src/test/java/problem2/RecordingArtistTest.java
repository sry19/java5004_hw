package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecordingArtistTest {

  RecordingArtist recordingArtist;

  @Before
  public void setUp() throws Exception {
    recordingArtist = new RecordingArtist("as", "bc");
  }

  @Test
  public void testToString() {
    assertEquals("RecordingArtist{Individual{firstName='as', lastName='bc'}}",
        recordingArtist.toString());
  }
}
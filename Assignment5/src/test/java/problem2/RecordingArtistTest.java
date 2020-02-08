package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecordingArtistTest {

  RecordingArtist recordingArtist;
  RecordingArtist recordingArtist1;

  @Before
  public void setUp() throws Exception {
    recordingArtist = new RecordingArtist("as", "bc");
    recordingArtist1 = new RecordingArtist("ss","dd");
  }

  @Test
  public void testToString() {
    assertEquals("RecordingArtist{Individual{firstName='as', lastName='bc'}}",
        recordingArtist.toString());
  }

  @Test
  public void match() {
    assertTrue(recordingArtist.match(recordingArtist));
    assertFalse(recordingArtist.match(recordingArtist1));
  }
}
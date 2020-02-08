package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class BandTest {

  RecordingArtist recordingArtist;
  RecordingArtist recordingArtist1;
  RecordingArtist recordingArtist2;
  ArrayList<RecordingArtist> members;
  ArrayList<RecordingArtist> members1;
  ArrayList<RecordingArtist> members2;
  ArrayList<RecordingArtist> members3;
  Band band;
  Band band1;
  Band band2;
  Band band3;
  Band band4;

  @Before
  public void setUp() throws Exception {
    recordingArtist = new RecordingArtist("aa", "bb");
    recordingArtist1 = new RecordingArtist("cc", "dd");
    recordingArtist2 = new RecordingArtist("ee", "ff");
    members = new ArrayList<>();
    members.add(recordingArtist);
    members.add(recordingArtist1);
    band = new Band("name", members);

    members1 = new ArrayList<>();
    members1.add(recordingArtist1);
    members1.add(recordingArtist);
    band1 = new Band("name", members1);

    band2 = new Band("names", members);

    members2 = new ArrayList<>();
    members2.add(recordingArtist);
    band3 = new Band("name", members2);

    members3 = new ArrayList<>();
    members3.add(recordingArtist2);
    members3.add(recordingArtist);
    band4 = new Band("name", members3);
  }

  @Test
  public void match() {
    assertTrue(band.match(recordingArtist));
    assertFalse(band.match(recordingArtist2));
  }

  @Test
  public void getName() {
    assertEquals("name", band.getName());
  }

  @Test
  public void getMembers() {
    assertEquals(members, band.getMembers());
  }

  @Test
  public void testEquals() {
    assertTrue(band.equals(band1));
    assertFalse(band.equals(band2));
    assertFalse(band.equals(null));
    assertFalse(band.equals(members));
    assertTrue(band.equals(band));
    assertFalse(band.equals(band3));
    assertFalse(band.equals(band4));
  }

  @Test
  public void testHashCode() {
    assertEquals(band.hashCode(), band1.hashCode());
    assertNotEquals(band.hashCode(), band2.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(
        "Band{name='name', members=[RecordingArtist{Individual{firstName='aa', lastName='bb'}}, RecordingArtist{Individual{firstName='cc', lastName='dd'}}]}",
        band.toString());
  }
}
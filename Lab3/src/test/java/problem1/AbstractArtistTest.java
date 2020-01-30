package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AbstractArtistTest {

  Poet poet;

  @Before
  public void setUp() throws Exception {
    Name name = new Name("a","b");
    String[] aw = {"sd", "rf"};
    poet = new Poet(name, 34, null, aw, "sfd","erh");
  }

  @Test
  public void receiveAward() {
    AbstractArtist artist = poet.receiveAward("best");
    String[] ne = {"sd", "rf","best"};
    assertArrayEquals(ne, artist.getAwards());
  }
}
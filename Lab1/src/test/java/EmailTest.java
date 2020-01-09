import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    Email mark;

    @Before
    public void setUp() throws Exception {
        mark = new Email("mark", "a.b.com");
    }

    @Test
    public void getLoginName() {
        assertEquals("mark", mark.getLoginName());
    }

    @Test
    public void getDomain() {
        assertEquals("a.b.com", mark.getDomain());
    }
}
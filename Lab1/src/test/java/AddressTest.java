import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    Address myAddress;

    @Before
    public void setUp() throws Exception {
        myAddress = new Address(1260,"Republican Street", "Seattle", "WA",
                98109, "USA");
    }

    @Test
    public void getStreetNum() {
        assertEquals((Integer) 1260, myAddress.getStreetNum());
    }

    @Test
    public void getStreetName() {
        assertEquals("Republican Street", myAddress.getStreetName());
    }

    @Test
    public void getCityName() {
        assertEquals("Seattle",myAddress.getCityName());
    }

    @Test
    public void getStateAcronym() {
        assertEquals("WA",myAddress.getStateAcronym());
    }

    @Test
    public void getZipCodeNum() {
        assertEquals((Integer) 98109, myAddress.getZipCodeNum());
    }

    @Test
    public void getCountryName() {
        assertEquals("USA",myAddress.getCountryName());
    }
}
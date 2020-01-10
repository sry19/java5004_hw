package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {

    Amount amount;

    @Before
    public void setUp() throws Exception {
        amount = new Amount(50,467);
    }

    @Test
    public void getDollars() {
        assertEquals(54,amount.getDollars());
    }

    @Test
    public void getCents() {
        assertEquals(67, amount.getCents());
    }
}
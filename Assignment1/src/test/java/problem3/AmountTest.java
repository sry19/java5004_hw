package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {

    Amount amount;
    Amount amount1;

    @Before
    public void setUp() throws Exception {
        amount = new Amount(50,467);
        amount1 = new Amount(-2,35);
    }

    @Test
    public void getDollars() {
        assertEquals(54,amount.getDollars());
        assertEquals(0,amount1.getDollars());
    }

    @Test
    public void getCents() {
        assertEquals(67, amount.getCents());
        assertEquals(35, amount1.getCents());
    }
}
package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {

  Amount amount;
  Amount amount1;
  Amount amount2;

  @Before
  public void setUp() throws Exception {
    amount = new Amount(50, 467);
    amount1 = new Amount(-2, 35);
    amount2 = new Amount(3, -2);
  }

  @Test
  public void isValidDollars() {
    assertEquals(54, amount.getDollars());
    assertEquals(0, amount1.getDollars());
    assertEquals(3, amount2.getDollars());
  }

  @Test
  public void isValidCents() {
    assertEquals(67, amount.getCents());
    assertEquals(35, amount1.getCents());
    assertEquals(0, amount2.getCents());
  }

  @Test
  public void getDollars() {
    assertEquals(54, amount.getDollars());
    assertEquals(0, amount1.getDollars());
  }

  @Test
  public void getCents() {
    assertEquals(67, amount.getCents());
    assertEquals(35, amount1.getCents());
  }
}
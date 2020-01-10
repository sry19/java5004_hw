package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Holder holder;
    Amount amount;
    Amount depo;
    Amount withdr;
    Account account;

    @Before
    public void setUp() throws Exception {
        holder = new Holder("Amy","Brown");
        amount = new Amount(50,39);
        account = new Account(holder,amount);
    }

    @Test
    public void deposit() {
        depo = new Amount(30,100);
        Account newAccount = account.deposit(depo);
        assertEquals(39, newAccount.getAmount().getCents());
        assertEquals(81, newAccount.getAmount().getDollars());
    }

    @Test
    public void withdraw() {
        withdr = new Amount(30, 13);
        Account aNewAccount = account.withdraw(withdr);
        assertEquals(20, aNewAccount.getAmount().getDollars());
        assertEquals(26, aNewAccount.getAmount().getCents());
    }

    @Test
    public void getHolder() {
        assertEquals(holder,account.getHolder());
    }

    @Test
    public void getAmount() {
        assertEquals(amount,account.getAmount());
    }
}
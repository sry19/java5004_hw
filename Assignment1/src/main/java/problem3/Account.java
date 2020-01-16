package problem3;

/**
 * Account is a simple object that has a holder and an amount.
 */
public class Account {

  private Holder holder;
  private Amount amount;

  /**
   * Constructor that creates a bank account
   *
   * @param holder the account's holder
   * @param amount the account's amount
   */
  public Account(Holder holder, Amount amount) {
    this.holder = holder;
    this.amount = amount;
  }

  /**
   * deposit
   *
   * @param amount the account's amount
   * @return a new account
   */
  public Account deposit(Amount amount) {
    // the total cents
    int cents = this.amount.getCents() + amount.getCents();
    // the total dollars
    int dollars = this.amount.getDollars() + amount.getDollars();
    Amount newAmount = new Amount(dollars, cents);
    // return a new account
    return new Account(this.holder, newAmount);
  }

  /**
   * withdraw
   *
   * @param amount the account's amount
   * @return a new account
   */
  public Account withdraw(Amount amount) {
    // the total cents
    int cents = this.amount.getCents() - amount.getCents();
    // the total dollars
    int dollars = this.amount.getDollars() - amount.getDollars();
    Amount newAmount = new Amount(dollars, cents);
    // return a new account
    return new Account(this.holder, newAmount);
  }

  /**
   * return the account's holder
   *
   * @return the account's holder
   */
  public Holder getHolder() {
    return this.holder;
  }

  /**
   * return the account's amount
   *
   * @return the account's amount
   */
  public Amount getAmount() {
    return this.amount;
  }
}

package problem1;

/**
 * The type Gardening.
 */
public class Gardening extends AbstractExterior{

  private static final Integer WASTE_REMOVAL_FEE = 20;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public Gardening(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
    this.setExtraFee(WASTE_REMOVAL_FEE);
  }

  /**
   * Calculate the price of the service
   *
   * @return the price of the service
   */
  @Override
  public double calculatePrice() {
    this.updateDiscount();
    return (this.getBaseRate() * this.getHour() + this.getExtraFee()) * this.getDiscount();
  }

  /**
   * Calculate the rate of the extra fee
   */
  @Override
  public void calculateExtraFeeRate() {
    return;
  }
}

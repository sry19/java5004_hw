package problem1;

/**
 * The type Window cleaning.
 */
public class WindowCleaning extends AbstractExterior {

  private static final Integer MAX_FLOOR = 3;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   * @throws FloorExceedException the floor exceed exception
   */
  public WindowCleaning(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) throws FloorExceedException{
    super(address, size, carryOutMonthly, pets, floors);
    if (this.getFloors() > MAX_FLOOR) {
      throw new FloorExceedException();
    }
    calculateExtraFeeRate();
  }

  /**
   * Calculate the price of the service
   *
   * @return the price of the service
   */
  @Override
  public double calculatePrice() {
    this.updateDiscount();
    return (this.getBaseRate() * this.getHour() * (1+this.getExtraFeeRate())) * this.getDiscount();
  }

  /**
   * Calculate the rate of the extra fee
   */
  @Override
  public void calculateExtraFeeRate() {
    final double EXTRA_FLOOR_FEE_RATE = 0.05;
    if (this.getFloors() > 1){
      this.setExtraFeeRate(EXTRA_FLOOR_FEE_RATE);
    }
  }
}

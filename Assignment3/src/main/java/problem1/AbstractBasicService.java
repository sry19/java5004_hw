package problem1;

/**
 * The type Abstract basic service.
 */
public abstract class AbstractBasicService extends AbstractService implements BasicService{

  private static final Integer BASE_RATE = 80;
  private static final double INI_VAL = 0;
  private static final Integer INI_VAL_INT = 0;
  private static final double ORI_DISCOUNT = 1;
  private double discount;
  private double extraFeeRate;
  private double baseFee;
  private double hour;

  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public AbstractBasicService(String address, PropertySize size, boolean carryOutMonthly, Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
    this.setBaseRate(BASE_RATE);
    this.discount = ORI_DISCOUNT;
    this.extraFeeRate = INI_VAL;
    this.baseFee = INI_VAL;
    this.hour = this.calculateHour(size);
  }

  /**
   * calculates the hours needed
   *
   * @param size property size
   * @return the hours needed
   */
  @Override
  public Integer calculateHour(PropertySize size) {
    final Integer S_ONE_HOUR = 1;
    final Integer M_TWO_HOUR = 2;
    final Integer L_FOUR_HOUR = 4;

    switch (size) {
      case SMALL:
        return S_ONE_HOUR;
      case MEDIUM:
        return M_TWO_HOUR;
      case LARGE:
        return L_FOUR_HOUR;
    }
    return INI_VAL_INT;
  }

  public void updateDiscount() {
    final Integer TEN_TH_SERVICE = 10;
    final double TEN_TH_DISCOUNT = 0.5;
    final double MONTHLY_DISCOUNT = 0.9;

    if (this.getPreCarryOutTimes() % TEN_TH_SERVICE == TEN_TH_SERVICE - 1) {
      this.discount = TEN_TH_DISCOUNT;
    }
    else if (isCarryOutMonthly()) {
      this.discount = MONTHLY_DISCOUNT;
    }
  }

  /**
   * Gets base fee.
   *
   * @return the base fee
   */
  public double getBaseFee() {
    return this.baseFee;
  }

  /**
   * Sets base fee.
   *
   * @param baseFee the base fee
   */
  public void setBaseFee(double baseFee) {
    this.baseFee = baseFee;
  }

  /**
   * Gets discount.
   *
   * @return the discount
   */
  public double getDiscount() {
    return this.discount;
  }

  /**
   * Sets discount.
   *
   * @param discount the discount
   */
  public void setDiscount(double discount) {
    this.discount = discount;
  }

  /**
   * Gets extra fee rate.
   *
   * @return the extra fee rate
   */
  public double getExtraFeeRate() {
    return this.extraFeeRate;
  }

  /**
   * Sets extra fee rate.
   *
   * @param extraFeeRate the extra fee rate
   */
  public void setExtraFeeRate(double extraFeeRate) {
    this.extraFeeRate = extraFeeRate;
  }

  /**
   * Gets hour.
   *
   * @return the hour
   */
  public double getHour() {
    return this.hour;
  }

  /**
   * Sets hour.
   *
   * @param hour the hour
   */
  public void setHour(double hour) {
    this.hour = hour;
  }
}

package problem1;

import java.util.Objects;

/**
 * The type Abstract interior.
 */
public abstract class AbstractInterior extends AbstractBasicService {


  /**
   * constructor that initializes an instance
   *
   * @param address         the address of the property
   * @param size            the size of the property
   * @param carryOutMonthly true if it is carried out monthly, false otherwise
   * @param pets            the pets
   * @param floors          the floors
   */
  public AbstractInterior(String address, PropertySize size, boolean carryOutMonthly,
      Integer pets, Integer floors) {
    super(address, size, carryOutMonthly, pets, floors);
    calculateExtraFeeRate();
  }

  /**
   * Calculate the rate of the extra fee
   */
  @Override
  public void calculateExtraFeeRate() {
    final double LESS_FEE_RATE = 0.05;
    final double MORE_FEE_RATE = 0.07;
    final int ZERO = 0;
    final int ONE = 1;
    final int TWO = 2;

    switch ((int)this.getPets()) {
      case ZERO:
        break;
      case ONE:
      case TWO:
        this.setExtraFeeRate(LESS_FEE_RATE);
        break;
      default:
        this.setExtraFeeRate(MORE_FEE_RATE);
    }
  }

  /**
   * Calculate the price of the service
   *
   * @return the price of the service
   */
  @Override
  public double calculatePrice() {
    this.updateDiscount();
    return (this.getBaseRate() * this.getHour() * (1 + this.getExtraFeeRate())) * this
        .getDiscount();
  }

  @Override
  public String toString() {
    return "Interior {" + super.toString() + "}";
  }

}

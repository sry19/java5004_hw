package problem1;

public interface BasicService {
  /**
   * calculates the hours needed
   *
   * @param size property size
   * @return the hours needed
   */
  public Integer calculateHour(PropertySize size);

  /**
   * Calculate the rate of the extra fee
   */
  public void calculateExtraFeeRate();
}

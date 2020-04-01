package problem2;

import java.util.List;

/**
 * The type Swimmer.
 */
/*Class Swimmer contains information about a swimmer, and the list of their swimming times, when swimming 50m. Four swimming styles are considered: butterfly, backstroke, breaststroke, and freestyle.
 */
public class Swimmer implements Comparable<Swimmer> {

  private String name;
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;

  /**
   * Instantiates a new Swimmer.
   *
   * @param name                 the name
   * @param butterfly50mTimes    the butterfly 50 m times
   * @param backstroke50mTimes   the backstroke 50 m times
   * @param breaststroke50mTimes the breaststroke 50 m times
   * @param freestyle50mTimes    the freestyle 50 m times
   */
  public Swimmer(String name, List<Double> butterfly50mTimes, List<Double> backstroke50mTimes,
      List<Double> breaststroke50mTimes, List<Double> freestyle50mTimes) {
    this.name = name;
    this.butterfly50mTimes = butterfly50mTimes;
    this.backstroke50mTimes = backstroke50mTimes;
    this.breaststroke50mTimes = breaststroke50mTimes;
    this.freestyle50mTimes = freestyle50mTimes;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets butterfly 50 m times.
   *
   * @return the butterfly 50 m times
   */
  public List<Double> getButterfly50mTimes() {
    return butterfly50mTimes;
  }

  /**
   * Gets backstroke 50 m times.
   *
   * @return the backstroke 50 m times
   */
  public List<Double> getBackstroke50mTimes() {
    return backstroke50mTimes;
  }

  /**
   * Gets breaststroke 50 m times.
   *
   * @return the breaststroke 50 m times
   */
  public List<Double> getBreaststroke50mTimes() {
    return breaststroke50mTimes;
  }

  /**
   * Gets freestyle 50 m times.
   *
   * @return the freestyle 50 m times
   */
  public List<Double> getFreestyle50mTimes() {
    return freestyle50mTimes;
  }

  @Override
  //YOUR CODE HERE
  public int compareTo(Swimmer otherSwimmer) {
    double myResult = sum(this.freestyle50mTimes) / this.freestyle50mTimes.size();
    double otherResult =
        sum(otherSwimmer.freestyle50mTimes) / otherSwimmer.freestyle50mTimes.size();
    return Double.compare(myResult, otherResult);
  }

  private static double sum(List<Double> doubleList) {
    double result = 0;
    for (Double i : doubleList) {
      result += i;
    }
    return result;
  }

  /**
   * Achieve olympic boolean.
   *
   * @return the boolean
   */
  public boolean achieveOlympic() {
    final double OLYMPIC_TIME = 26.17;
    for (Double d : this.getFreestyle50mTimes()) {
      if (d < OLYMPIC_TIME) {
        return true;
      }
    }
    return false;
  }

  /**
   * Have five butterfly time boolean.
   *
   * @return the boolean
   */
  public boolean haveFiveButterflyTime() {
    final int MIN_BUTTERFLY = 5;
    return this.butterfly50mTimes.size() >= MIN_BUTTERFLY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Swimmer swimmer = (Swimmer) o;

    if (!name.equals(swimmer.name)) {
      return false;
    }
    if (!butterfly50mTimes.equals(swimmer.butterfly50mTimes)) {
      return false;
    }
    if (!backstroke50mTimes.equals(swimmer.backstroke50mTimes)) {
      return false;
    }
    if (!breaststroke50mTimes.equals(swimmer.breaststroke50mTimes)) {
      return false;
    }
    return freestyle50mTimes.equals(swimmer.freestyle50mTimes);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + butterfly50mTimes.hashCode();
    result = 31 * result + backstroke50mTimes.hashCode();
    result = 31 * result + breaststroke50mTimes.hashCode();
    result = 31 * result + freestyle50mTimes.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Swimmer{" +
        "name='" + name + '\'' +
        ", butterfly50mTimes=" + butterfly50mTimes +
        ", backstroke50mTimes=" + backstroke50mTimes +
        ", breaststroke50mTimes=" + breaststroke50mTimes +
        ", freestyle50mTimes=" + freestyle50mTimes +
        '}';
  }
}

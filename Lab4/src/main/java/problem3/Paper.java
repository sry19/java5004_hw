package problem3;

/**
 * The type Paper.
 */
public class Paper extends State {

  /**
   * Instantiates a new Paper.
   */
  public Paper() {
  }

  /**
   * Beats boolean.
   *
   * @param state the state
   * @return the boolean
   */
  public Boolean beats(State state) {
    if (state instanceof Rock) {
      return true;
    }
    return false;
  }
}

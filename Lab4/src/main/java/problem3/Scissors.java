package problem3;

/**
 * The type Scissors.
 */
public class Scissors extends State {

  /**
   * Beats boolean.
   *
   * @param state the state
   * @return the boolean
   */
  public Boolean beats(State state) {
    if (state instanceof Paper) {
      return true;
    }
    return false;
  }

}

package problem3;

/**
 * The type Rock.
 */
public class Rock extends State {

  /**
   * Instantiates a new Rock.
   */
  public Rock() {
  }

  /**
   * Beats boolean.
   *
   * @param state the state
   * @return the boolean
   */
  public Boolean beats(State state) {
    if (state instanceof Scissors) {
      return true;
    }
    return false;
  }
}

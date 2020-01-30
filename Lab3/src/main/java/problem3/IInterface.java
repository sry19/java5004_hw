package problem3;

/**
 * The interface Interface.
 */
public interface IInterface {

  /**
   * Is empty boolean.
   *
   * @return the boolean
   */
  boolean isEmpty();

  /**
   * Add swimmer.
   *
   * @param swimmer the swimmer
   */
  void addSwimmer(Swimmer swimmer);

  /**
   * Remove swimmer.
   *
   * @param swimmer the swimmer
   * @return the swimmer
   * @throws SwimmerNotFoundException the swimmer not found exception
   */
  Swimmer remove(Swimmer swimmer) throws SwimmerNotFoundException;

  /**
   * Check boolean.
   *
   * @param swimmer the swimmer
   * @return the boolean
   */
  boolean check(Swimmer swimmer);

  /**
   * Num of swimmer int.
   *
   * @return the int
   */
  int numOfSwimmer();

  /**
   * Find swimmer.
   *
   * @param type the type
   * @return the swimmer
   * @throws SwimmerNotFoundException the swimmer not found exception
   */
  Swimmer find(DisciplineType type) throws SwimmerNotFoundException;

}

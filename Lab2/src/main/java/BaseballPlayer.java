public class BaseballPlayer extends Athlete {

  private String team;
  private Double aveBatting;
  private Integer seasonHomeRun;

  /**
   * constructor that creates a baseball player
   *
   * @param athletesName  the name of the athlete
   * @param height        the height of the athlete
   * @param weight        the weight of the athlete
   * @param league        the league of the athlete
   * @param team          the team of the athlete
   * @param aveBatting    the average batting
   * @param seasonHomeRun the season home runs
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double aveBatting, Integer seasonHomeRun) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.aveBatting = aveBatting;
    this.seasonHomeRun = seasonHomeRun;
  }

  /**
   * return the team
   *
   * @return the team
   */
  public String getTeam() {
    return this.team;
  }

  /**
   * return the average batting
   *
   * @return the average batting
   */
  public Double getAveBatting() {
    return this.aveBatting;
  }

  /**
   * return the season home run
   *
   * @return the season home run
   */
  public Integer getSeasonHomeRun() {
    return this.seasonHomeRun;
  }
}

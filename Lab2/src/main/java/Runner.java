
public class Runner extends Athlete{
    private Double best5kTime;
    private Double halfMarathonTime;
    private String favRunningEvent;

  /**
   * constructor that creates a runner
   * @param athletesName the name of the athlete
   * @param height the height of the athlete
   * @param weight the weight of the athlete
   * @param league the league of the athlete
   * @param best5kTime the best 5k time
   * @param halfMarathonTime the half marathon time
   * @param favRunningEvent the favourite running event
   */
  public Runner(Name athletesName, Double height, Double weight, String league,
      Double best5kTime, Double halfMarathonTime, String favRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5kTime = best5kTime;
    this.halfMarathonTime = halfMarathonTime;
    this.favRunningEvent = favRunningEvent;
  }

  /**
   * return the best 5k time
   * @return
   */
  public Double getBest5kTime() {
    return this.best5kTime;
  }

  public Double getHalfMarathonTime() {
    return this.halfMarathonTime;
  }

  public String getFavRunningEvent() {
    return this.favRunningEvent;
  }
}

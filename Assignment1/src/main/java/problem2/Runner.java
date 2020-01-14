package problem2;

/**
 * Runner is a simple object that has a name, a team, a start time and an end time.
 */
public class Runner {
    private String name;
    private String team;
    private Time startTime;
    private Time endTime;
    private static int MINVAL = 0;
    private static int MAXMIN = 60;
    private static int MAXSEC = 60;
    private static int MAXHOUR = 24;

    /**
     * constructor that creates a runner
     * @param name runner's name
     * @param team runner's team
     * @param startTime the start time of marathon
     * @param endTime the end time of marathon
     */
    public Runner (String name, String team, Time startTime, Time endTime){
        this.name = name;
        this.team = team;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * return the total time that the runner took to complete the marathon
     * @return the total time that the runner took to complete the marathon
     */
    public Time getDuration() {
        // return a new time instance
        return this.startTime.getDuration(this.endTime);
    }

    /**
     * return the name of the runner
     * @return the name of the runner
     */
    public String getName() {
        return this.name;
    }

    /**
     * return the team of the runner
     * @return the team of the runner
     */
    public String getTeam() {
        return this.team;
    }

    /**
     * return the start time of the runner
     * @return the start time of the runner
     */
    public Time getStartTime() {
        return this.startTime;
    }

    /**
     * return the end time of the runner
     * @return the end time of the runner
     */
    public Time getEndTime() {
        return this.endTime;
    }
}

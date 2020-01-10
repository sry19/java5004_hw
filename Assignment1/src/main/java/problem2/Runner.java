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
        int diffhour =this.endTime.getHours() - this.startTime.getHours();
        int diffminutes = this.endTime.getMinutes() - this.startTime.getMinutes();
        int diffseconds = this.endTime.getSeconds() - this.startTime.getSeconds();

        //if the difference of seconds is negative
        if (diffseconds< MINVAL) {
            diffseconds += MAXSEC;
            diffminutes -= 1;
        }
        //if the difference of minutes is negative
        if (diffminutes < MINVAL) {
            diffminutes += MAXMIN;
            diffhour -= 1;
        }
        //if the difference of hours is negative
        if (diffhour < MINVAL) {
            diffhour += MAXHOUR;
        }
        // return a new time instance
        return new Time(diffhour,diffminutes,diffseconds);
    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public Time getStartTime() {
        return this.startTime;
    }

    public Time getEndTime() {
        return this.endTime;
    }
}

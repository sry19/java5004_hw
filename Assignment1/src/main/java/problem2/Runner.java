package problem2;

/**
 * Runner is a simple object that has a name, a team, a start time and an end time.
 */
public class Runner {
    private String name;
    private String team;
    private Time startTime;
    private Time endTime;

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
        Integer diffhour =this.endTime.getHours() - this.startTime.getHours();
        Integer diffminutes = this.endTime.getMinutes() - this.startTime.getMinutes();
        Integer diffseconds = this.endTime.getSeconds() - this.startTime.getSeconds();

        if (diffseconds< 0) {
            diffseconds += 60;
            diffminutes -= 1;
        }
        if (diffminutes < 0) {
            diffminutes += 60;
            diffhour -= 1;
        }
        if (diffhour < 0) {
            diffhour += 23;
        }
        return new Time(diffhour,diffminutes,diffseconds);
    }
}

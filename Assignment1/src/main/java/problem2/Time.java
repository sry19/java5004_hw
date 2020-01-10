package problem2;

/**
 * Time is a simple object that has an hour, a minute and a second.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private static final int MINVAL = 0;
    private static final int MAXHOUR = 23;
    private static final int MAXMIN = 59;
    private static final int MAXSEC = 59;

    /**
     * constructor that creates a time instance
     * @param hours current hours
     * @param minutes current minutes
     * @param seconds current seconds
     */
    public Time (int hours, int minutes, int seconds){
        this.hours = this.isValidHour(hours);
        this.minutes = this.isValidMinute(minutes);
        this.seconds = this.isValidSecond(seconds);
    }

    /**
     * check if the hour is valid
     * @param hours
     * @return hours
     */
    private int isValidHour (int hours) {
        if (MINVAL <= hours && hours <= MAXHOUR) {
            return hours;
        } else {
            return MINVAL;
        }
    }

    /**
     * check if the minute is valid
     * @param minutes
     * @return minutes
     */
    private int isValidMinute (int minutes){
        if (MINVAL <= minutes && minutes <= MAXMIN) {
            return minutes;
        } else {
            return MINVAL;
        }
    }

    /**
     * check if the second is valid
     * @param seconds
     * @return seconds
     */
    private int isValidSecond (int seconds) {
        if (MINVAL <= seconds && seconds <= MAXSEC) {
            return seconds;
        } else {
            return MINVAL;
        }
    }

    /**
     * return hours
     * @return hours
     */
    public Integer getHours() {
        return this.hours;
    }

    /**
     * return minutes
     * @return minutes
     */
    public Integer getMinutes() {
        return this.minutes;
    }

    /**
     * return seconds
     * @return seconds
     */
    public Integer getSeconds() {
        return this.seconds;
    }
}

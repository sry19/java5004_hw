package problem2;

/**
 * Time is a simple object that has an hour, a minute and a second.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private static final int MIN_VAL = 0;

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
        if (0 <= hours && hours <= 23) {
            return hours;
        } else {
            return MIN_VAL;
        }
    }

    /**
     * check if the minute is valid
     * @param minutes
     * @return minutes
     */
    private int isValidMinute (int minutes){
        if (0 <= minutes && minutes <= 59) {
            return minutes;
        } else {
            return MIN_VAL;
        }
    }

    /**
     * check if the second is valid
     * @param seconds
     * @return seconds
     */
    private int isValidSecond (int seconds) {
        if (0 <= seconds && seconds <= 59) {
            return seconds;
        } else {
            return MIN_VAL;
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

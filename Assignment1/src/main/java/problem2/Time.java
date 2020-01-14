package problem2;

/**
 * Time is a simple object that has an hour, a minute and a second.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private static final int HOURTOSEC = 3600;
    private static final int MINUTETOSEC = 60;
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
        this.seconds = this.isValidSecond(seconds);
        this.minutes = this.isValidMinute(minutes);
        this.hours = this.isValidHour(hours);
    }

    /**
     * check if the hour is valid
     * @param hours
     * @return hours
     */
    private int isValidHour (int hours) {
        if (MINVAL <= hours && hours <= MAXHOUR) {
            return hours;
        } else if (hours < MINVAL){
            return MINVAL;
        } else {
            return MAXHOUR;
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
        } else if (minutes < MINVAL){
            return MINVAL;
        } else {
            return MAXMIN;
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
        } else if (seconds < MINVAL){
            return MINVAL;
        } else {
            return MAXSEC;
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

    /**
     * return the total seconds of time
     * @return the total seconds of time
     */
    private int convertToSecond() {
        return seconds + minutes*MINUTETOSEC + hours*HOURTOSEC;
    }

    /**
     * return a Time using seconds
     * @param totalSecond
     * @return return a Time using seconds
     */
    private Time convertToTime(int totalSecond) {
        int h = totalSecond / HOURTOSEC;
        int m = (totalSecond % HOURTOSEC) / MINUTETOSEC;
        int s = (totalSecond % HOURTOSEC) % MINUTETOSEC;
        return new Time(h, m, s);
    }

    /**
     * return a duration of time
     * @param endTime the end time of marathon
     * @return the duration of time
     */
    public Time getDuration(Time endTime) {
        int diff =  endTime.convertToSecond() - this.convertToSecond();
        if (diff < 0) {
            diff = 0;
        }
        return this.convertToTime(diff);
    }
}
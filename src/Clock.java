/**
 * Defining a class representing a Clock.
 */
public class Clock {
    /**
     * Defining parameters.
     */
    protected int hour;
    protected int minute;
    /**
     * Constructs a new Clock, sets its parameters by setHour and setMinute function .
     * @param hour the wanted hour to be applied.
     * @param minute the wanted minute to be applied.
     */
    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    /**
     * @return the current hour.
     */
    public int getHour() {
        return hour;
    }
    /**
     * @param hour set's the wanted hour.
     * checks if the input is between agreed hour boundaries, if not - returns 0.
     */
    public void setHour(int hour) {
        if (hour>23 || hour<0){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }

    }
    /**
     * @return the current minute.
     */
    public int getMinute() {

        return minute;
    }
    /**
     * @param minute set's the wanted minute.
     * checks if the input is between agreed minute boundaries, if not - returns 0.
     */
    public void setMinute(int minute)  {
        if (minute>59 || minute<0){
            this.minute = 0;
        }
        else{
            this.minute = minute;
        }

    }

    /**
     * helps distinguish between a regular Clock and an Accurate one.
     * @return false-  not an Accurate Clock.
     */
    public boolean isAccurate(){
        return false;
    }

    @Override
    /**
     * defining a method to compare between two Clocks.
     * 1. checks if the Clock is not null.
     * 2. checks if the dynamic type is a Clock.
     * 3. downcasts to Clock.
     * 4. checks if clock in not an Accurate one.
     * 5. checks if the hour and the minute values are equal.
     * @return true if Clocks are equal according to the requirements.
     */
    public boolean equals(Object other) {
        if (other==(null)){
            return false;
        }
        if ( !(other instanceof Clock)) {
            return false;
        }
        Clock otherClock = (Clock) other;
        if (otherClock.isAccurate()){
            return false;
        }
        return this.hour == otherClock.hour && this.minute == otherClock.minute;
    }
    /**
     * creates a distinct hashcode for each Clock.
     * counting the seconds from 00:00.
     * @return the hashcode.
     */
    @Override
    public int hashCode() {
        return 3600 * hour +60* minute;
    }
    /**
     * creates a distinct presentation for each clock, by this format HH:MM.
     * if the hour or the minute value is a one digit, adds a 0 .
     * @return the presentation.
     */
    @Override
    public String toString(){
        String hourStr= String.valueOf(this.hour);
        String minuteStr= String.valueOf(this.minute);
        if (this.hour<10)
            hourStr="0"+hourStr;
        if (this.minute<10)
            minuteStr="0"+minuteStr;
        return hourStr+":"+minuteStr;
    }


}
/**
 * Defining a class representing a AccurateClock.
 * extends Clock class by adding a second parameter.
 */
public class AccurateClock extends Clock{
    /**
     * Defining parameters.
     */
    protected int second;
    /**
     * Constructs a new AccurateClock, sets its parameters by Clock's constructor and setSecond function.
     * @param hour the wanted hour to be applied.
     * @param minute the wanted minute to be applied.
     * @param second the wanted minute to be applied.
     */
    public AccurateClock(int hour, int minute, int second) {
        super(hour, minute);
        setSecond(second);
    }
    /**
     * @return the current hour.
     */
    public int getHour() {
        return hour;
    }
    /**
     * @return the current minute.
     */
    public int getMinute() {
        return minute;
    }
    /**
     * * overrides the method to ensure the distinguishing.
     * helps distinguish between a regular Clock and an Accurate one.
     * @return true - is an Accurate Clock.
     */
    @Override
    public boolean isAccurate() {
        return true;
    }
    /**
     * @param second set's the wanted second.
     * checks if the input is between agreed second boundaries, if not - returns 0.
     */
    public void setSecond(int second) {
        if (second>59 || second<0){
            this.second = 0;
        }
        else{
            this.second = second;
        }

    }
    @Override
    /**
     * defining a method to compare between two Accurate Clocks.
     * 1. checks if the dynamic type is an Accurate Clock.
     * 2. downcasts to an Accurate Clock.
     * 3. checks if the hour, minute and second values are equal.
     * @return true if AccurateClocks are equal according to the requirements.
     */
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)) {
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute && this.second == otherClock.second;
    }
    @Override
    /**
     * creates a distinct hashcode for each AccurateClock.
     * counting the seconds from 00:00.
     * @return the hashcode.
     */
    public int hashCode() {
        return 3600 * hour + 60 * minute + second;
    }
    /**
     * creates a distinct presentation for each AccurateClock, by this format HH:MM:SS.
     * if the hour, minute or second value is a one digit, adds a 0 .
     * @return the presentation.
     */
    public String toString(){
        String secondStr= String.valueOf(this.second);
        if (this.second<10)
            secondStr="0"+secondStr;
        return super.toString()+":"+secondStr;
    }


}
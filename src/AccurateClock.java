public class AccurateClock extends Clock{
    public int second;
    public AccurateClock(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int hour) {
        this.second = second;
    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)) {
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute && this.second == otherClock.second;
    }
    @Override
    public int hashCode() {
        return 3600 * hour + 60 * minute + second;
    }
    public String toString(){
        String secondStr= String.valueOf(this.second);
        if (this.second<10)
            secondStr="0"+secondStr;
        return super.toString()+":"+secondStr;
    }


}

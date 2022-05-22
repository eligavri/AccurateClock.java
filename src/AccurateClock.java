public class AccurateClock extends Clock{
    protected int second;
    public AccurateClock(int hour, int minute, int second) {
        super(hour, minute);
        setSecond(second);
    }
    public int getHour() {
        return hour;
    }



    public int getMinute() {
        return minute;
    }

    @Override
    public boolean isAccurate() {
        return true;
    }

    public void setSecond(int second) {
        if (second>59 || second<0){
            this.second = 0;
        }
        else{
            this.second = second;
        }

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
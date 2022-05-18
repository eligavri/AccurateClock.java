public class Clock {
    public int hour;
    public int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
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

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)||(other instanceof AccurateClock)) {
            return false;
        }
        Clock otherClock = (Clock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute;
    }
    @Override
    public int hashCode() {
        return 3600 * hour + 60 * minute;
    }
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
public class Clock {
    public int hour;
    public int minute;

    public Clock(int hour, int minute) {

         setHour(hour);
         setMinute(minute);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>23 || hour<0){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }

    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute)  {
        if (minute>59 || minute<0){
            this.minute = 0;
        }
        else{
            this.minute = minute;
        }

    }

    public boolean isAccurate(){
        return false;
    }

    @Override
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
    @Override
    public int hashCode() {
        return 3600 * hour +60* minute;
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
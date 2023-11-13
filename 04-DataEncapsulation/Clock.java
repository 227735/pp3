public class Clock {
    private int hour;
    private int minute;

    public void setHour(int hour){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }    
    }

    public int getHour(){
        return this.hour;
    }
        
    public int getMinute(){
        return this.minute;
    }

    public void addOneMinute(){
        if (minute>=59){
            if (hour<23){
                hour++;
            }else{
                hour=0;
                minute=0;
            }
        } else {
            minute++;
        }
    }
    
}

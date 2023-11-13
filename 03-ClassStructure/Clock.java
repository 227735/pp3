public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock(){
    this.hour = 0;
    this.minute = 0;
    }

    public Clock(int hour, int minute){
        if (hour >= 0 && hour <= 23 ){
            this.hour = hour;
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
        }
        if (hour == alarmHour && minute == alarmMinute){
            runAlarm();
        }
    }

    void setClock(){
        hour = 0;
        minute = 0;
    }

    public String displayTime(){
        return String.format("Teraz jest godzina %02d:%02d", hour, minute);
    }
        
    void addOneMinute(){
        if (minute >= 59){
            if (hour < 23) {
                hour ++;
            }else {
                hour = 0;
                minute = 0;
            }
        } else {
            minute++;
        }
    }

    void runAlarm(){
        System.out.println("bip-bip-bip-beep!!");  
      }

    
    void setClock(int h,int m){
        hour = h;
        minute = m;
        if (hour == alarmHour && minute == alarmMinute){
            runAlarm();}
    }
    void setAlarm(int h, int m){
        alarmHour = h;
        alarmMinute = m;
    }

}

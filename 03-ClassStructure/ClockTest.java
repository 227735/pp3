public class ClockTest {
    public static void main(String[] args) {
        Clock time1 = new Clock(12, 39);
        Clock time2 = new Clock();

        System.out.println(time1.displayTime());

        time1.setAlarm(12,40);

        time1.addOneMinute();

        System.out.println(time1.displayTime());
        
    }
    
}

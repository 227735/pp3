public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Clock clock2 = new Clock();
    
        clock.setHour(12);
        clock.setMinute(30);
        clock2.setHour(23);
        clock2.setMinute(59);
        
        clock.addOneMinute();
        clock2.addOneMinute();
    
        System.out.println(clock.getHour()+" "+clock.getMinute());
        System.out.println(clock2.getHour()+" "+clock2.getMinute());
    }
    
}

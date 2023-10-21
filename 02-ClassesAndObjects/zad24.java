public class zad24 {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;
        int MinutesFromMidnight = hours * 60 + minutes;
        int SecondsFromMidnight = hours * 3600 + minutes * 60;


    System.out.println("Time: "+ hours +":" + minutes);
    System.out.println("Minutes from midnight: "+ MinutesFromMidnight);
    System.out.println("Seconds from midnight: "+ SecondsFromMidnight);
    }
    
}

// public class zad24 {
//     public static void main(String[] args) {
//         int hours = 14;
//         int minutes = 27;

//         int minutesFromMidnight = (hours * 60) + minutes;
//         int secondsFromMidnight = (hours * 3600) + (minutes * 60);

//         System.out.printf("hours = %d%n", hours);
//         System.out.printf("minutes = %d%n", minutes);
//         System.out.printf("time: %02d:%02d%n", hours, minutes); // Format the time as "hh:mm"
//         System.out.printf("minutes from midnight: %d%n", minutesFromMidnight);
//         System.out.printf("seconds from midnight: %d%n", secondsFromMidnight);
//     }
// }
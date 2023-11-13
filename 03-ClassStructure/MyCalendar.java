public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static int[] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};

    static String myDate(){
        return (year + "-" + month + "-" + day).toString();
    }

    static int days(){
        int days = day;
        for (int i = month-1; i>0; i--){
            days = days + daysInMonth[i];
        }
        return days;
    }

    static String monthName() {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }

    public static void main(String[]args){
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }
}

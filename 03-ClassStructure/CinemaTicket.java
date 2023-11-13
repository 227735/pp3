public class CinemaTicket {
    private String filmTitle;
    private int row;
    private int seat;
    private double price;

    private static String cinemaName = "Morning Star Cinema";

    public CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = (row <=2 ? 10 : 25);
    }

    public String toString(){
        return (cinemaName + " " + "row: " + row + " seat: "+ seat + " price: " + price);
    }

    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2, 5);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 10);

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
    }
  
}

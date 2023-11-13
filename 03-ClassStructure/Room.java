public class Room {
    int number;
    int beds;
    boolean occupied;
    String gName;
    Room[] rooms = new Room[6];
    
    public Room(int number){
        this.number = number;
        this.beds = 2;
    }

    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
        this.occupied=false;
        this.gName= null;
    }

    public void checkIn(String gName){
        if (!occupied){
            this.gName=gName;
            this.occupied= true;
        }
    }

    public void checkOut(){
        if (occupied){
            this.gName = null;
            this.occupied = false;
        }
    }

    public boolean occupied(){
        return occupied;
    }

    public void displayStatus(){
        System.out.printf("Number: %0d, beds: %d, occupied: %s, guest's name: %s%n", number, beds, occupied ? "Yes" : "No", gName);
    }
    
}

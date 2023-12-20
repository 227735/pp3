public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        return new int[]{getSeats(), maxSpeed};
    }

    public static void main(String[] args) {
        Car myCar = new Car(4, 200);
        System.out.println(myCar.spec());
    }

}
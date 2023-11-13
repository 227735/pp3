public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");

        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());

        myCar.setColor("Blue");
        myCar.setYear(2022);

        System.out.println("\nModified Car Details:");
        System.out.println("Year Updated: " + myCar.getYear());
        System.out.println("Color Updated: " + myCar.getColor());
    }
}
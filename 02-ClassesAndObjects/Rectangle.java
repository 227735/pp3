public class Rectangle {
    double length;
    double width;

    public double Perimeter() { //obwód
        return 2 * (length + width);
    }

    public double SurfaceArea() { //pole
        return length * width;
    }

    public void displayRectangleInfo() {
        System.out.println("Dimensions: " + length + " x " + width);
        System.out.println("Perimeter: " + Perimeter());
        System.out.println("Surface Area: " + SurfaceArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 3;
        rectangle1.width = 4;
        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 2;
        rectangle2.width = 7;

        rectangle1.displayRectangleInfo();
        System.out.println(" ");
        rectangle2.displayRectangleInfo();
    }
}
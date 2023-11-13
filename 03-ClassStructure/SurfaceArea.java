public class SurfaceArea {
    public static float rectangle (float a, float b) {
        return a*b;
    }
    public static double circle (double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double triange (int a, int b) {
        return a*b/2;
    }

    public static double cuboid(double length, double width, double height) {
        return 2 * (length * width + width * height + height * length);
    }

    public static double sphere(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double cone(double radius, double slantHeight) {
        double baseArea = Math.PI * radius * radius;
        double sideArea = Math.PI * radius * slantHeight;
        return baseArea + sideArea;
    }
}

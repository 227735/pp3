public class SurfaceAreaTest {
    public static void main(String[]args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(SurfaceArea.rectangle(5,2));
        System.out.print("Circle area (3) is ");
        System.out.println(SurfaceArea.circle(3));
        System.out.print("Rectangle area (3,4) is ");
        System.out.println(SurfaceArea.rectangle(3,4));

        double cuboidArea = SurfaceArea.cuboid(3, 4, 5);
        double sphereArea = SurfaceArea.sphere(2);
        double coneArea = SurfaceArea.cone(3, 4);
        
        System.out.println("Cuboid: " + cuboidArea);
        System.out.println("Sphere: " + sphereArea);
        System.out.println("Cone: " + coneArea);
    }
}

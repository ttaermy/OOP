package Prob1a;

public class ShapeTest {

    public static void main(String[] args) {

        Shape3D cylinder = new Cylinder(3,5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println("Prob1a.Cylinder volume: " + cylinder.volume());
        System.out.println("Prob1a.Cylinder surface: " + cylinder.surfaceArea());

        System.out.println("Prob1a.Sphere volume: " + sphere.volume());
        System.out.println("Prob1a.Sphere surface: " + sphere.surfaceArea());

        System.out.println("Prob1a.Cube volume: " + cube.volume());
        System.out.println("Prob1a.Cube surface: " + cube.surfaceArea());
    }
}
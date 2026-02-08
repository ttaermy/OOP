package prob2;

public class CourseTest {
    public static void main(String[] args) {

        Course c1 = new Course("Algorithms");
        Course c2 = new Course("Databases", Course.Level.MASTER);

        System.out.println(c1);
        System.out.println(c2);

        // Testing overloaded method
        c1.setLevel("PHD");
        System.out.println("After change:");
        System.out.println(c1);

        // Demonstrate static behavior
        Course c3 = new Course("AI");
        System.out.println(c3);

        System.out.println("Test finished.");
    }
}

package prob3;

public class TemperatureTest {
    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25);
        Temperature t3 = new Temperature(77, 'F');
        Temperature t4 = new Temperature(t3); // copy

        System.out.println("t1 C: " + t1.getCelsius());
        System.out.println("t2 F: " + t2.getFahrenheit());
        System.out.println("t3 C: " + t3.getCelsius());
        System.out.println("t4 scale: " + t4.getScale());

        // Testing setters
        t1.setBoth(100, 'F');
        System.out.println("t1 new C: " + t1.getCelsius());
    }
}

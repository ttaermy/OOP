package prob5;

import java.util.Scanner;
import java.util.Vector;

public class DragonTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Person> v = new Vector<>();

        System.out.println("Enter people order (B/G).");

        String input = sc.nextLine().replaceAll("\\s+", "").toUpperCase();

        for (char c : input.toCharArray()) {

            if (c == 'B' || c == 'G') {
                v.add(new Person(c));
            } else {
                System.out.println("Invalid character ignored: " + c);
            }
        }

        boolean result = DragonLaunch.willDragonEatOrNot(v);

        if (result)
            System.out.println("Dragon eats");
        else
            System.out.println("Dragon starve");

        sc.close();
    }
}

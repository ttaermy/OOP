package pr4;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee("Alice", 9000, new Date(), "INS1");
        Employee e2 = new Employee("Bob", 6000, new Date(), "INS2");

        Manager m1 = new Manager("Charlie", 8000, new Date(), "INS3", 1000);
        Manager m2 = new Manager("Dave", 7000, new Date(), "INS4", 2000);

        System.out.println(e1);
        System.out.println(m1);

        // Comparable test
        System.out.println(e1.compareTo(e2));
        System.out.println(m1.compareTo(m2));

        // Sorting
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);
        list.add(m2);

        Collections.sort(list); // by salary

        System.out.println("\nSorted by salary:");
        for (Employee e : list) {
            System.out.println(e.getName());
        }

        // Comparator by name
        Collections.sort(list, new NameComparator());

        System.out.println("\nSorted by name:");
        for (Employee e : list) {
            System.out.println(e.getName());
        }

        // Clone
        Employee copy = (Employee) e1.clone();
        System.out.println("\nCloned: " + copy);
    }
}

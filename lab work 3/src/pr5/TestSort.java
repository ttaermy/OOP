package pr5;

public class TestSort {
    public static void main(String[] args) {

        // Chocolate sorting
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 45)
        };

        System.out.println("Before sorting chocolates:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Sort.bubbleSort(chocolates);

        System.out.println("\nAfter Bubble Sort (by weight):");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        // Time sorting
        Time[] times = {
                new Time(10, 30, 15),
                new Time(9, 45, 10),
                new Time(10, 15, 20)
        };

        System.out.println("\nBefore sorting times:");
        for (Time t : times) {
            System.out.println(t);
        }

        Sort.mergeSort(times);

        System.out.println("\nAfter Merge Sort:");
        for (Time t : times) {
            System.out.println(t);
        }
    }
}
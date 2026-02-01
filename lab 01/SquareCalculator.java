import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter side of square: ");
        double a = sc.nextDouble();
 
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
 
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }

    public static class StarTriangle {
        private int width;

        public StarTriangle(int width) {
            this.width = width;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();

            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= i; j++) {
                    result.append("[*]");
                }
                result.append("\n");
            }

            return result.toString();
        }
    }
}
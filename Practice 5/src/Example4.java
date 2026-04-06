import java.util.*;

public class Example4 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String line = in.nextLine();

      StringTokenizer expressions = new StringTokenizer(line, " ");

      while (expressions.hasMoreTokens()) {

         String expr = expressions.nextToken();

         try {
            StringTokenizer st = new StringTokenizer(expr, "+-*/", true);

            String left = st.nextToken();
            String operator = st.nextToken();
            String right = st.nextToken();

            double a, b;

            try {
               a = Double.parseDouble(left);
            } catch (NumberFormatException e) {
               System.out.println(expr + " First operand is not a number");
               continue;
            }

            try {
               b = Double.parseDouble(right);
            } catch (NumberFormatException e) {
               System.out.println(expr + " Second operand is not a number");
               continue;
            }

            double result = 0;

            switch (operator) {
               case "+":
                  result = a + b;
                  break;
               case "-":
                  result = a - b;
                  break;
               case "*":
                  result = a * b;
                  break;
               case "/":
                  result = a / b;
                  break;
            }

            System.out.println(expr + " = " + result);
         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
         } catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number");
         }
      }
   }
}

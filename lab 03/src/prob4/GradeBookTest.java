package prob4;

import pr2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course course =
                new Course("Object-oriented Programming and Design", "CS101");

        GradeBook gb = new GradeBook(course);

        System.out.println("Welcome to the grade book for "
                + course + "!");
        System.out.println("Please, input grades for students:\n");

        for (char c = 'A'; c <= 'J'; c++) {

            System.out.print("Student " + c + ": ");
            int grade = sc.nextInt();

            gb.addRecord(new Student("Student " + c, c), grade);
        }

        gb.printSummary();
        gb.printDistribution();

        sc.close();
    }
}

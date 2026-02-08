package prob4;

import pr2.Student;
import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public GradeBook(Course course) {
        this.course = course;
    }

    public void addRecord(Student s, int grade) {
        students.add(s);
        grades.add(grade);
    }

    public double getAverage() {
        int sum = 0;
        for (int g : grades)
            sum += g;

        return (double) sum / grades.size();
    }

    public int getMinIndex() {
        int idx = 0;
        for (int i = 1; i < grades.size(); i++)
            if (grades.get(i) < grades.get(idx))
                idx = i;
        return idx;
    }

    public int getMaxIndex() {
        int idx = 0;
        for (int i = 1; i < grades.size(); i++)
            if (grades.get(i) > grades.get(idx))
                idx = i;
        return idx;
    }

    public void printDistribution() {

        int[] count = new int[9];

        for (int score : grades) {

            if (score >= 95) count[0]++;
            else if (score >= 90) count[1]++;
            else if (score >= 85) count[2]++;
            else if (score >= 80) count[3]++;
            else if (score >= 75) count[4]++;
            else if (score >= 70) count[5]++;
            else if (score >= 65) count[6]++;
            else if (score >= 60) count[7]++;
            else count[8]++;
        }

        System.out.println("\nScore     Letter   Distribution");

        printRow("95-100", "A", count[0]);
        printRow("90-94 ", "A-", count[1]);
        printRow("85-89 ", "B+", count[2]);
        printRow("80-84 ", "B ", count[3]);
        printRow("75-79 ", "B-", count[4]);
        printRow("70-74 ", "C+", count[5]);
        printRow("65-69 ", "C ", count[6]);
        printRow("60-64 ", "C-", count[7]);
        printRow("<60   ", "F ", count[8]);
    }

    private void printRow(String range, String letter, int stars) {

        System.out.printf("%-8s  %-6s  ", range, letter);

        for (int i = 0; i < stars; i++)
            System.out.print("*");

        System.out.println();
    }

    public void printSummary() {

        int min = getMinIndex();
        int max = getMaxIndex();

        System.out.printf(
                "\nClass average is %.2f. Lowest grade is %d (%s).",
                getAverage(),
                grades.get(min),
                students.get(min)
        );

        System.out.printf(
                "\nHighest grade is %d (%s)\n",
                grades.get(max),
                students.get(max)
        );
    }
}

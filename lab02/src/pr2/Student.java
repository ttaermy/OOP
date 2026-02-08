package pr2;

public class Student {
    private String name;
    private int id;
    private int YearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.YearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return YearOfStudy;
    }

    public void incrementYearOfStudy() {
        YearOfStudy++;
    }

    public static void main(String[] args) {
        Student s = new Student("Tomiris", 101);
        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getYearOfStudy());

        s.incrementYearOfStudy();
        System.out.println("After increment: " + s.getYearOfStudy());
    }
}
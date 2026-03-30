package pr1;

public class Test {
    public static void main(String[] args) {

        KBTUStudents student1 = new KBTUStudents("Tomiris");

        student1.doInternship();
        student1.joinClub();

        System.out.println();

        Student student2 = new ITStudent("Ruslan", 2);
        Student student3 = new BusinessStudent("Juliya", 1);

        student2.getInfo();
        student2.study();

        System.out.println();

        student3.getInfo();
        student3.study();
    }
}

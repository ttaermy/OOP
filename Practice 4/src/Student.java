public class Student extends Person implements CanHavePizza {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void receivePizza(String pizzaType) {
        System.out.println("Student " + name + " from " + university +
                " receives a slice of " + pizzaType + " pizza.");
    }
}

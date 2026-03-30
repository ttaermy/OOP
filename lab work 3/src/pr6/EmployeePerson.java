package pr6;

import Prob5.Person;
import Prob5.Animal;

public class EmployeePerson extends Person implements Comparable<EmployeePerson>, Cloneable, Payable {

    private double salary;

    public EmployeePerson(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(EmployeePerson other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}

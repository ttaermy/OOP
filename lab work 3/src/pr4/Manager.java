package pr4;

import java.util.Date;
import java.util.Vector;

class Manager extends Employee {

    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Team size: " + team.size();
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;
        return bonus == other.bonus;
    }

    // Override compareTo
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager m = (Manager) other;

            if (this.getSalary() == m.getSalary()) {
                return Double.compare(this.bonus, m.bonus);
            }
        }
        return super.compareTo(other);
    }

    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) team.clone(); // shallow copy of vector
        return cloned;
    }
}

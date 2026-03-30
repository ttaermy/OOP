package pr4;

import java.util.Date;

class Employee extends Person implements Comparable<Employee>, Cloneable {

    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {}

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String toString() {
        return super.toString() +
                ", Salary: " + salary +
                ", HireDate: " + hireDate +
                ", Insurance: " + insuranceNumber;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        Employee other = (Employee) obj;
        return salary == other.salary &&
                insuranceNumber.equals(other.insuranceNumber);
    }

    // Comparable
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    // Clone (shallow)
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

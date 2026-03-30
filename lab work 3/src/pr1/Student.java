package pr1;

abstract class Student {
    String name;
    int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    abstract void study();

    void getInfo() {
        System.out.println(name + " studies in year " + year);
    }
}

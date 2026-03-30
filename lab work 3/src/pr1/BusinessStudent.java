package pr1;

class BusinessStudent extends Student {

    public BusinessStudent(String name, int year) {
        super(name, year);
    }

    void study() {
        System.out.println(name + " studies business");
    }
}

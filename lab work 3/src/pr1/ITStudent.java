package pr1;

class ITStudent extends Student {
    public ITStudent(String name, int year) {
        super(name, year);
    }

    void study() {
        System.out.println(name + " studies programming");
    }
}

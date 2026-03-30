package pr1;

class KBTUStudents implements Internship, ClubMember {

    String name;

    public KBTUStudents(String name) {
        this.name = name;
    }

    public void doInternship() {
        System.out.println(name + " is doing internship");
    }

    public void joinClub() {
        System.out.println(name + " joined a KBTU club");
    }
}

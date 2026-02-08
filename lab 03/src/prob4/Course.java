package prob4;

public class Course {
    private String title;
    private String code;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() { return title; }

    public String toString() {
        return code + ": " + title;
    }
}

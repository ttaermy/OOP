package prob2;

public class Course {

    public enum Level {BACHELOR, MASTER, PHD}

    private static int courseCount = 0;

    private final int courseId;

    private String name;
    private Level level;

    {
        courseId = ++courseCount;
    }

    public Course(String name) {
        this(name, Level.BACHELOR);
    }

    public Course(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setLevel(String levelName) {
        this.level = Level.valueOf(levelName.toUpperCase());
    }

    public String toString() {
        return courseId + " " + name + " " + level;
    }
}

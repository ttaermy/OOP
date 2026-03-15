package Prob1c;

import java.util.Objects;

public class Sorcerer {

    private String name;
    private String grade;
    private String technique;

    public Sorcerer(String name, String grade, String technique) {
        this.name = name;
        this.grade = grade;
        this.technique = technique;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getTechnique() {
        return technique;
    }

    @Override
    public String toString() {
        return name + " | Grade: " + grade + " | Technique: " + technique;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Sorcerer)) return false;

        Sorcerer s = (Sorcerer) o;

        return name.equals(s.name) &&
                grade.equals(s.grade) &&
                technique.equals(s.technique);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, technique);
    }
}
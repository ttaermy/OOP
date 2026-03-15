package Prob1c;

import java.util.Objects;

public class SpecialGradeSorcerer extends Sorcerer {

    private String domainExpansion;

    public SpecialGradeSorcerer(String name, String grade, String technique, String domainExpansion) {
        super(name, grade, technique);
        this.domainExpansion = domainExpansion;
    }

    public String getDomainExpansion() {
        return domainExpansion;
    }

    @Override
    public String toString() {
        return super.toString() + " | Domain: " + domainExpansion;
    }

    @Override
    public boolean equals(Object o) {

        if (!super.equals(o)) return false;

        if (!(o instanceof SpecialGradeSorcerer)) return false;

        SpecialGradeSorcerer s = (SpecialGradeSorcerer) o;

        return domainExpansion.equals(s.domainExpansion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), domainExpansion);
    }
}
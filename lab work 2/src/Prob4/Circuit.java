package Prob4;

public abstract class Circuit {

    protected double potentialDifference;

    public abstract double getResistance();

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }

    public double getCurrent() {
        return potentialDifference / getResistance();
    }

    public double getPower() {
        return potentialDifference * getCurrent();
    }
}

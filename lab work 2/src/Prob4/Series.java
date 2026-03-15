package Prob4;

public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public void applyPotentialDiff(double V) {

        super.applyPotentialDiff(V);

        double totalR = getResistance();

        double current = V / totalR;

        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());
    }
}
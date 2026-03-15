package Prob4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {

        double r1 = c1.getResistance();
        double r2 = c2.getResistance();

        return 1 / (1/r1 + 1/r2);
    }

    @Override
    public void applyPotentialDiff(double V) {

        super.applyPotentialDiff(V);

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}

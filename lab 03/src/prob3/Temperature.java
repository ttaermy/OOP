package prob3;

public class Temperature {

    private double value;
    private char scale;

    public Temperature() {
        this(0, 'C');
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    public Temperature(Temperature t) {
        this.value = t.value;
        this.scale = t.scale;
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        return 5 * (value - 32) / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        return 9 * getCelsius() / 5 + 32;
    }

    public void setValue(double v) { value = v; }
    public void setScale(char s) { scale = Character.toUpperCase(s); }
    public void setBoth(double v, char s) {
        value = v;
        scale = Character.toUpperCase(s);
    }

    public char getScale() {
        return scale;
    }
}

package pr5;

class Chocolate implements Comparable<Chocolate> {

    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " (" + weight + "g)";
    }

    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }
}

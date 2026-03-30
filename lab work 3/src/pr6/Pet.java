package pr6;

import Prob5.Animal;

public class Pet extends Animal implements Comparable<Pet>, Cloneable, Playable {

    public Pet(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof"; // or anything
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing happily");
    }

    @Override
    public int compareTo(Pet other) {
        return Integer.compare(this.getAge(), other.getAge());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

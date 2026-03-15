package Prob5;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {

        if (!hasPet()) {
            System.out.println(name + " has no pet.");
            return;
        }

        caretaker.assignPet(pet);
        pet = null;
    }

    public void retrievePetFrom(Person caretaker) {

        if (!caretaker.hasPet()) {
            System.out.println("Caretaker has no pet.");
            return;
        }

        this.pet = caretaker.pet;
        caretaker.removePet();
    }

    @Override
    public String toString() {

        String petInfo = (pet == null) ? "No pet" : pet.toString();

        return name + " (" + getOccupation() + ") - " + petInfo;
    }
}

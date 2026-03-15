package Prob5;

public class PetTest {

    public static void main(String[] args) {

        System.out.println("=== Creating People ===");

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 21, "Math");

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);


        System.out.println("\n=== Creating Animals ===");

        Animal cat = new Cat("Murka", 5);
        Animal dog = new Dog("Rex", 3);
        Animal bird = new Bird("Kesha", 2);


        System.out.println("\n=== Assigning Pets ===");

        john.assignPet(cat);
        bob.assignPet(bird);

        registry.printAll();


        System.out.println("\n=== John Goes On Vacation ===");

        john.leavePetWith(alice);

        registry.printAll();


        System.out.println("\n=== John Tries To Leave Pet Again (No Pet Case) ===");

        john.leavePetWith(bob);


        System.out.println("\n=== John Returns From Vacation ===");

        john.retrievePetFrom(alice);

        registry.printAll();


        System.out.println("\n=== Retrieving When Caretaker Has No Pet ===");

        john.retrievePetFrom(alice);


        System.out.println("\n=== PhD Student Trying To Take Dog ===");

        alice.assignPet(dog);


        System.out.println("\n=== Normal Dog Assignment To Employee ===");

        john.assignPet(dog);

        registry.printAll();


        System.out.println("\n=== Bob Leaves Pet With John ===");

        bob.leavePetWith(john);

        registry.printAll();


        System.out.println("\n=== Bob Retrieves Pet ===");

        bob.retrievePetFrom(john);

        registry.printAll();


        System.out.println("\n=== Final Registry State ===");

        registry.printAll();

    }
}

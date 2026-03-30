package pr6;

public class TestTask6 {
    public static void main(String[] args) throws Exception {

        EmployeePerson p1 = new EmployeePerson("Alice", 20, 5000);
        EmployeePerson p2 = new EmployeePerson("Bob", 22, 7000);

        System.out.println(p1);
        System.out.println("Compare persons: " + p1.compareTo(p2));

        EmployeePerson cloneP = (EmployeePerson) p1.clone();
        System.out.println("Cloned person: " + cloneP);

        System.out.println("Payment: " + p1.getPaymentAmount());

        System.out.println();

        Pet pet1 = new Pet("Buddy", 3);
        Pet pet2 = new Pet("Max", 5);

        pet1.play();

        System.out.println("Compare pets: " + pet1.compareTo(pet2));

        Pet clonePet = (Pet) pet1.clone();
        System.out.println("Cloned pet: " + clonePet);

        System.out.println();

        // 🧠 Test interaction (your logic!)
        p1.assignPet(pet1);
        System.out.println(p1);

        p1.leavePetWith(p2);
        System.out.println("After leaving pet:");
        System.out.println(p1);
        System.out.println(p2);
    }
}

package Prob5;

public class PhDStudent extends Student {

    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("PhD students cannot take care of dogs!");
            return;
        }

        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student researching " + researchTopic;
    }
}

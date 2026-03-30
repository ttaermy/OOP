package pr2;

public class TestMoveable {
    public static void main(String[] args) {

        Moveable harry = new HarryPotter();
        Moveable hermione = new HermioneGranger();
        Moveable ron = new RonWeasley();

        harry.move();
        hermione.move();
        ron.move();

        System.out.println();

        MagicalMoveable h = new HarryPotter();
        MagicalMoveable he = new HermioneGranger();

        h.castSpell();
        he.castSpell();
    }
}

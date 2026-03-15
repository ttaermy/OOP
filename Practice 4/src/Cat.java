public class Cat extends Animal implements CanHavePizza {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void receivePizza(String pizzaType) {
        System.out.println("Cat " + name + " eats " + pizzaType + " pizza happily.");
    }
}
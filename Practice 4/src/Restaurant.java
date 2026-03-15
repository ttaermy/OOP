public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void servePizza(CanHavePizza customer, String pizzaType) {
        System.out.println(name + " restaurant serves pizza...");
        customer.receivePizza(pizzaType);
        System.out.println();
    }
}

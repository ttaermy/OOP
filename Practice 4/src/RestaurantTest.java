public class RestaurantTest {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Pizza Palace");

        Student student1 = new Student("Alice", 20, "KBTU");
        Student student2 = new Student("Bob", 21, "NU");

        Cat cat1 = new Cat("Whiskers", 3);
        Cat cat2 = new Cat("Milo", 2);

        restaurant.servePizza(student1, "Pepperoni");
        restaurant.servePizza(student2, "Cheese");

        restaurant.servePizza(cat1, "Tuna");
        restaurant.servePizza(cat2, "Chicken");
    }
}
package pr3;

public class TestCollection {
    public static void main(String[] args) {

        MyCollection<String> collection = new MyArrayList<>();

        collection.add("Harry");
        collection.add("Hermione");
        collection.add("Ron");

        System.out.println("Size: " + collection.size());

        System.out.println("Contains Harry: " + collection.contains("Harry"));

        collection.remove("Ron");

        System.out.println("Size after remove: " + collection.size());

        collection.clear();

        System.out.println("Is empty: " + collection.isEmpty());
    }
}

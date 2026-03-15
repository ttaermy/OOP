package Prob1b;

public class LibTest {

    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert Martin", 2008, 464);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\nTesting getters:");

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getPublicationYear());
        System.out.println("Pages: " + book1.getNumberOfPages());

    }
}

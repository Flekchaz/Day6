import java.util.ArrayList;
import java.util.Collection;

public class Libary {

    // Create a Library class that can hold a collection of books (use an array or ArrayList).
    // Implement a method to display information about all books in the library.
    // Use polymorphism to allow different types of books to be stored in the library.

    ArrayList <Book> bookCollection = new ArrayList<>();


    public void addBook(Book book) {
        bookCollection.add(book);

    }

    public void displayInfo() {
        System.out.println("Here is the list of the book");
        System.out.println("\n");
        for (Book book : bookCollection){
            book.displayInfo();
            System.out.println("-------------------------------");
        }
    }

}

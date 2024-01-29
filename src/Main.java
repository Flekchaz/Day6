import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* Book book = new Book("Inferno","Dan Brown", "IB12365");
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: "+ book.getAuthor());
        System.out.println("ISBN: "+ book.getIsbn());
        book.setTitle("The alchemist");
        book.setAuthor("Paolo Coehlo");
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: "+ book.getAuthor());

        FictionBook fictionBook = new FictionBook("X files","Daniel Trij","JIH453F");
        System.out.println("Title: "+ fictionBook.getTitle());
        System.out.println("Author: "+ fictionBook.getAuthor());
        System.out.println("ISBN: "+ fictionBook.getIsbn());
        fictionBook.setTitle("Lord of the rings");
        fictionBook.setAuthor("Hmed lberd3a");
        System.out.println("Title: "+ fictionBook.getTitle());
        System.out.println("Author: "+ fictionBook.getAuthor());

        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari","3FW569");

        Libary libary = new Libary();
        libary.addBook(fictionBook);
        libary.addBook(nonFictionBook);
        libary.displayInfo();
        //libary.bookCollection.add(new NonFictionBook("The alchemist", "Paelo Coehlo","HJK125"));

*/

        RentalAgency rentalAgency = new RentalAgency(new ArrayList<>());

        rentalAgency.addVehicle(new Car(
                "AXN562","BMW",500,"BB5236"));

        rentalAgency.addVehicle(new Bike(
                "ABC5623","Honda",250,"CC2635"));
        rentalAgency.displayVehicles();
        rentalAgency.rentVehicle("BB5236");


        Vehicle rentedVehicle = new Car("AXN562","BMW",500,"BB5236");
        rentedVehicle.returnedVehicle();
        rentalAgency.displayVehicles();


    }

}
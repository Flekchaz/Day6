public class Book {

    // Create a Book class with private attributes (title, author, isbn, etc.).
    //Use encapsulation to provide getter and setter methods for accessing and updating the book information.

    private String title;
    private String author;
    private String isbn;
    private String type;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Title of this book: "+ getTitle());
        System.out.println("Author of this book: "+ getAuthor());
    }
}

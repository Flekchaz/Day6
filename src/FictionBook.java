public class FictionBook extends Book{
    public FictionBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public void displayInfo(){
        System.out.println("This a fiction category book");
        System.out.println("Title of this book: "+ getTitle());
        System.out.println("Author of this book: "+ getAuthor());
    }
}

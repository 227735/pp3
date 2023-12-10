import java.util.ArrayList;

public class Bookshelf {
    private ArrayList<Book> books;

    public Bookshelf(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void displayContents(){
        for (Book book: books){
            System.out.println(book.getTitle() + " by " + book.getWriter().getName());
        }
    }
}

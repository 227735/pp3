import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public void addBook(Book item) {
        collection.add(item);
    }

    public void displayLibrary() {
        System.out.println("Library Contents:");
        for (Book item : collection) {
            item.display();
        }
    }
}

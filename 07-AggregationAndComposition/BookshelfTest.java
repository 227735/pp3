public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf myBookshelf = new Bookshelf();

        Writer author1 = new Writer("Author 1");
        Writer author2 = new Writer("Author 2");

        Book book1 = new Book("Book 1", author1);
        Book book2 = new Book("Book 2", author2);

        myBookshelf.addBook(book1);
        myBookshelf.addBook(book2);
        myBookshelf.displayContents();
        myBookshelf.removeBook(book1);
        myBookshelf.displayContents();

        Chapter chapter1 = new Chapter("Wiosna", 21,17);
        Chapter chapter2 = new Chapter("Chapter 2", 15, 43);

        book1.addChapter(chapter1);
        book1.addChapter(chapter2);
        
    }

}
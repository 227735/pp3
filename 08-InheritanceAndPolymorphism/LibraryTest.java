public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        Publisher publisher = new Publisher("Example Publisher", "Cityville");

        Writer author = new Writer("F. Scott", "Fitzgerald", "Fiction");

        Book book = new Book("The Great Gatsby", author, publisher, 1925);
        Ebook ebook1 = new Ebook("To Kill a Mockingbird", author, "ToKillAMockingbird.pdf", publisher, 1960);
        Ebook ebook2 = new Ebook("The Kite Runner", author, "TheKiteRunner.epub", publisher, 2003);
        Audiobook audiobook1 = new Audiobook("1984", author, 12, 30, publisher, 1949);
        Audiobook audiobook2 = new Audiobook("The Hobbit", author, 9, 15, publisher, 1937);

        library.addBook(book);
        library.addBook(ebook1);
        library.addBook(ebook2);
        library.addBook(audiobook1);
        library.addBook(audiobook2);

        library.displayLibrary();
    }
}
public class AudiobookTest {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Audiobook audiobook1 = new Audiobook("To Kill a Mockingbird", "Harper Lee", 10, 30);
        Audiobook audiobook2 = new Audiobook("The Kite Runner", "Khaled Hosseini", 8, 45);

        System.out.println("Book:");
        book.display();

        System.out.println("Audiobook 1:");
        audiobook1.display();

        System.out.println("Audiobook 2:");
        audiobook2.display();
    }
}

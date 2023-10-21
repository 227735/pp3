public class Book {
    String title;
    String author;
    int pageCount;
    double price;

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Price: $" + price);
    }

    public boolean isExpensive() {
        return price > 50.0;
    }

    public static void main(String[] args) {
        Book a = new Book();
        a.title = "The ballad of snakes and birds";
        a.author = "Suzanne Collins";
        a.pageCount = 547;
        a.price = 59.99;

        Book b = new Book();
        b.title = "The hunger games";
        b.author = "Suzanne Collins";
        b.pageCount = 523;
        b.price = 49.99;

    a.displayBookInfo();
    System.out.println("Is Expensive? "+ a.isExpensive());
    System.out.println(" ");
    b.displayBookInfo();
    System.out.println("Is Expensive? "+ b.isExpensive());
    }

}


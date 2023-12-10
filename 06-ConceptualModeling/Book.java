public class Book {
    private String title;
    private String author;
    private String genre;
    private double price;
    
    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
    }
}


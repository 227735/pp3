public class Book {
    private String title;
    private int pages;
    
    public Book(String title){
        this.title = title;
    }

    public void setPages(int n){
        if (n >= 0){
            this.pages = n;
        }
    }

    public int getPages(){
        return this.pages;
    }
}
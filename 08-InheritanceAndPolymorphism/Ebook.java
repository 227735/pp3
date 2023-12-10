public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, Writer author, String fileName, Publisher publisher, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    public void setAuthor(String fileName){
        this.fileName = fileName;
    }

    public void display(){
        super.display();
        System.out.println("File Name: " + fileName);
        System.out.println();
    }


    
}

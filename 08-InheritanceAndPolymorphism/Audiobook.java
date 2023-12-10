public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public Audiobook(String title, Writer author, int minutes, int seconds, Publisher publisher, int yearOfPublication) {
        super(title, author, publisher, yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display() {
        super.display();
        System.out.println("Duration: " + minutes + " minutes " + seconds + " seconds");
        System.out.println();
    }

}

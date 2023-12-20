public class Numbers {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;


    public Numbers(int n1, int n2, int n3, int n4, int n5){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public boolean different(){
        return (n1 != n2) && (n1 != n3) && (n1 != n4) && (n1 != n5) &&
        (n2 != n3) && (n2 != n4) && (n2 != n5) &&
        (n3 != n4) && (n3 != n5) &&
        (n4 != n5);
    }

    public static void main(String[] args) {
        Numbers numbers1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(numbers1.different());

        Numbers numbers2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(numbers2.different());
    }
}

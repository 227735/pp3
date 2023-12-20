public class SuperCounter extends Counter {

    public SuperCounter(int param) {
        super(param);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter superCounter = new SuperCounter(5);
        System.out.println(superCounter.getCounter());
        superCounter.addN(3);
        System.out.println(superCounter.getCounter());
        superCounter.add1();
        System.out.println(superCounter.getCounter());
    }
}

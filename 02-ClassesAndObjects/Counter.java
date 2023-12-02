public class Counter {
    private int value;

    public Counter() {
        value = 0; 
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increaseBy10() {
        value += 10;
    }

    public void decreaseBy10() {
        value -= 10;
    }

    public void reset() {
        value = 0; 
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increaseBy10();
        counter1.increase();
        
        Counter counter2 = new Counter();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decreaseBy10();
        counter2.decrease();

        System.out.println("Counter 1 Value: " + counter1.getValue());
        System.out.println("Counter 2 Value: " + counter2.getValue());
    }
}
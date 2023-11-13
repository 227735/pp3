public class Counter {
    private static int counterValue = 0;

    public void increase(){
        counterValue++;
    } 

    public void decrease(){
        counterValue--;
    } 

    public void increase(int n){
        counterValue += n;
    }

    public void decrease(int n){
        counterValue -= n;
    }

    public int value(){
        return counterValue;
    }


}

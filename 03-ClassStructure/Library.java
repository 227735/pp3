public class Library {
    
    static int numberOfItems(int x, int y){
        int count = 0;
        for(int i = x; i <= y; i++){
            count ++;
        }
        return count;
    }

    static int sumOfItems(int x, int y){
    int sum = 0;
    for(int i = x; i <= y; i++){
        sum += i;
    }
    return sum;
    }

    static double ArithmeticMean (double x, double y){
    double sum = 0;
    double count = 0;
    for(double i = x; i <= y; i++){
        sum += i;
        count ++;
    }
    return sum/count;
    }
}

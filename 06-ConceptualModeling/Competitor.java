import java.util.Arrays;

public class Competitor{
    private int[] scores = new int[5];

    public Competitor(){
        assignScores();
    }


    private void assignScores(){
        for(int i=0; i < 5; i++){
            scores[i] = (int)(Math.random()*5) +  1;
        }
    }

    public double calculate(){
        Arrays.sort(scores);
        int sum = 0;

        for (int i = 1; i < 4; i++ ){
            sum += scores[i];
        }
        return sum / 3.0;
    }

    public void displayResult() {
        System.out.printf("Competitor's Final Result: %.2f\n",calculate());
    }
}


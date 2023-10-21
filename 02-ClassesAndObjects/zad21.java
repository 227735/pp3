public class zad21 {
    public static void main(String[] args) {
        float height = 170;

        float TotalInches = (int) Math.round(height/ 2.54); // 1 inch = 2.54 
        float feet = TotalInches / 12; //12 inches in one foot
        float inches = TotalInches % 12;

        System.out.println("I am " + height +"cm tall, i.e. " +(int) feet + " feet and " + (int) inches + " inches");

    }
}
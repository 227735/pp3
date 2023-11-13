public class MathOperations {
    public static void main (String[]args) {
        int number1 = 34;
        int number2 = 49;
        int largerNumber = Math.max(number1, number2);
        System.out.println("The larger of two numbers is: " + largerNumber);

        double pi = Math.PI;
        System.out.println("Pi numbers are: " + pi);

        int value = -17;
        int absoluteValue = Math.abs(value);
        System.out.println("The absolute value is: " + absoluteValue);

        int num1 = 9;
        int num2 = 2;
        double dzielenie = num1/num2;
        double squareRoot = Math.sqrt(dzielenie);
        System.out.println("Pierwiastek z tych liczb to: " + squareRoot);

        double randomValue = Math.random();
        System.out.println("Random number in the range [0.0, 1.0) is " + randomValue);

        int randomInt = (int) (Math.random() * 10);
        System.out.println("Integer random number in the range [0, 10) is " + randomInt);

        double degrees = 90;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        System.out.println("The sin of 90 degrees is " + sin);
    }
}

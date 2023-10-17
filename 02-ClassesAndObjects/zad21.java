public class zad21 {
    public static void main(String[] args) {
    int HeightInCm = 170;
    int feet = (int)(HeightInCm / 30.48);
    int inch = (int)((HeightInCm % 30.48 ) /2.54);
   
    System.out.println("I am " + HeightInCm + "cm, that's "+ feet +"feet" + inch +" inches");
    }
}

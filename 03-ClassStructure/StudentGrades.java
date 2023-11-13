import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public StudentGrades(String name) {
        this.studentName = name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid grade.");
                scanner.next(); // Clear the invalid input
            }
            grades[i] = scanner.nextDouble();
        }
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
         
        Random random = new Random();
        double[] a = new double[numberOfGrades];
        for (int i = 0; i < a.length; i++) {
            double randomGrade = Math.round((random.nextDouble() * 5.0 + 1.0));
            a[i] = randomGrade;
        }
        this.grades = a;

    }

    public double lowest(){
        double lowest = grades[0];
        for (int i=1; i<grades.length;i++){
            if (lowest>grades[i]){
                lowest =grades[i];
            }
        }
        return lowest;
    }
    public double highest(){
        double highest = grades[0];
        for (int i=1; i<grades.length;i++){
            if (highest<grades[i]){
                highest = grades[i];
            }
        }
        return highest;
    }
    public int numberOfGrades(){
        int sum=0;
        for (int i =0; i<grades.length;i++){
            sum++;
        }
        return sum;
    }
    public double average(){
        double sum=0;
        for (int i=0; i<grades.length;i++){
            sum=sum+grades[i];
        }
        return sum/numberOfGrades();
    }
    public String display(){
        StringBuilder gr = new StringBuilder();
        for (int i=0; i<grades.length;i++){
            gr.append(grades[i]);
            
            if ( i< grades.length-1 ) {
                gr.append(", ");

            }
        
        }
    
        return "Imię studenta: "+this.studentName+", lista jego ocen: "+ gr+", najniższa ocena: "+ lowest()+", najwyższa ocena: "+highest()+", średnia ocen: "+average();
    }
}


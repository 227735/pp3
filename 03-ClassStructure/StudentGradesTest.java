public class StudentGradesTest {
    public static void main(String[] args) {
        double[]b={3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades student1 = new StudentGrades("Adam", b );
        StudentGrades student2 = new StudentGrades("Ala", 7);
        StudentGrades student3 = new StudentGrades("Anna");
    
        // System.out.println(student1.lowest());
        // System.out.println(student1.highest());
        // System.out.println(student1.numberOfGrades());
        // System.out.println(student1.average());
        System.out.println(student3.display());
    }
}
    

public class StudentTest {    
    public static void main(String[] args) {
        
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        s.ID = "345634";
        s.SemesterNumber = 3;
        s.grade = 4;
        
        Student a = new Student();
        a.name = "Adam";
        a.age = 23;

        Student b = new Student();
        b.name = "Anna";
        b.age = 19;

        System.out.println(s.name + " " + s.age);
        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayStudentID();
        s.displaySemesterNumber();
        s.displayAverageGrade();

        System.out.println(a.name + " " + a.age);
        a.sayHello();
        a.displayName();
        a.displayAge();

        System.out.println(b.name + " " + b.age);
        b.sayHello();
        b.displayName();
        b.displayAge();
    }
}

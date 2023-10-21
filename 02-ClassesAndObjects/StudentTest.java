public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student a = new Student();
        Student b = new Student();
        a.name = "Jan";
        b.name = "Marian";
        a.age = 28;
        b.age = 33;
        a.id = 224;
        b.id = 123;
        a.isCardValid = true;
        b.isCardValid = false;
        a.semesterNumber = 1;
        b.semesterNumber = 2;
        a.averageGrade = 3.43f;
        b.averageGrade= 4.67f;

        a.sayHello();
        a.displayName();
        a.displayAge();
        a.displayData();
        a.displayData2();
        a.changeStatusIdCard();
        a.displayData2();

        b.sayHello();
        b.displayName();
        b.displayAge();
        b.displayData();
        b.displayData2();
        b.changeStatusIdCard();
        b.displayData2();
    }
}
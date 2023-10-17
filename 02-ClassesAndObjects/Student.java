public class Student {
    String name;
    int age;
    String ID;
    Boolean studentIdCardValid;
    int SemesterNumber;
    float grade;
void sayHello(){
        System.out.println("Hello from "+name+"\n");
}
void displayName(){
        System.out.println(name+"\n");
}
void displayAge(){
        System.out.println(age+"\n");
}
void displayStudentID(){
        System.out.println(ID+"\n");
}
void displayValid(){
        System.out.println(valid+"\n");
}
void displaySemesterNumber(){
        System.out.println(SemesterNumber+"\n");
}
void displayAverageGrade(){
        System.out.println(grade+"\n");
}
void DisplayStudentIdCardValid(){
    String valid = (valid == true) ? "Card is valid" : "Care is invalid";
    System.out.println(valid+"\n");
}
void ChangeId(){
    studentIdCardValid =! studentIdCardValid;

}
}

public class Student {
    String name;
    int age;
    int id;
    boolean isCardValid;
    int semesterNumber;
    float averageGrade;
    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void displayName() {
        System.out.println(name);
    }
    void displayAge() {
        System.out.println(age);
    }
    
    void displayData(){
        System.out.println(name + " " + semesterNumber + " " + averageGrade);
    }
        
    void changeStatusIdCard(){
        isCardValid = !isCardValid;
    }
    
    void displayData2(){
        System.out.println(name + " " + id + " " + (isCardValid ? "Valid" : "Invalid"));
    }
}
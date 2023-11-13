public class PersonTest {
    public static void main(String[] args) {
        Person o = new Person("Anna",21);
        System.out.println(o.getAge());
        System.out.println(o.isAdult());
        o.setAge(17);
        System.out.println(o.isAdult());
        System.out.println(o);
    }
    
}

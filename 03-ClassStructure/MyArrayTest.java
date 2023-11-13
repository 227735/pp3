public class MyArrayTest {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10};
        int[] b={-2,-3,-8,-5,3,2,5,6,7,8};
        int[] c= {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(MyArray.evenn(a));
        // System.out.println(MyArray.positiveOdd(b));
        // MyArray.reverse(a);
        // System.out.println(MyArray.compare(b,c));
        MyArray.different(b, c);
        System.out.println(MyArray.exist(-20,c));
    }
}
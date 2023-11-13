import java.util.Arrays;

public class MyArray {
    
    static int evenn(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                sum++;
            }
        }
        return sum;
    }

    static int positiveOdd(int[] tablica){
        int sum=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]%2!=0 && tablica[i]>=0){
                sum++;
            }
        }
        return sum;
    }

    static void reverse(int[] array){
        int[] a = new int[array.length];
        int b=array.length-1;
        int c=0;
        for (int j=b; j>=0; j--){
            a[c]=array[j];
            c++;
        }
        System.out.print("{"+a[0]);
        for(int i=1; i< a.length; i++){
            System.out.print(", "+a[i]);
        }
        System.out.println("}");
        
    } 
    static boolean compare(int[] array1, int[] array2){
        return Arrays.equals(array1, array2);
    }

    static void different(int[] tablica1, int[] tablica2){
        int[] a = new int[tablica1.length];
        int s = 0;

        for (int i = 0; i < tablica1.length; i++) {
            boolean znaleziono = false;
            
            for (int j = 0; j < tablica2.length; j++) {
                if (tablica1[i] == tablica2[j]) {
                    znaleziono = true;
                    break;
                }
            }

            if (!znaleziono) {
                a[s] = tablica1[i];
                s++;
            }
        }
        System.out.print("{"+a[0]);
        for(int i=1; i< a.length; i++){
            System.out.print(", "+a[i]);
        }
        System.out.println("}");

    //     int s = 0;

    //     for (int i = 0; i < tablica1.length; i++) {
    //         boolean znaleziono = false;
    
    //         for (int j = 0; j < tablica2.length; j++) {
    //             if (tablica1[i] == tablica2[j]) {
    //                 znaleziono = true;
    //                 break;
    //             }
    //         }
    
    //         if (!znaleziono) {
    //             s++;
    //         }
    //     }
    
    //     int[] a = new int[s];
    //     s = 0;
    
    //     for (int i = 0; i < tablica1.length; i++) {
    //         boolean znaleziono = false;
    
    //         for (int j = 0; j < tablica2.length; j++) {
    //             if (tablica1[i] == tablica2[j]) {
    //                 znaleziono = true;
    //                 break;
    //             }
    //         }
    
    //         if (!znaleziono) {
    //             a[s] = tablica1[i];
    //             s++;
    //         }
    //     }
    
    //     System.out.print("{" + a[0]);
    //     for (int i = 1; i < a.length; i++) {
    //         System.out.print(", " + a[i]);
    //     }
    //     System.out.println("}");
    // }
    }


    static boolean exist(int number, int[] array){
        for(int i=0;i<array.length;i++){
            if (number==array[i]){
                return true;
            }
        }
        return false;
    }


    // static int secondMax(int[] array){
    //     int max = Arrays.stream(array).max().getAsInt();

    //     for (int i=0;i<array.length;i++){
    //         if (array[i]!=max){
                
    //         }
    //     }
    // }
}
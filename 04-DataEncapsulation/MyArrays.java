public class MyArrays {
    int [] arr;
    static double sum = 0;
    static double sum2 = 0;
    static double above =0;
    static double sum3 = 0;
    static double sum4 = 0;


    static double odd(int [] arr){
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]>0 && arr[i]%2!=0){
                sum++;
            }    
        }
        return sum;
    }

    static double above(int[] arr){
        for (int i = 0 ; i<arr.length; i++){
                sum4++;
        }
        for (int i = 0 ; i<arr.length; i++){
                sum2=sum2+arr[i];
        }
        above = sum2/sum4;
        for (int i = 0 ; i<arr.length; i++){
                if(arr[i]>above){
                    sum3=sum3+arr[i];
                }
        }
        return sum3;
    }
    
}

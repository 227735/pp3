public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2) {
        int countArr1 = count(arr1);
        int countArr2 = count(arr2);

        return countArr1 == countArr2;
    }

    private static int count(int[] arr) {
        int count = 0;

        for (int number : arr) {
            if (twoDigit(number)) {
                count++;
            }
        }

        return count;
    }

    private static boolean twoDigit(int number) {
        return number >= 10 && number <= 99;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 8, 2, 37, 49, 117};
        int[] arr2 = {9, 6, 7, 12, 48, 4, 6, 90, 5};

        boolean result = arr(arr1, arr2);

        System.out.println(result); // Output should be true
    }

}
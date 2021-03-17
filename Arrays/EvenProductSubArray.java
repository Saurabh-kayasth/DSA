import java.util.*;

class EvenProductSubArray {

    public static void findEvenSubArray(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                if (product * arr[j] % 2 == 0) {
                    counter++;
                    product = product * arr[j];
                }
            }
        }
        System.out.println(counter);
    }

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int number_of_cases = s.nextInt();
        for (int i = 0; i < number_of_cases; i++) {
            int arr_size = s.nextInt();
            int[] arr = new int[arr_size];
            for (int j = 0; j < arr_size; j++) {
                arr[j] = s.nextInt();
            }
            findEvenSubArray(arr);
        }
        s.close();
    }
}

import java.io.*;
import java.util.*;

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int len = a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[len];
            a[len] = temp;
            len--;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = {2,3,4,1};

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println("");
    }
}

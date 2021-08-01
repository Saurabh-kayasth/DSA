
public class RotateArray {

    void rotateArrayLeft(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void rotateArrayRight(int[] arr, int n) {
        int temp = arr[n - 1];
        for (var i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    // Juggling algorithm
    void rotateArrayLeftJuggling(int[] arr, int n, int k) {
        int d = -1;
        int j = 0;
        for (var i = 0; i < gcd(n, k); i++) {
            j = i;
            int temp = arr[i];
            while (true) {
                d = (j + k) % n;
                if (d == i) {
                    break;
                }
                arr[j] = arr[d];
                j = d;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int n, int k) {
        if (k == 0) {
            return n;
        } else {
            return gcd(k, n % k);
        }
    }

    public static void main(String[] args) {
        RotateArray arrayObj = new RotateArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        for (int i = 0; i < d; i++) {
            arrayObj.rotateArrayLeft(arr, arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int[] arr2 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < d; i++) {
            arrayObj.rotateArrayRight(arr2, arr2.length);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();

        int[] arr3 = { 1, 2, 3, 4, 5, 6 };
        arrayObj.rotateArrayLeftJuggling(arr3, arr3.length, d);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }

    }
}

public class RotateArray {

    void rotateArray(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        RotateArray arrayObj = new RotateArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 4;
        for (int i = 0; i < d; i++) {
            arrayObj.rotateArray(arr, arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
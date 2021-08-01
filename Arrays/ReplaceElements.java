// Given an array arr, replace every element in that array with the 
// greatest element among the elements to its right, 
// and replace the last element with -1.

// After doing so, return the array.
// Example 1:

// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
// Explanation: 
// - index 0 --> the greatest element to the right of index 0 is index 1 (18).
// - index 1 --> the greatest element to the right of index 1 is index 4 (6).
// - index 2 --> the greatest element to the right of index 2 is index 4 (6).
// - index 3 --> the greatest element to the right of index 3 is index 4 (6).
// - index 4 --> the greatest element to the right of index 4 is index 5 (1).
// - index 5 --> there are no elements to the right of index 5, so we put -1.

public class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 }; // {18,6,6,6,1,-1}
        // int[] arr = { 400 };
        // int[] ans = replaceElements(arr);
        int[] ans = replaceElementsOpt(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    static int[] replaceElementsOpt(int[] arr) {
        int maximumElement = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = maximumElement;
            if (arr[i] > maximumElement) {
                maximumElement = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }
}

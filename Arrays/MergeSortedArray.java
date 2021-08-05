public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4 };
        int[] arr2 = { 2, 3 };
        int[] sortedArray = new int[arr1.length + arr2.length];
        sortedArray = mergeSortedArray(arr1, arr2);
        printArray(sortedArray);
    }

    static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }

    static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

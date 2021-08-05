public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergeSort(arr, 0, 4);
        printArray(arr);
    }

    static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    static void merge(int[] arr, int l, int mid, int h) {

        int n1 = mid - l + 1;
        int n2 = h - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i1 = 0; i1 < n1; ++i1) {
            arr1[i1] = arr[l + i1];
        }

        for (int i2 = 0; i2 < n2; ++i2) {
            arr2[i2] = arr[mid + 1 + i2];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            int temp = arr[k];
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

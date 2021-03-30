public class ArrayADT {
    static int size = 6;
    static int[] arr = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        append(7);
        insert(4, 9);
        delete(4);
        linearSearch(7);
        binarySearch(7);
        get(5);
        set(5, 10);
        display(arr);
        reverse();
        display(arr);
    }

    static void display(int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insert(int index, int element) {
        ++size;
        for (int i = size; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }

    static void append(int element) {
        arr[size++] = element;
    }

    static void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        --size;
    }

    static void linearSearch(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println(element + " found at index " + i);
            }
        }
    }

    static void binarySearch(int element) {
        int l = 0;
        int h = size;
        while (l < h) {
            int m = (l + h) / 2;
            if (arr[m] != element) {
                if (arr[m] > element) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            } else {
                System.out.println(element + " found at index " + m);
                break;
            }
        }
    }

    static void get(int index) {
        System.out.println(arr[index]);
    }

    static void set(int index, int element) {
        arr[index] = element;
    }

    static void max() {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Max element in an array is " + maximum);
    }

    static void min() {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Min element in an array is " + minimum);
    }

    static void reverse() {
        int index = size;
        for (int i = 0; i < size; i++) {
            arr[i] = index;
            index--;
        }
    }
}

public class InversionArray {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 1 };
        System.out.println(inversionInArray(arr));
    }

    static int inversionInArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    count++;
            }
        }
        return count;
    }

    static int inversionInArrayOpt(int[] arr) {
        int count = 0;
        return count;
    }
}

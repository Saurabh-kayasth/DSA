public class TopRunners {
    public static void main(String[] args) {
        double[] arr = { 42.195, 42.195, 42.195, 33.25, 40, 41.2, 38.9, 37.5, 35.0, 33.4, 41.3 };
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 42.195 || arr[i + 1] == 42.195) {
                counter++;
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = counter; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i > counter + 1) {
                break;
            }
        }
    }
}

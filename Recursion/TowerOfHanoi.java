public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3, A = 1, B = 2, C = 3;
        TOH(n, A, B, C);
    }

    static void TOH(int n, int A, int B, int C) {
        if (n > 0) {
            TOH(n - 1, A, C, B);
            System.out.println("Move from " + A + " to " + C);
            TOH(n - 1, B, A, C);
        }
    }
}

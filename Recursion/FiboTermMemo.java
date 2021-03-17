
public class FiboTermMemo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }

    static int[] fibs = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    static int fibo(int n) {
        if (n <= 1) {
            fibs[n] = n;
            return n;
        }
        if (fibs[n - 2] == -1) {
            fibs[n - 2] = fibo(n - 2);
        }
        if (fibs[n - 1] == -1) {
            fibs[n - 1] = fibo(n - 1);
        }
        return fibs[n - 2] + fibs[n - 1];
    }
}

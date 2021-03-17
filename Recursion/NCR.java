public class NCR {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println(ncr(n, r));
    }

    static int ncr(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return ncr(n - 1, r - 1) + ncr(n - 1, r);
        }
    }
}

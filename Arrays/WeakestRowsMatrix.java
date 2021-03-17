import java.util.ArrayList;

public class WeakestRowsMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int k = 3;

        int[] ans = kWeakestRows(mat, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] kWeakestRows(int[][] mat, int k) {
        int r = 0;
        int c = mat[0].length - 1;
        int[] ans = new int[mat.length];

        while (r <= mat.length - 1) {
            if (mat[r][c] == 1) {
                // System.out.println(r +" " +c);
                ans[r++] = c + 1;
                c = mat[0].length - 1;
            } else {
                c--;
            }
        }

        ArrayList<Integer> order = new ArrayList<Integer>();
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] - 1);
            order.add(ans[i] - 1, i);
        }

        int[] newOrder = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            // newOrder[i] = order.get(i);
        }

        return newOrder;
    }

}

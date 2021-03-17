import java.util.Scanner;

public class PascalRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                int coeff = getCoeff(i, j);
                System.out.print(coeff + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int getCoeff(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
}

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itr = sc.nextInt();
        for (int i = 0; i < itr; i++) {
            int n = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                n = n / 10;
                sum += d;
                if (n == 0) {
                    if (sum % 10 == sum && sum % 9 != 0) {
                        System.out.println(sum);
                        break;
                    } else if (sum % 9 == 0) {
                        System.out.println(0);
                        break;
                    } else {
                        n = sum;
                        sum = 0;
                    }
                }
            }
        }
        sc.close();
    }
}

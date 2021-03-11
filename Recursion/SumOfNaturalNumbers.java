public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else {
            return sum(n-1)+n;
        }
    }
}

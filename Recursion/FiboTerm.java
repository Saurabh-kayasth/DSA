public class FiboTerm {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        else {
            return fib(n-2) + fib(n-1);
        }
    }
}

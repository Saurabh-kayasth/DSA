public class FiboTerm {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
        System.out.println(fibOpt(n));
    }

    static int fib(int n){
        if(n<=1){
            return n;
        }
        else {
            return fib(n-2) + fib(n-1);
        }
    }

    static int[] fibos = new int[]{-1,-1,-1,-1,-1,-1,-1};
    static int fibOpt(int n){
        return n;
    }
}

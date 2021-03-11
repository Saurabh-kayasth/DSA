public class FindExponent {
    public static void main(String[] args) {
        int m = 2,n=4;
        System.out.println(findExponent(m,n));
    }

    static int findExponent(int m,int n){
        if(n==0){
            return 1;
        }
        else {
            return findExponent(m, n-1)*m;
        }
    }
}

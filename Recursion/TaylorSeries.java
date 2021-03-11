public class TaylorSeries {
    public static void main(String[] args){
        int x = 1;
        int n = 10;
        System.out.println(e(x,n));
    }

    static double p=1.0,f=1.0;
    static double e(int x, int n){
        if(n == 0){
            return 1.0;
        }
        else {
            double r = e(x,n-1);
            p = p*x;
            f = f*n;
            return r + p/f; 
        }
    }
}

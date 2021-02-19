import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int row=0,col=0;
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        int total = 0;

        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if((row == i || col == j) && arr[i][j] != maxValue){
                    total += arr[i][j];
                }
            }
        }

        System.out.println(maxValue+"   "+row+"   "+col+"   "+total);
    }
}

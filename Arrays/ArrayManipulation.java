// Starting with a 1-indexed array of zeros and a list of operations, 
// for each operation add a value to each the array element between 
// two given indices, inclusive. Once all operations have been performed, 
// return the maximum value in the array.

// Example
// -------
// Queries are interpreted as follows:

//     a b k
//     1 5 3
//     4 8 7
//     6 9 1
// Add the values of  between the indices  and  inclusive:

// index->	 1 2 3  4  5 6 7 8 9 10
// 	[0,0,0, 0, 0,0,0,0,0, 0]
// 	[3,3,3, 3, 3,0,0,0,0, 0]
// 	[3,3,3,10,10,7,7,7,0, 0]
// 	[3,3,3,10,10,8,8,8,1, 0]
// The largest value is  after all operations are performed.

public class ArrayManipulation {
    public static void main(String[] args) {
        int[][] queries = {
            {1, 2, 100},
            {2, 5, 100},
            {3, 4, 100}
        };
        
        int n = 5;
        int ans = arrayManipulation(n, queries);
        System.out.println(ans);
    }

    static int arrayManipulation(int n,int[][] queries){
        int[] ans = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<queries.length;i++){
            int start = queries[i][0]-1;
            int end = queries[i][1]-1;
            int number = queries[i][2];
            while(start <= end){
                ans[start] += number;
                if(ans[start] > max){
                    max = ans[start];
                }
                start++;
            }
        }
        return max;
    }
}

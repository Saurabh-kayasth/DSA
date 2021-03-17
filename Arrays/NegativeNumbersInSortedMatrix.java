// Given a m x n matrix grid which is sorted in non-increasing
// order both row-wise and column-wise, 
// return the number of negative numbers in grid.

// Example 1:
// Input: grid = [
//                [4 , 3, 2,-1],
//                [3 , 2, 1,-1],
//                [1 , 1,-1,-2],
//                [-1,-1,-2,-3]
//               ]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Example 2:
// Input: grid = [[3,2],[1,0]]
// Output: 0

// Example 3:
// Input: grid = [[1,-1],[-1,-1]]
// Output: 3

// Example 4:
// Input: grid = [[-1]]
// Output: 1

public class NegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = new int[][] { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        // int[][] grid = new int[][]{{}};
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int r = grid.length - 1;
        int c = 0;
        int count = 0;

        while (r >= 0 && c <= grid[0].length - 1) {
            if (grid[r][c] < 0) {
                r--;
                count += grid[0].length - c;
            } else {
                c++;
            }
        }
        return count;
    }
}

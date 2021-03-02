// Given a non-empty array nums containing only positive integers, 
// find if the array can be partitioned into two subsets such 
// that the sum of elements in both subsets is equal.

// Example 1:
// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].

// Example 2:
// Input: nums = [1,2,3,5]
// Output: false
// Explanation: The array cannot be partitioned into equal sum subsets.

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }

    static boolean canPartition(int[] nums) {
        return false;
    }
}


import java.util.HashMap;

// Problem : leetcode
// Given the array nums, for each nums[i] find out how many numbers in the array 
// are smaller than it. That is, for each nums[i] you have to 
// count the number of valid j's such that j != i and nums[j] < nums[i].

public class SmallerNumbers {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4, 1 };
        // nums = smallerNumbersThanCurrent(nums);
        int[] nums2 = smallerNumbersThanCurrentNumber(nums);

        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < currentNum) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    // Works with positive numbers only
    public static int[] smallerNumbersThanCurrentNumber(int[] nums) {
        int[] temp = new int[101];
        for (int num : nums) {
            temp[num]++;
        }

        int sum = 0;
        int[] result = new int[nums.length];

        // cumulative sum
        int[] cumSum = new int[101];
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            cumSum[i] = sum;
        }
        System.out.println("");

        for (int i = 0; i < nums.length; i++) {
            result[i] = cumSum[nums[i] - 1];
        }

        return result;
    }

}
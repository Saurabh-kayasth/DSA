import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Given a non-empty array of integers nums, 
// every element appears twice except for one. 
// Find that single one.

// Follow up: Could you implement a solution 
// with a linear runtime complexity and without using extra memory?
// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

// Example 3:
// Input: nums = [1]
// Output: 1

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberXor(nums));

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int ans = 0;
        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int) mapElement.getKey();
            int value = ((int) mapElement.getValue());
            if (value == 1) {
                ans = key;
            }
        }
        return ans;
    }

    public static int singleNumberXor(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            // num ^ num = 0
            // 0 ^ num = num
            // num1 ^ num2 = sum
            // sum ^ num1 = num2 = sum - num1
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }
}

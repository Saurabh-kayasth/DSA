import java.util.HashMap;

// Time Complexity : O(log(n))

public class MajorityElementArray {
    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                int count = countMap.get(nums[i]) + 1;
                if (count > nums.length / 2) {
                    ans = nums[i];
                    break;
                }
                countMap.put(nums[i], count);
            } else {
                countMap.put(nums[i], 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 3 };
        int arr[] = new int[]{3,2,3};
        System.out.println(findMajorityElement(arr));
    }
}
import java.lang.Thread.State;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 1, 3 };
        int target = 3;
        System.out.println(search(nums, target));
        System.out.println(search2(nums, target));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int midPoint = left + (right - left) / 2;

            if (nums[midPoint] > nums[right]) {
                left = midPoint + 1;
            } else {
                right = midPoint;
            }
        }
        // System.out.println(left + "\t" + right);

        int start = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while (left <= right) {
            int midPoint = left + (right - left) / 2;

            if (nums[midPoint] == target) {
                return midPoint;
            } else if (nums[midPoint] < target) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return -1;
    }

    static int search2(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            if (nums[left] > nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(left + "\t" + right);
        if (target < nums[left]) {
            left = 0;
            right = nums.length - 1;
        } else if (target > nums[left]) {
            right = nums.length - 1;
        } else {
            return nums[left];
        }
        System.out.println(left + "\t" + right);

        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (target == nums[midPoint]) {
                return midPoint;
            } else if (target > nums[midPoint]) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return -1;
    }
}

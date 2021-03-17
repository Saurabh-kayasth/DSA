public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > 0) {
                if (nums[i] <= nums.length) {
                    ans[nums[i] - 1] = nums[i];
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            // System.out.println(ans[i]);
            if (ans[i] == 0) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}
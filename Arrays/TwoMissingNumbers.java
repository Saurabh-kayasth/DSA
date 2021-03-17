public class TwoMissingNumbers {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int[] ans = findFirstTwoMissingNumbers(nums);
        for (int i = 0; i <= ans.length - 1; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    static int[] findFirstTwoMissingNumbers(int[] nums) {

        int[] ans = new int[nums.length + 2];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > 0) {
                if (nums[i] <= nums.length + 2) {
                    ans[nums[i] - 1] = nums[i];
                }
            }
        }

        int[] twoNumbers = new int[2];
        int counter = 0;

        for (int i = 0; i < ans.length; i++) {
            // System.out.println(ans[i]);

            if (ans[i] == 0) {
                twoNumbers[counter++] = i + 1;
            }
        }

        return twoNumbers;
    }
}

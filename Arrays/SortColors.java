public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 0 };
        int[] ans = sortColors(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else if (nums[m] == 2) {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
        return nums;
    }
}

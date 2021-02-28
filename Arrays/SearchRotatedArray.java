import java.lang.Thread.State;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int midPoint = left + (right-left)/2;

            if(nums[midPoint] > nums[right]){
                left = midPoint + 1;
            }
            else {
                right = midPoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length-1;

        if(target >= nums[start] && target<=nums[right]){
            left = start;
        }
        else{
            right = start;
        }

        System.out.println(left);
        System.out.println(right);

        while(left <= right){
            int midPoint = left + (right - left)/2;

            if(nums[midPoint] == target){
                return midPoint;
            }
            else if(nums[midPoint] < target){
                left = midPoint + 1;
            }
            else {
                right = midPoint - 1;
            }
        }
        return -1;
    }
}

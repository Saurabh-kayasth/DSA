public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(increasingTriplet(nums));
    }

    static boolean increasingTriplet(int[] nums) {

        if(nums.length < 3){
            return false;
        }

        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= max1){
                max1 = nums[i];
            }
            else if(nums[i] <= max2){
                max2 = nums[i];
            }
            else {
                return true;
            }
        }

        return false;
    }
}

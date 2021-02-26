// Problem : 
// Given the array nums, for each nums[i] find out how many numbers in the array 
// are smaller than it. That is, for each nums[i] you have to 
// count the number of valid j's such that j != i and nums[j] < nums[i].

public class SmallerNumbers {
    public static void main(String[] args){
        int[] nums = {1,4,5,6,2};

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int currentNum = nums[i];
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<currentNum){
                    count++;
                }
            }   
            ans[i]= count;
        }
        return ans;
    }
}
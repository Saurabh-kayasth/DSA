// Given an integer array nums, you need to find one continuous subarray 
// that if you only sort this subarray in ascending order, 
// then the whole array will be sorted in ascending order.

// Return the shortest such subarray and output its length.

// Example 1:
// -----------
// Input: nums = [2,6,4,8,10,9,15]
// Output: 5
// Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order 
// to make the whole array sorted in ascending order.

// Example 2:
// ----------
// Input: nums = [1,2,3,4]
// Output: 0

// Example 3:
// ------------
// Input: nums = [1]
// Output: 0


class UnsortedSubarray {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        // int ans = findUnsortedSubarray(nums);
        int ans = findUnsortedSubarrayOpt(nums);
        System.out.println(ans);
    }

    static int findUnsortedSubarray(int[] nums) {
        int[] tempArr = nums.clone();
        for(int i =0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }

        int i,j;
        for(i =0;i<nums.length;i++){
            
            if(tempArr[i] != nums[i]){
                break;
            }
        }
        
        for(j = nums.length-1;j>=0;j--){
            if(tempArr[j] != nums[j]){
                break;
            }
        }

        return j-i > 0 ? j-i+1:0;
    }

    static int findUnsortedSubarrayOpt(int[] nums) {
        
        return 0;
    }
}

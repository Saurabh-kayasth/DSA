import java.util.HashMap;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<=nums.length-1;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            else{
                map.put(nums[i],0);
            }
        }

        return 0;
    }

}

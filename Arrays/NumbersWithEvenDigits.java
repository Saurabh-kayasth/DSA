public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {-10,-10,-1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {

        int count = 0;

        for(int i=0;i<=nums.length-1;i++){
            // int d = 0;
            int n = nums[i];
            int countDigits = 0;
            while(n != 0 ){
                n = n / 10;
                countDigits++;
            }

            if(countDigits % 2 == 0){
                count++;
            }
        }

        return count;
    }

}

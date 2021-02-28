public class LeadersArray {
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] ans = findLeaderInArray(arr);
        for(int i=0;i<ans.length;i++){
            if(ans[i] == 0){
                break;
            }
            System.out.print(ans[i]+" ");
        }
    }

    static int[] findLeaderInArray(int[] arr){
        int[] ans = new int[arr.length];
        int max_element = arr[arr.length-1];
        int pointer = 0;
        ans[pointer++] = max_element;

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max_element){
                max_element = arr[i];
                ans[pointer++] = max_element;
            }
        }
        return ans;
    }
}

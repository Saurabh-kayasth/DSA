import java.util.HashMap;

// Time Complexity : O(log(n))

public class MajorityElementArray {
    public static void findMajorityElement(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                int count = countMap.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println(arr[i]);
                    return;
                }
                countMap.put(arr[i], count);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        System.out.println("Majority element does not exist");
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 3 };
        findMajorityElement(arr);
    }
}
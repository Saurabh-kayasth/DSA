import java.util.HashMap;

// Time Complexity : O(log(n))

public class MajorityElementArray {

    // HashMap solution
    public static int findMajorityElement(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return -1;
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int ans = nums[0];
        for (var i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                int count = countMap.get(nums[i]) + 1;
                if (count > nums.length / 2) {
                    ans = nums[i];
                    return ans;
                }
                countMap.put(nums[i], count);
            } else {
                countMap.put(nums[i], 1);
            }
        }
        return -1;
    }

    // Two loop solution
    public static int findMajorityElement2(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return -1;
        }
        int ans = arr[0];
        for (var i = 0; i < arr.length; i++) {
            int count = 0;
            for (var j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                ans = arr[i];
                return ans;
            }
        }
        return -1;
    }

    // Moore's voting algorithm
    public static int findMajorityElementUsingMooreVoting(int[] arr) {
        int candidate = findCandidate(arr);
        int count = 0;
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
            if (count > arr.length / 2) {
                return candidate;
            }
        }
        return -1;
    }

    public static int findCandidate(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return -1;
        }
        var majIndex = 0;
        var count = 1;
        for (var i = 1; i < arr.length; i++) {
            if (arr[majIndex] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majIndex = i;
                count = 1;
            }
        }
        return arr[majIndex];
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 3 };
        // int arr[] = new int[] { 3, 2, 3 };
        System.out.println(findMajorityElement(arr) == -1 ? "Majority element not found" : findMajorityElement2(arr));
        System.out.println(findMajorityElement2(arr) == -1 ? "Majority element not found" : findMajorityElement2(arr));
        System.out.println(findMajorityElementUsingMooreVoting(arr) == -1 ? "Majority element not found"
                : findMajorityElement2(arr));
    }
}
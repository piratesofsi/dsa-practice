import java.util.*;

public class minimumrotatedsortedarrayoptimal {

    static int small(int arr[]) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // if both the parts are sorted 
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // left part sorted
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            // right part sorted
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findMin(int[] nums) {
        return small(nums);
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println("Min of nums1: " + findMin(nums1)); // Expected 1
        System.out.println("Min of nums2: " + findMin(nums2)); // Expected 0
        System.out.println("Min of nums3: " + findMin(nums3)); // Expected 11
    }
}

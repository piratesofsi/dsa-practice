import java.util.*;

public class NextGreaterBrute {

    // ---- BRUTE FORCE FUNCTION ----
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            int target = nums1[i];
            int pos = -1;

            // find index of target in nums2
            for (int t = 0; t < nums2.length; t++) {
                if (nums2[t] == target) {
                    pos = t;
                    break;
                }
            }

            int nextGreater = -1;

            // scan right side
            for (int j = pos + 1; j < nums2.length; j++) {
                if (nums2[j] > target) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans[k++] = nextGreater;
        }

        return ans;
    }

    // ---- HELPER ----
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // ---- TEST DRIVER ----
    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println("Test Case 1:");
        printArray(nextGreaterElement(nums1, nums2));

        int[] nums1b = {2, 4};
        int[] nums2b = {1, 2, 3, 4};

        System.out.println("Test Case 2:");
        printArray(nextGreaterElement(nums1b, nums2b));

        int[] nums1c = {1, 3, 5, 2, 4};
        int[] nums2c = {6, 5, 4, 3, 2, 1, 7};

        System.out.println("Test Case 3:");
        printArray(nextGreaterElement(nums1c, nums2c));
    }
}

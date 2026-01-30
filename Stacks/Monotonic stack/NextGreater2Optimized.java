import java.util.*;

public class NextGreater2Optimized {

    // ---- OPTIMIZED CIRCULAR SOLUTION ----
    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }

            st.push(nums[i % n]);
        }

        return ans;
    }

    // ---- HELPER ----
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // ---- TEST DRIVER ----
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 1};
        System.out.println("Test Case 1:");
        printArray(nextGreaterElements(nums1));

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 2:");
        printArray(nextGreaterElements(nums2));

        int[] nums3 = {2, 1, 2, 4, 3};
        System.out.println("Test Case 3:");
        printArray(nextGreaterElements(nums3));

        int[] nums4 = {1};
        System.out.println("Test Case 4:");
        printArray(nextGreaterElements(nums4));
    }
}

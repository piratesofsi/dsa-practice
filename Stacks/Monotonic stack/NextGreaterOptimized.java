import java.util.*;

public class NextGreaterOptimized {

    // ---- YOUR OPTIMIZED FUNCTION ----
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[nums1.length];

        // traverse nums2 from right
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], st.peek());
            }

            st.push(nums2[i]);
        }

        // fill answers for nums1
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    // ---- HELPER FUNCTION ----
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

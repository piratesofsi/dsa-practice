import java.util.*;

public class LargestRectangleHistogram_Optimized {

    public static int largestRectangleArea(int[] heights) {

        if (heights.length == 1) {
            return heights[0];
        }

        int n = heights.length;

        Stack<Integer> st = new Stack<>();

        int[] nsl = new int[n];
        int[] nsr = new int[n];

        // Next Smaller to Left
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            nsl[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

        // Next Smaller to Right
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            nsr[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = nsr[i] - nsl[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int[] heights2 = {2, 4};
        int[] heights3 = {6, 2, 5, 4, 5, 1, 6};

        runTest(heights1);
        runTest(heights2);
        runTest(heights3);
    }

    private static void runTest(int[] arr) {

        System.out.println("Histogram: " + Arrays.toString(arr));

        int ans = largestRectangleArea(arr);

        System.out.println("Max Rectangle Area: " + ans);
        System.out.println("----------------------------------");
    }
}

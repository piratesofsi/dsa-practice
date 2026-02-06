import java.util.*;

public class LargestRectangleHistogram_Brute {

    public static int largestRectangleArea(int[] heights) {

        if (heights.length == 1) {
            return heights[0];
        }

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int minHeight = heights[i];

            for (int j = i; j < heights.length; j++) {

                minHeight = Math.min(minHeight, heights[j]);

                int width = j - i + 1;

                int area = minHeight * width;

                maxArea = Math.max(maxArea, area);
            }
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

import java.util.*;

public class SumSubarrayMins_Optimized {

    public static int sumSubarrayMins(int[] arr) {

        int MOD = (int) 1e9 + 7;

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long nsl = i - left[i];
            long nsr = right[i] - i;

            long contribution = nsl * nsr * arr[i];

            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        System.out.println("Array: " + Arrays.toString(arr));

        int ans = sumSubarrayMins(arr);

        System.out.println("Sum of Subarray Minimums (Optimized): " + ans);
    }
}

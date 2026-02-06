import java.util.*;

public class SumSubarrayMins_Brute {

    public static int sumSubarrayMins(int[] arr) {

        int MOD = (int) 1e9 + 7;

        long sum = 0;

        // Generate all subarrays
        for (int i = 0; i < arr.length; i++) {

            int mini = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {

                mini = Math.min(mini, arr[j]);
                sum = (sum + mini) % MOD;
            }
        }

        return (int) sum;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        System.out.println("Array: " + Arrays.toString(arr));

        int ans = sumSubarrayMins(arr);

        System.out.println("Sum of Subarray Minimums (Brute Force): " + ans);
    }
}

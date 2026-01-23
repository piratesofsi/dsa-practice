import java.util.*;

public class CombinationSum3 {

    // Backtracking helper function
    private static void solve(int index, int target, int k,
                              List<List<Integer>> ans,
                              List<Integer> ansSmall) {

        // Base case: if we selected k numbers
        if (ansSmall.size() == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(ansSmall));
            }
            return;
        }

        // If target becomes negative → prune
        if (target < 0) return;

        // Try numbers from index to 9
        for (int i = index; i <= 9; i++) {

            // Choose
            ansSmall.add(i);

            // Explore
            solve(i + 1, target - i, k, ans, ansSmall);

            // Un-choose (backtrack)
            ansSmall.remove(ansSmall.size() - 1);
        }
    }

    // Main function
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, ans, new ArrayList<>());
        return ans;
    }

    // Driver Code
    public static void main(String[] args) {

        int k = 3;
        int n = 7;

        List<List<Integer>> result = combinationSum3(k, n);

        System.out.println("Combinations of " + k +
                " numbers that sum to " + n + ":");

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

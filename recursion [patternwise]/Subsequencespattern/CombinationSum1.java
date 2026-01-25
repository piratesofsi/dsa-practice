import java.util.*;

public class CombinationSum1 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = sol.combinationSum(candidates, target);

        System.out.println("Combinations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // so why recursion ?
        // as we have choices + decisions ---> recursion
        // and we can use an element how many times we want

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        solve(0, target, ans, arr, candidates);

        return ans;
    }

    private void solve(int idx, int target,
                       List<List<Integer>> ans,
                       List<Integer> arr,
                       int[] candidates) {

        // base case
        // stop when all elements are checked
        if (idx == candidates.length) {

            if (target == 0) {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }

        // including the current element (if possible)
        if (candidates[idx] <= target) {

            arr.add(candidates[idx]);

            // stay at same index because element can be reused
            solve(idx, target - candidates[idx], ans, arr, candidates);

            // backtrack
            arr.remove(arr.size() - 1);
        }

        // excluding the current element
        solve(idx + 1, target, ans, arr, candidates);
    }
}
import java.util.*;

public class CombinationSum2 {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = sol.combinationSum2(candidates, target);

        System.out.println("Combinations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        // recursion based ----->> choices + decisions
        // sort it for lexicographical order + duplicate handling
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(target, 0, ans, new ArrayList<>(), candidates);

        return ans;
    }

    private void solve(int target,
                       int idx,
                       List<List<Integer>> ans,
                       List<Integer> arr,
                       int[] candidates) {

        // base case
        if (target == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {

            // skip duplicates at same recursion level
            if (i > idx && candidates[i] == candidates[i - 1]) continue;

            // stop if number exceeds target
            if (candidates[i] > target) break;

            arr.add(candidates[i]);

            // move to next index (each number used once)
            solve(target - candidates[i], i + 1, ans, arr, candidates);

            // backtrack
            arr.remove(arr.size() - 1);
        }
    }
}
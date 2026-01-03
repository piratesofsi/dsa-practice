import java.util.*;

public class SubsetsWithDup {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 2};
        List<List<Integer>> result = sol.subsetsWithDup(nums);

        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // important for duplicate handling
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, ans, new ArrayList<>(), nums);
        return ans;
    }

    private void solve(int idx, List<List<Integer>> ans,
                       List<Integer> arr, int[] nums) {

        // every state is a valid subset
        ans.add(new ArrayList<>(arr));

        for (int i = idx; i < nums.length; i++) {

            // skip duplicates at same recursion level
            if (i > idx && nums[i] == nums[i - 1]) continue;

            arr.add(nums[i]);
            solve(i + 1, ans, arr, nums); // move forward
            arr.remove(arr.size() - 1);   // backtrack
        }
    }
}

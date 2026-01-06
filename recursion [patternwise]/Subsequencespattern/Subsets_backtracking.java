import java.util.*;

public class Subsets_backtracking {

    public static void main(String[] args) {
        Solution sol = new Solution();

        // predefined example
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = sol.subsets(nums);
        System.out.println("All subsets:");
        System.out.println(result);
    }
}

class Solution {

    private void solve(List<List<Integer>> ans,
                       List<Integer> arr,
                       int idx,
                       int[] nums) {

        // every state is a valid subset
        ans.add(new ArrayList<>(arr));

        for (int i = idx; i < nums.length; i++) {

            // choose
            arr.add(nums[i]);

            // explore
            solve(ans, arr, i + 1, nums);

            // unchoose (backtrack)
            arr.remove(arr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), 0, nums);
        return ans;
    }
}

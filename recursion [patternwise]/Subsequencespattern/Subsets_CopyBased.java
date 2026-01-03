import java.util.*;

public class Subsets_CopyBased {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = sol.subsets(nums);
        System.out.println(result);
    }
}

class Solution {

    private void solve(List<List<Integer>> ans,
                       List<Integer> arr,
                       int i,
                       int[] nums) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        // include (copy)
        List<Integer> include = new ArrayList<>(arr);
        include.add(nums[i]);
        solve(ans, include, i + 1, nums);

        // exclude (copy)
        List<Integer> exclude = new ArrayList<>(arr);
        solve(ans, exclude, i + 1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), 0, nums);
        return ans;
    }
}

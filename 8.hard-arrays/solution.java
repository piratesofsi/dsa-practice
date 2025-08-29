import java.util.*;

public class solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0;
        int vote1 = 0, vote2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (vote1 == 0 && nums[i] != candidate2) {
                candidate1 = nums[i];
                vote1 = 1;
            } else if (vote2 == 0 && nums[i] != candidate1) {
                candidate2 = nums[i];
                vote2 = 1;
            } else if (candidate1 == nums[i]) {
                vote1++;
            } else if (candidate2 == nums[i]) {
                vote2++;
            } else {
                vote1--;
                vote2--;
            }
        }

        // Manual checking
        int count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) count1++;
            if (nums[i] == candidate2) count2++;
        }

        List<Integer> list = new ArrayList<>();
        if (count1 > nums.length / 3) list.add(candidate1);
        if (count2 > nums.length / 3 && candidate2 != candidate1) list.add(candidate2);

        Collections.sort(list);
        return list;
    }

    // Main method to run in Sublime Text
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        List<Integer> result = sol.majorityElement(nums);

        System.out.println("Majority elements (> n/3) are: " + result);
        sc.close();
    }
}

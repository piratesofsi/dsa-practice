import java.util.*;

public class Lettercombinationofaphoneno {

    // recursive helper function (STATIC)
    private static void solve(
            int index,
            List<String> ans,
            StringBuilder sb,
            String digits,
            String[] map
    ) {
        // base case
        if (sb.length() == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        // letters for current digit
        String letters = map[digits.charAt(index) - '0'];

        // try all choices
        for (char ch : letters.toCharArray()) {
            sb.append(ch);                         // choose
            solve(index + 1, ans, sb, digits, map); // explore
            sb.deleteCharAt(sb.length() - 1);      // backtrack
        }
    }

    // STATIC main logic function
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // edge case
        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(0, ans, sb, digits, map);
        return ans;
    }

    // ---------- Driver Code ----------
    public static void main(String[] args) {

        // Example 1
        String digits1 = "23";
        System.out.println("Input: " + digits1);
        System.out.println("Output: " + letterCombinations(digits1));
        System.out.println();

        // Example 2
        String digits2 = "2";
        System.out.println("Input: " + digits2);
        System.out.println("Output: " + letterCombinations(digits2));
        System.out.println();

        // Example 3
        String digits3 = "79";
        System.out.println("Input: " + digits3);
        System.out.println("Output: " + letterCombinations(digits3));
        System.out.println();

        // Example 4 (edge case)
        String digits4 = "";
        System.out.println("Input: " + digits4);
        System.out.println("Output: " + letterCombinations(digits4));
    }
}

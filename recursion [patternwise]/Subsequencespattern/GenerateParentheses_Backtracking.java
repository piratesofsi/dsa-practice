import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_Backtracking {

    // Backtracking function
    private static void solve(
            List<String> ans,
            int open,
            int close,
            StringBuilder sb,
            int n
    ) {

        // Base case: string length reached 2*n
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }

        // Choice 1: add '(' if available
        if (open > 0) {
            sb.append('(');
            solve(ans, open - 1, close, sb, n);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

        // Choice 2: add ')' only if valid
        if (open < close) {
            sb.append(')');
            solve(ans, open, close - 1, sb, n);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        solve(ans, n, n, sb, n);
        return ans;
    }

    // Example usage
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);

        System.out.println("Input: n = " + n);
        System.out.println("Valid Parentheses:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}

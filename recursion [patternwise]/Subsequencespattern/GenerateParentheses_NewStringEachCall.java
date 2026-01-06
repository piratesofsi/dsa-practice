import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_NewStringEachCall {

    // Recursive function (creates new StringBuilder each time)
    private static void solve(
            List<String> ans,
            int open,
            int close,
            StringBuilder sb
    ) {

        // Base case
        if (open == 0 && close == 0) {
            ans.add(sb.toString());
            return;
        }

        // Choice 1: add '('
        if (open > 0) {
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.append('(');
            solve(ans, open - 1, close, sb1);
        }

        // Choice 2: add ')'
        if (open < close) {
            StringBuilder sb2 = new StringBuilder(sb);
            sb2.append(')');
            solve(ans, open, close - 1, sb2);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, n, n, new StringBuilder());
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

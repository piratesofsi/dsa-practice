import java.util.*;

public class RemoveKDigits {

    // Core Logic
    public static String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            // Pop bigger digits while we can remove more
            while (!st.isEmpty()
                    && (st.peek() - '0') > (num.charAt(i) - '0')
                    && k > 0) {

                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        // If removals still left → remove from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build number from stack
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If empty → return "0"
        return sb.length() == 0 ? "0" : sb.toString();
    }

    // Driver Code
    public static void main(String[] args) {

        runTest("1432219", 3);
        runTest("10200", 1);
        runTest("10", 2);
        runTest("123456", 3);
        runTest("10001", 4);
    }

    // Helper Method
    private static void runTest(String num, int k) {

        System.out.println("Input: num = " + num + ", k = " + k);

        String result = removeKdigits(num, k);

        System.out.println("Output: " + result);
        System.out.println("--------------------------------");
    }
}

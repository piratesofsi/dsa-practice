import java.util.*;

public class NextSmallerOptimized {

    // ---- OPTIMIZED FUNCTION ----
    static ArrayList<Integer> nextSmallerEle(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }

            st.push(arr[i]);
        }

        // reverse because we filled from right to left
        Collections.reverse(ans);

        return ans;
    }

    // ---- HELPER ----
    static void print(ArrayList<Integer> list) {
        System.out.println(list);
    }

    // ---- TEST DRIVER ----
    public static void main(String[] args) {

        int[] arr1 = {4, 8, 5, 2, 25};
        System.out.println("Test Case 1:");
        print(nextSmallerEle(arr1));

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Test Case 2:");
        print(nextSmallerEle(arr2));

        int[] arr3 = {5, 5, 5, 5};
        System.out.println("Test Case 3:");
        print(nextSmallerEle(arr3));

        int[] arr4 = {10, 9, 8, 7};
        System.out.println("Test Case 4:");
        print(nextSmallerEle(arr4));
    }
}

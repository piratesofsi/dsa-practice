import java.util.Stack;

 public class SortStack {

    private static void insertSorted(Stack<Integer> st, int num) {
        // base case
        if(st.isEmpty() || st.peek() <= num) {
            st.push(num);
            return;
        }

        // remove upper element after saving
        int n = st.pop();

        // recurse
        insertSorted(st, num);

        // while backtracking add removed element
        st.push(n);
    }

    public static void sortStack(Stack<Integer> st) {
        // base case
        if(st.isEmpty()) {
            return;
        }

        // remove element after saving
        int num = st.pop();

        // recurse
        sortStack(st);

        // while backtracking insert in sorted order
        insertSorted(st, num);
    }

    // main function for testing sort stack
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original Stack: " + st);

        sortStack(st);

        System.out.println("Sorted Stack: " + st);
    }
}

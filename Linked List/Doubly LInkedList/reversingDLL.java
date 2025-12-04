import java.util.*;

public class reversingDLL {

    // Node of Doubly Linked List
    static class ListNode {
        public int data;
        public ListNode next;
        public ListNode prev;

        ListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        // (Optional) second constructor, fixed
        ListNode(int data1, ListNode next1, ListNode prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }
    }

    // converting arr --> DLL
    static ListNode convertDLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            node.prev = temp;
            temp.next = node;
            temp = temp.next;
        }
        return head;
    }

    // reverse DLL by using stack (reversing data only)
    static ListNode reverse(ListNode head) {
        if (head == null) return null;

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        // push all data into stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // put back from stack (reversed order)
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    // print all nodes of DLL
    static void printAll(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        System.out.println("before reversing : ");
        ListNode result = convertDLL(arr);
        printAll(result);

        System.out.println("after reversing : ");
        ListNode result2 = reverse(result);
        printAll(result2);
    }
}

// File: DeleteMiddle_Count.java
// Run: javac DeleteMiddle_Count.java && java DeleteMiddle_Count

public class DeleteMiddleNodebrute {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Build LL from array (helper)
    public static ListNode fromArray(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Print LL (helper)
    public static void printList(ListNode head) {
        ListNode temp = head;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    // -------------------- COUNTING APPROACH --------------------
    // Step 1: Count nodes
    // Step 2: Move to node before middle
    // Step 3: Delete middle
    public static ListNode deleteMiddle(ListNode head) {

        // if LL has 0 or 1 nodes → deleting middle gives null
        if (head == null || head.next == null) return null;

        int count = 0;
        ListNode temp = head;

        // count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // move to the node just before the middle node
        temp = head;
        ListNode prev = null;
        for (int i = 0; i < count / 2; i++) {
            prev = temp;
            temp = temp.next;
        }

        // delete the middle
        prev.next = temp.next;
        temp.next = null;

        return head;
    }

    // Main (local testing)
    public static void main(String[] args) {
        ListNode head = fromArray(new int[]{1, 3, 4, 7, 1, 2, 6});
        System.out.print("Original: ");
        printList(head);

        head = deleteMiddle(head);

        System.out.print("After deleting middle: ");
        printList(head);
    }
}

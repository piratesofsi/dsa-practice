// File: DeleteMiddle_Optimal.java
// Run: javac DeleteMiddle_Optimal.java && java DeleteMiddle_Optimal

public class DeleteMiddleNodeOptimal {

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
        System.out.print("[ ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    // -------------------- OPTIMAL APPROACH --------------------
    // Use fast & slow pointers:
    // fast → moves 2 steps
    // slow → moves 1 step
    // prev → node before slow
    public static ListNode deleteMiddle(ListNode head) {

        // if LL has 0 or 1 nodes → deleting middle gives null
        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        // move slow to middle, fast to end
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is at middle → delete it
        prev.next = slow.next;
        slow.next = null;

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

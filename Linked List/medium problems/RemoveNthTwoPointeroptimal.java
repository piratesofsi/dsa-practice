class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthTwoPointeroptimal {

    // Convert array to linked list
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Optimal: remove Nth from end using two pointers
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // if deleting head
        if (fast == null) {
            return head.next;
        }

        ListNode slow = head;

        // move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // delete node
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        ListNode head = buildList(arr);

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("\nAfter Removing 2nd From End:");
        printList(head);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthBrute {

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

    // Brute-force: remove Nth from end
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // count total length
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // node to delete (1-based)
        int del = count - n + 1;

        // if head is to be deleted
        if (del == 1) {
            return head.next;
        }

        // move to previous node
        ListNode curr = head;
        for (int i = 1; i < del - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next; // delete

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

// Rotate Linked List Right - Full Working Code

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateLL {

    // Convert array to linked list
    static ListNode convertArrayToLL(int[] arr) {
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
    static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Helper function to find nth node
    static ListNode findNthNode(ListNode head, int distance) {
        ListNode temp = head;
        while (distance > 0) {
            temp = temp.next;
            distance--;
        }
        return temp;
    }

    // Rotate list to the right by k places
    static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // Find length and last node
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // Make list circular
        temp.next = head;

        // Optimize k
        k = k % len;

        // Find new tail
        int distance = len - k - 1;
        ListNode nthNode = findNthNode(head, distance);

        // Break the cycle
        head = nthNode.next;
        nthNode.next = null;

        return head;
    }

    // Main function
    public static void main(String[] args) {

        // Predefined array
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        // Convert array to linked list
        ListNode head = convertArrayToLL(arr);

        System.out.println("Original Linked List:");
        printLL(head);

        // Rotate the list
        head = rotateRight(head, k);

        System.out.println("After Rotating Right by " + k + " places:");
        printLL(head);
    }
}

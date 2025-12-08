
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class sortLLoptimal {

    // ---------------- MERGE SORT FOR LINKED LIST -----------------
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private static ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // ---------------- UTIL FUNCTIONS -----------------

    static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // ---------------- MAIN -----------------

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 }; // <<< DIRECT ARRAY INPUT

        ListNode head = arrayToList(arr);

        System.out.println("Original Linked List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted Linked List:");
        printList(head);
    }
}

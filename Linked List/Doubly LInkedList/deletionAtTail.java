
public class deletionAtTail {
    // basic structure
    static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val1, ListNode next1, ListNode prev1) {
            this.val = val1;
            this.next = next1;
            this.prev = prev1;

        }

        ListNode(int val1) {
            this.val = val1;
            this.next = null;
            this.prev = null;
        }

    };

    static ListNode convListNode(int arr[]) {
        if (arr.length == 0) {
            return null;
        }
        ListNode a = new ListNode(arr[0]);
        ListNode head = a;
        ListNode temp = a;
        for (int i = 1; i < arr.length; i++) {
            ListNode b = new ListNode(arr[i]);
            temp.next = b;
            b.prev = temp;
            temp = temp.next;

        }
        return head;
    }

    static void printNode(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    static ListNode deleteAtTAListNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head.next = null;
            head.prev = null;
            return null;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        ListNode previous = temp.prev;
        previous.next = null;
        temp.prev = null;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println("before deletion : ");
        ListNode result = convListNode(arr);
        printNode(result);
        System.out.println();
        System.out.println("after deletion : ");
        ListNode result2 = deleteAtTAListNode(result);
        printNode(result2);
        System.out.println();
        System.out.println("again deletion : ");
        ListNode result3 = deleteAtTAListNode(result2);
        printNode(result3);

    }
}

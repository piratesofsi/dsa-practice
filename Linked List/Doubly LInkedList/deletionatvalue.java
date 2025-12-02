public class deletionatvalue {

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

    // converting arr--> DLL
    static ListNode converListNode(int arr[]) {
        ListNode a = new ListNode(arr[0]);
        ListNode temp = a;
        for (int i = 1; i < arr.length; i++) {
            ListNode b = new ListNode(arr[i]);
            b.prev = temp;
            temp.next = b;
            temp = temp.next;

        }
        return a;
    }

    // deletionatTail
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

    // deletion at a give value (so you've provided that node )
    static void deleteAtValue(ListNode curr) {
        ListNode before = curr.prev;
        ListNode after = curr.next;
        if (after == null) {
            before.next = null;
            curr.prev = null;
            return;
        }
        before.next = after;
        after.prev = before;
        curr.next = null;
        curr.prev = null;

    }

    static void printAll(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println("before deletion : ");
        ListNode result = converListNode(arr);
        printAll(result);
        System.out.println();
        System.out.println("after deletion : ");
        deleteAtValue(result.next);
        printAll(result);
    }
}

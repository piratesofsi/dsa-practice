public class insertionatvalue {

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

    static ListNode inserrtionAtTAListNodebefore(ListNode head, int insert) {

        ListNode a = new ListNode(insert);
        if (head == null) {
            return a;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode before = temp.prev; // edge case if there is 1 node
        if (before == null) {
            a.next = temp;
            temp.prev = a;
            head = head.prev;
            return head;
        }

        before.next = a;
        temp.prev = a;
        a.prev = before;
        a.next = temp;

        return head;
    }

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

    // deletion at a give value (so you've provided that node )
    static void insertionAtValue(ListNode curr,int insert) {
        // find both the before and after
        ListNode before = curr.prev;
        ListNode after = curr.next;
        if (after == null) {
            ListNode a=new ListNode(insert);
            before.next=a;
            curr.prev=a;
            a.prev=before;
            a.next=curr;
            return;
        }
        else {
            ListNode a=new ListNode(insert);
            before.next=a;
            curr.prev=a;
            a.prev=before;
            a.next=curr;

        }


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
        insertionAtValue(result.next.next.next.next,7);
        printAll(result);
    }
}

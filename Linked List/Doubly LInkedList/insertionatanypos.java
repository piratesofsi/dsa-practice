public class insertionatanypos {
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

    static ListNode insertionAtheaNode(ListNode head, int insert) {

        ListNode a = new ListNode(insert);
        if (head == null) {
            return a;
        }
        ListNode temp = head;
        temp.prev = a;
        a.next = temp;
        head = temp.prev;

        return head;
    }

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

    static ListNode insertionAtAnyPOsListNode(ListNode head, int pos, int insert) {

        // first find the node
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == pos)
                break;
            temp = temp.next;
        }

        // get before and after by using temp
        ListNode before = temp.prev;
        ListNode after = temp.next;
        if (before == null && after == null) {
            ListNode head2 = insertionAtheaNode(head, insert);
            return head2;
        } else if (before == null) {
            ListNode head2 = insertionAtheaNode(head, insert);
            return head2;
        } else if (after == null) {
            ListNode head2 = inserrtionAtTAListNodebefore(head, insert);
            return head2;
        }
        else{
            ListNode a=new ListNode(insert);
            before.next=a;
            temp.prev=a;
            a.prev=before;
            a.next=temp;
           
        }
        return head;

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
        ListNode result2 = insertionAtAnyPOsListNode(result,2, 2);
        printAll(result2);
    }
}

public class middleofLLfastandslow {

    // basic structure
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val1, ListNode next1) {
            this.val = val1;
            this.next = next1;
        }

        ListNode(int val1) {
            this.val = val1;
            this.next = null;
        }
    };

    static ListNode converListNode(int arr[]) {
        ListNode a = new ListNode(arr[0]);
        ListNode temp = a;
        for (int i = 1; i < arr.length; i++) {
            ListNode b = new ListNode(arr[i]);
            temp.next = b;
            temp = temp.next;

        }
        return a;
    }

    static void PrintNode(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    static ListNode tortoisehare(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        // intialize the fast and slow
        ListNode fast = head;
        ListNode slow = head;
        // fast moves double of slow
        // slow moves only one step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ListNode head2 = converListNode(arr);
        PrintNode(head2);
        System.out.println();
        System.out.println("the middle of node is : ");
        ListNode head3 = tortoisehare(head2);
        System.out.print(" " + head3.val);

    }
}

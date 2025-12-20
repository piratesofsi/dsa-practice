public class ReverseLinkedListInKGroup_Custom {

    // ---------- Definition ----------
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // ---------- YOUR REVERSE FUNCTION ----------
    private static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;   // store next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        }
        return prev; // new head after reverse
    }

    // ---------- YOUR KTH NODE FUNCTION ----------
    private static ListNode FindKthNode(ListNode head, int k) {
        ListNode temp = head;
        k--; // already at first node

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    // ---------- YOUR REVERSE K GROUP ----------
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        ListNode previousNode = null;
        ListNode nextNode = null;

        while (temp != null) {

            ListNode kthNode = FindKthNode(temp, k);

            // if less than k nodes remain
            if (kthNode == null) {
                if (previousNode != null) {
                    previousNode.next = temp;
                }
                break;
            }

            // save next group start
            nextNode = kthNode.next;

            // detach current group
            kthNode.next = null;

            // reverse current group
            reverse(temp);

            // first group
            if (temp == head) {
                head = kthNode;
            } else {
                previousNode.next = kthNode;
            }

            // temp becomes tail after reverse
            previousNode = temp;

            // move to next group
            temp = nextNode;
        }

        return head;
    }

    // ---------- UTILITIES ----------
    private static ListNode buildList() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        return n1;
    }

    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        ListNode head = buildList();

        System.out.println("Original List:");
        printList(head);

        int k = 3;
        head = reverseKGroup(head, k);

        System.out.println("Reversed in groups of " + k + ":");
        printList(head);
    }
}

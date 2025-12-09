

// basic structure
class ListNode {
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

    ListNode() {}
}

public class SegregateOddEvenNodesLLOptimal  {

    // Optimal O(1) odd-even using pointers
    static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;  // <-- stored to connect later

        while (even != null && even.next != null) {
            odd.next = odd.next.next;   // link next odd
            even.next = even.next.next; // link next even

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // attach even list at end
        return head;
    }

    // Convert array → LinkedList
    static ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = arrayToList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = oddEvenList(head);

        System.out.print("After Optimal Odd-Even: ");
        printList(head);
    }
}

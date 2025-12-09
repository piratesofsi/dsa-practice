import java.util.*;

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

public class SegregateOddEvenNodesLLBrute {

    // Brute odd-even linked list using ArrayList
    static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        List<Integer> list = new ArrayList<>();

        // store odd nodes
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = (temp.next != null) ? temp.next.next : null;
        }

        // store even nodes
        temp = head.next;
        while (temp != null) {
            list.add(temp.val);
            temp = (temp.next != null) ? temp.next.next : null;
        }

        // rewrite values back to list
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

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

        System.out.print("After Brute Odd-Even: ");
        printList(head);
    }
}

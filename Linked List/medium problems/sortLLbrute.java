import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class sortLLbrute {

    // ---------------- BRUTE FORCE SORT -----------------
    public static ListNode sortListBrute(ListNode head) {
        if(head == null || head.next == null) return head;

        // Step 1: Store all values in ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Sort the values
        Collections.sort(list);

        // Step 3: Put sorted values back into linked list
        temp = head;
        for(int num : list) {
            temp.val = num;
            temp = temp.next;
        }

        return head; // sorted linked list
    }

    // ---------------- UTIL FUNCTIONS -----------------

    static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // ---------------- MAIN -----------------

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};   // <<< DIRECT ARRAY INPUT

        ListNode head = arrayToList(arr);

        System.out.println("Original Linked List:");
        printList(head);

        head = sortListBrute(head);   // call brute method

        System.out.println("Sorted Linked List (Brute):");
        printList(head);
    }
}

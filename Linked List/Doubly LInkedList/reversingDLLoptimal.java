import java.util.*;

public class reversingDLLoptimal {

    // Node of Doubly Linked List
    static class ListNode {
        public int data;
        public ListNode next;
        public ListNode prev;

        ListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        // (Optional) second constructor, fixed
        ListNode(int data1, ListNode next1, ListNode prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }
    }

    // converting arr --> DLL
    static ListNode convertDLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            node.prev = temp;
            temp.next = node;
            temp = temp.next;
        }
        return head;
    }

    // reverse DLL by using stack (reversing data only)
    static ListNode reverseInPlace(ListNode head) {
        if (head == null || head.next==null) return head;

        ListNode curr=head;
        ListNode last=null;
        while(curr!=null){
            last=curr.prev;
            curr.prev=curr.next;
            curr.next=last;
            curr=curr.prev;
        }
        return last.prev;


        
    }

    // print all nodes of DLL
    static void printAll(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        System.out.println("before reversing : ");
        ListNode result = convertDLL(arr);
        printAll(result);

        System.out.println("after reversing : ");
        ListNode result2 = reverseInPlace(result);
        printAll(result2);
    }
}

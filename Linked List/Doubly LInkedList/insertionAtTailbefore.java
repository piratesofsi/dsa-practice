public class insertionAtTailbefore {
    // basic structure
    static class ListNode {
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val1, ListNode prev1, ListNode next1) {
            this.val = val1;
            this.prev = prev1;
            this.next = next1;

        }

        ListNode(int val1) {
            this.val = val1;
            this.prev = null;
            this.next = null;
        }
    };

    static ListNode convevListNode(int arr[]) {
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

    static void printAll(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    static ListNode inserrtionAtTAListNodebefore(ListNode head, int insert) {

        ListNode a = new ListNode(insert);
        if (head == null) {
            return a;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

      
        ListNode before=temp.prev;  // edge case if there is 1 node 
        if(before==null){
            a.next=temp;
            temp.prev=a;
            head=head.prev;
            return head;
        }

        before.next=a;
        temp.prev=a;
        a.prev=before;
        a.next=temp;

        


        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 5 };
        System.out.println("before deletion : ");
        ListNode result = convevListNode(arr);
        printAll(result);
        System.out.println();
        System.out.println("after deletion : ");
        ListNode result2 = inserrtionAtTAListNodebefore(result, 6);
        printAll(result2);

    }
}

public class deletionatanypos {
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

    // deletionATHead
     static ListNode deleteNodeAtHead(ListNode head){
        if(head==null ){
            return null;
        }
        if(head.next==null){
            head.next=null;
            head.prev=null;
            return null;
        }
        ListNode temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null;
      return head;
        
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

    static ListNode deletionatanypNode(ListNode head, int pos) {
        if (head == null ) {
            return null;
        }
         
            // get the pos
            int count=0;
            ListNode temp=head;
            while(temp!=null){
                count++;
                if(count==pos)
                    break;
                temp=temp.next;
            }

            // get prev and after from the temp(current)

            ListNode before=temp.prev;
            ListNode after=temp.next;

            // if both reference nodes are null means --> single linkedlist 
            // delete it and return null 
            if(before==null && after==null){
                return null;
            }
            // after is null means it the last element means the tail delete 
            // it by using the deletetail 
            else if(after==null){
                ListNode head2=deleteAtTAListNode(head);
                return head2;

            }
            // before is null means it is the first element (head ) so delete it and 
            // by using the deleteAtHead
            else if(before==null){
                ListNode head2=deleteNodeAtHead(head);
                return head2;
            }
            

            // if both are there means middle 
            before.next=after;
            after.prev=before;
            temp.next=null;
            temp.prev=null;

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
        ListNode result2 = deletionatanypNode(result,2);
        printAll(result2);

    }
}

public class middleofLL {

    // basic structure 
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val1,ListNode next1){
            this.val=val1;
            this.next=next1;
        }
        ListNode(int val1){
            this.val=val1;
            this.next=null;
        }
    };

    static ListNode converListNode(int arr[]){
        ListNode a=new ListNode(arr[0]);
        ListNode temp=a;
        for(int i=1;i<arr.length;i++){
            ListNode b=new ListNode(arr[i]);
            temp.next=b;
            temp=temp.next;

        }
        return a;
    }

    static void PrintNode(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
    }

    static ListNode FindMiddle(ListNode head){
        // step 1 
        // find the total nodes 
        ListNode temp=head;
        // traverse over the LL and find the total nodes 
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        // now go to the count/2 that's the middle 
        temp=head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
            
        }
        return temp;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        ListNode head2=converListNode(arr);
        PrintNode(head2);
        System.out.println();
        System.out.println("the middle of node is : ");
        ListNode head3=FindMiddle(head2);
        System.out.print(" "+head3.val);
        
    }
}

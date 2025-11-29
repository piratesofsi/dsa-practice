

public class implementation {

    // basic structure
    static class ListNode {
        int val;
        ListNode next;
        ListNode prev;
         ListNode(int val1,ListNode next1,ListNode prev1 ){
            this.val=val1;
            this.next=next1;
            this.prev=prev1;
         }

         ListNode(int val1){
            this.val=val1;
            this.next=null;
            this.prev=null;
         }
    };

    // converting array to Doubly LL 

    static ListNode converListNode(int arr[]){
        if(arr.length==0)
             return null;
        ListNode a=new ListNode(arr[0]);
        ListNode head=a;
        ListNode temp=a;
          for(int i=1;i<arr.length;i++){
            ListNode b=new ListNode(arr[i]);
             temp.next=b;
             b.prev=temp;
             temp=temp.next;
          }
          return head;
    }

    static void printNode(ListNode head){
          ListNode temp=head;
          while(temp!=null){
            System.out.print(" "+temp.val);
            temp=temp.next;
          }
    }



    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("converting arr to Doubly linkedlist : ");
        ListNode result=converListNode(arr);
        printNode(result);
    }
}

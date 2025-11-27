public class insertionattail {
    


    //basic structure 
    static class LinkNode{
        int val;
        LinkNode next;

        LinkNode(int val1,LinkNode next1){
            this.val=val1;
            this.next=next1;
        }
        LinkNode(int val1){
            this.val=val1;
            this.next=null;
        }
    };

    // convert arr to LL 
    static LinkNode convLinkNode(int arr[]){
        LinkNode a=new LinkNode(arr[0]);
        LinkNode temp=a;
        for(int i=1;i<arr.length;i++){
            LinkNode b=new LinkNode(arr[i]);
            temp.next=b;
            temp=temp.next;
            

        }
        return a;
    }


    // printll
    static void printAll(LinkNode head){
        LinkNode temp=head;
        while(temp!=null){
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
    }

    //Insertion at tail 
    static LinkNode insertlinkNodeAtTail(LinkNode head,int insert){
        
        LinkNode temp=new LinkNode(insert);
        if(head==null){
            return temp;
        }
        LinkNode currentnNode=head;
         //traverse it to the very end 
         while(currentnNode.next!=null){
             currentnNode=currentnNode.next;
         }
         currentnNode.next=temp;
         return head;
    }
    public static void main(String[] args) {
         int arr[] = { 5, 4, 3, 2, 1 };

         System.out.println("before inserting : ");
       LinkNode head=  convLinkNode(arr);
       printAll(head);
       System.out.println();
       System.out.println("after inserting at the tail : ");
    LinkNode head2=  insertlinkNodeAtTail(head,9);
    head2=insertlinkNodeAtTail(head2, 0);
    printAll(head2);


    }
}

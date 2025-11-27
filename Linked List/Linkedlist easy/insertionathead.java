public class insertionathead {
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

    //Insertion at head 
    static LinkNode insertlinkNodeAtHead(LinkNode head,int insert){
      
        LinkNode temp=new LinkNode(insert);
        temp.next=head;
        return temp;
    }
    public static void main(String[] args) {
         int arr[] = { 5, 4, 3, 2, 1 };

         System.out.println("before inserting : ");
       LinkNode head=  convLinkNode(arr);
       printAll(head);
       System.out.println();
       System.out.println("after inserting at the head : ");
    LinkNode head2=   insertlinkNodeAtHead(head,9);
    head2=insertlinkNodeAtHead(head2, 0);
    printAll(head2);


    }
}

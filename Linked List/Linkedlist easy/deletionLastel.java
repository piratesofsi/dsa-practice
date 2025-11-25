public class deletionLastel {

    //basic structure 
    static class Node {
        int data;
        Node head;

        Node(int data1,Node head1){
            this.data=data1;
            this.head=head1;
        }

        Node(int data1){
            this.data=data1;
            this.head=null;
        }
    };

    static Node converNodetNode(int arr[]){
        Node a=new Node(arr[0]);
        Node temp=a;
       for(int i=1;i<arr.length;i++){
         Node b=new Node(arr[i]);
         temp.head=b;
         temp=temp.head;
       }
       return a;
    }


    static Node deleleLastNode(Node head){
        Node temp=head;
        //if LL is empty 
        if(head==null)
            return null;
        //if LL has only one node 
        if(head.head==null)
            return null;

          while(temp.head!=null){
            if(temp.head.head==null){
                temp.head=null;
                break;
            }
            temp=temp.head;
          }
          return head;
    }

    static  void printNode(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.head;
        }
    }





    public static void main(String[] args) {
         int arr[] = { 5, 4, 3, 2, 1 };
         Node head=converNodetNode(arr);
         System.out.println("before deletion : ");
         printNode(head);
         System.out.println();
         System.out.println("after deletion of last node : ");
         Node head2=deleleLastNode(head);
         printNode(head2);

    }
}

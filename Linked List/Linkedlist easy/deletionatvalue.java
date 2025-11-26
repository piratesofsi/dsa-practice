public class deletionatvalue {

    // basic structure
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;

        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    // converting arr to LL
    static Node convertArrLL(int arr[]) {
        // creating the first node
        Node a = new Node(arr[0]);
        Node temp = a;
        for (int i = 1; i < arr.length; i++) {
            Node b = new Node(arr[i]);
            temp.next = b;
            temp = b;
        }
        return a;
    }

    // printing
    static void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    //deleting from any postion 
    static Node deleteatValuNode(Node head,int el){
        if(head==null)
            return null;

        if(head.data==el){
            head=head.next;
            return head;
        }

        Node temp=head;
        
      
        Node prev=null;
        while(temp!=null){
          
            if(temp.data==el){
                prev.next=prev.next.next;
                temp.next=null;
            }

            //if not found keep moving 
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
             int arr[] = { 5, 4, 3, 2, 1 };
             Node head=convertArrLL(arr);
             int k=5;
             System.out.println("deletion at "+k+": ");
            Node head2= deleteatValuNode(head, k);
             printAll(head2);
    }
}

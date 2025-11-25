public class deletionatposititon {

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
    static Node deleteFromAnyPos(Node head,int k){
        if(head==null)
            return null;

        if(k==1){
            head=head.next;
            return head;
        }

        Node temp=head;
        
        int count=0;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
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
             int k=2;
             System.out.println("deletion at "+k+": ");
            Node head2= deleteFromAnyPos(head, k);
             printAll(head2);
    }
}

public class deletionhead {
    // basic structure of LL
    static class Node {
        int data;
        Node head;

        Node(int data1, Node next1) {
            this.data = data1;
            this.head = next1;

        }

        Node(int data1) {
            this.data = data1;
            this.head = null;
        }
    };

    // converting arr to LL
    static Node converNodeToArr(int arr[]) {
        Node a = new Node(arr[0]);
        Node temp = a;
        for (int i = 1; i < arr.length; i++) {
            Node b = new Node(arr[i]);
            temp.head = b;
            temp = temp.head;
        }
        return a;
    }

    // deletion from head
    static Node deletionOfHead(Node head) {
        head = head.head;

        return head;
    }

    // printing
    static void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.head;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        Node head = converNodeToArr(arr);
        System.out.println("before deletion :  ");
        printAll(head);
        System.out.println();
        System.out.println("after deletion : ");
        Node head1 = deletionOfHead(head);
        printAll(head1);
        System.out.println();
        System.out.println("deleting again : ");
        Node head2=deletionOfHead(head1);
        printAll(head2);


    }
}

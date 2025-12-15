

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class add1noinLLrecursive {

    // Recursive helper function
    private static int helperfunction(Node temp) {
        // base case
        if (temp == null) {
            return 1; // initial carry = 1 (add one)
        }

        int carry = helperfunction(temp.next);
        temp.data = temp.data + carry;

        if (temp.data < 10) {
            return 0; // no carry
        }

        temp.data = 0;
        return 1; // carry forward
    }

    // Add one to linked list
    public static Node addOne(Node head) {
        int carry = helperfunction(head);

        if (carry == 1) {
            Node newHead = new Node(1);
            newHead.next = head;
            head = newHead;
        }

        return head;
    }

    // Convert array to linked list
    public static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {9, 9, 9, 9};

        Node head = convert(arr);

        System.out.print("Before adding 1: ");
        printList(head);

        head = addOne(head);

        System.out.print("After adding 1:  ");
        printList(head);
    }
}

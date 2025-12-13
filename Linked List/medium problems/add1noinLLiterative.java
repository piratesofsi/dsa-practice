

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class add1noinLLiterative {

    // Reverse a linked list
    private static Node reverseNode(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextone = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextone;
        }
        return prev;
    }

    // Add one to number represented by linked list
    public static Node addOne(Node head) {

        // Step 1: reverse
        Node head2 = reverseNode(head);
        Node temp = head2;

        int carry = 1;

        // Step 2: add carry
        while (temp != null) {
            temp.data += carry;

            if (temp.data < 10) {
                carry = 0;
                break;
            } else {
                temp.data = 0;
                carry = 1;
                temp = temp.next;
            }
        }

        // Step 3: if carry left, add new node
        if (carry == 1) {
            Node a = new Node(1);
          Node head3=reverseNode(head2);
            a.next = head3;
            head3 = a;
            return head3;
        }

        // Step 4: reverse back
        return reverseNode(head2);
    }

    // Convert array to linked list
    private static Node arrayToList(int[] arr) {
        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Print linked list
    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {9, 9, 9, 9, 9};

        Node head = arrayToList(arr);

        System.out.print("Original Number: ");
        printList(head);

        head = addOne(head);

        System.out.print("After Adding One: ");
        printList(head);
    }
}

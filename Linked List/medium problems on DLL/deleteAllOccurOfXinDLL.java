// Doubly Linked List implementation
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class deleteAllOccurOfXinDLL {

    // 🔹 Convert array to Doubly Linked List
    static Node convertToDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }

        return head;
    }

    // 🔹 Print Doubly Linked List
    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 🔹 Your solution logic
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;

        while (temp != null) {

            if (temp.data == x) {

                // if head node is to be deleted
                if (temp == head) {
                    head = head.next;
                }

                Node prevNode = temp.prev;
                Node nextNode = temp.next;

                if (prevNode != null) {
                    prevNode.next = nextNode;
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                temp = nextNode;
            } 
            else {
                temp = temp.next;
            }
        }

        return head;
    }

    // 🔹 Main function
    public static void main(String[] args) {

        // predefined array
        int[] arr = {2, 2, 10, 8, 4, 2, 5, 2};

        int x = 2;

        Node head = convertToDLL(arr);

        System.out.print("Original DLL: ");
        printDLL(head);

        head = deleteAllOccurOfX(head, x);

        System.out.print("After deleting " + x + ": ");
        printDLL(head);
    }
}

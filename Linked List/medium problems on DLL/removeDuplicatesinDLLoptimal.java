class Node {
    int data;
    Node next, prev;

    Node(int x) {
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}

public class removeDuplicatesinDLLoptimal {

    // Convert array to Doubly Linked List
    static Node convertArrayToDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    // Remove duplicates from sorted DLL
    static Node removeDuplicates(Node head) {
        if(head==null){
            return null;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {

            Node nextNode = temp.next;

            // Skip all duplicate nodes
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }

            // Link to next distinct node
            temp.next = nextNode;

            if (nextNode != null) {
                nextNode.prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }

    // Print Doubly Linked List (forward)
    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2};

        // Convert array to DLL
        Node head = convertArrayToDLL(arr);

        System.out.print("Original DLL: ");
        printDLL(head);

        // Remove duplicates
        head = removeDuplicates(head);

        System.out.print("After removing duplicates: ");
        printDLL(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class CycleLengthFloydoptimal {

    // Convert array to Linked List
    public static Node buildList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Print linked list, but avoid infinite loop
    public static void printList(Node head) {
        Node curr = head;
        int count = 0;

        while (curr != null && count < 20) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
            count++;
        }
        System.out.println("...");
    }

    // Create a loop in the linked list at position pos (1-based)
    public static void createLoop(Node head, int pos) {
        if (pos == 0) return;

        Node loopNode = null;
        Node curr = head;
        int count = 1;

        while (curr.next != null) {
            if (count == pos) {
                loopNode = curr;
            }
            curr = curr.next;
            count++;
        }
        curr.next = loopNode;
    }

    // Floyd’s Cycle Length Calculation
    public static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int count = 1;
                fast = fast.next;

                while (fast != slow) {
                    count++;
                    fast = fast.next;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Node head = buildList(arr);

        // create loop: last node connects to node 3
        createLoop(head, 3);

        System.out.println("Length of loop (Floyd): " + lengthOfLoop(head));
    }
}

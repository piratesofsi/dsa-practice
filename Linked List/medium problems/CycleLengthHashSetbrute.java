import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class CycleLengthHashSetbrute {

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

    // Print Linked List (stops if loop detected)
    public static void printList(Node head) {
        Node curr = head;
        int count = 0;

        while (curr != null && count < 20) { // limit printing to avoid infinite loop
            System.out.print(curr.data + " -> ");
            curr = curr.next;
            count++;
        }
        System.out.println("...");
    }

    // Create loop at position pos (1-based index)
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
        curr.next = loopNode; // last node points to loopNode
    }

    // Detect loop length using HashSet
    public static int lengthOfLoop(Node head) {
        HashSet<Node> visited = new HashSet<>();
        Node curr = head;

        while (curr != null) {
            if (visited.contains(curr)) {
                Node temp = curr.next;
                int count = 1;

                while (temp != curr) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }

            visited.add(curr);
            curr = curr.next;
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Node head = buildList(arr);

        // create a loop: last node points to node at position 3 (node with value 3)
        createLoop(head, 3);

        System.out.println("Length of loop (HashSet): " + lengthOfLoop(head));
    }
}

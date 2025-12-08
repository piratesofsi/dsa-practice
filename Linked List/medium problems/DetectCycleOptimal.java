public class DetectCycleOptimal {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }

    // Convert array to Linked List
    static Node convertArrLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    // Print Linked List (NOTE: infinite if loop exists)
    static void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Detect only if cycle exists using Floyd (Tortoise & Hare)
    static boolean hasCycle(Node head) {

        if (head == null || head.next == null) return false;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // loop detected
            }
        }
        return false;                  // no loop
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};
        Node head = convertArrLL(arr);

        // Manually create a loop for testing
        head.next.next.next.next = head.next; // loop exists

        boolean loop = hasCycle(head);

        if (loop)
            System.out.println("Loop detected");
        else
            System.out.println("No loop detected");
    }
}

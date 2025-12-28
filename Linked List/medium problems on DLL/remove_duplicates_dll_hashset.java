import java.util.HashSet;

class remove_duplicates_dll_hashset {

    // Doubly Linked List Node
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Convert array to DLL
    static Node convertArrToDLL(int[] arr) {
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

    // Remove duplicates using HashSet
    static Node removeDuplicates(Node head) {
        if (head == null) return null;

        HashSet<Integer> set = new HashSet<>();
        Node curr = head;

        while (curr != null) {
            if (set.contains(curr.data)) {
                Node prevNode = curr.prev;
                Node nextNode = curr.next;

                if (prevNode != null) prevNode.next = nextNode;
                if (nextNode != null) nextNode.prev = prevNode;
            } else {
                set.add(curr.data);
            }
            curr = curr.next;
        }
        return head;
    }

    // Print DLL
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Node head = convertArrToDLL(arr);
        System.out.print("Original DLL: ");
        printList(head);

        head = removeDuplicates(head);
        System.out.print("After Removing Duplicates: ");
        printList(head);
    }
}

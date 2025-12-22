public class FlattenRecursive {

    static class Node {
        int data;
        Node next;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    // ===== YOUR MERGE =====
    private static Node merge(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node res = dummy;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                res.child = t1;
                t1 = t1.child;
            } else {
                res.child = t2;
                t2 = t2.child;
            }
            res = res.child;
            res.next = null;
        }

        if (t1 != null) res.child = t1;
        if (t2 != null) res.child = t2;

        return dummy.child;
    }

    // ===== RECURSIVE FLATTEN =====
    public static Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mergeHead = flattenLinkedList(head.next);
        return merge(head, mergeHead);
    }

    // ===== PRINT ORIGINAL =====
    static void printOriginalList(Node head) {
        Node row = head;
        while (row != null) {
            Node col = row;
            while (col != null) {
                System.out.print(col.data + " ");
                col = col.child;
            }
            System.out.println();
            row = row.next;
        }
    }

    // ===== PRINT FLATTENED =====
    static void printFlattenedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    // ===== CREATE LIST =====
    static Node convertArrToLinkedList(int[][] arr) {
        Node head = null, prev = null;

        for (int[] row : arr) {
            Node colHead = null, colPrev = null;
            for (int val : row) {
                Node node = new Node(val);
                if (colHead == null) colHead = node;
                else colPrev.child = node;
                colPrev = node;
            }
            if (head == null) head = colHead;
            else prev.next = colHead;
            prev = colHead;
        }
        return head;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        Node head = convertArrToLinkedList(arr);

        System.out.println("Original List:");
        printOriginalList(head);

        Node flat = flattenLinkedList(head);

        System.out.println("\nFlattened List:");
        printFlattenedList(flat);
    }
}

import java.util.*;

public class FlattenBrute {

    static class Node {
        int data;
        Node next;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    // ===== BRUTE FORCE =====
    public static Node flattenLinkedList(Node head) {
        if (head == null) return null;

        List<Integer> ans = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            Node down = temp;
            while (down != null) {
                ans.add(down.data);
                down = down.child;
            }
            temp = temp.next;
        }

        Collections.sort(ans);

        Node dummy = new Node(-1);
        Node res = dummy;

        for (int val : ans) {
            res.child = new Node(val);
            res = res.child;
        }

        return dummy.child;
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

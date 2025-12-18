import java.util.*;

// Doubly Linked List Node
class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class PairSumDLL_TwoPointers {

    // Convert array to DLL
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

    // Print DLL
    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 🔹 Optimal Two Pointer Approach
    static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (head == null) return ans;

        Node left = head;
        Node right = head;

        // move right to tail
        while (right.next != null) {
            right = right.next;
        }

        while (left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {
                ans.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
                left = left.next;
                right = right.prev;
            }
            else if (sum > target) {
                right = right.prev;
            }
            else {
                left = left.next;
            }
        }
        return ans;
    }

    // Main
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 7;

        Node head = convertToDLL(arr);

        System.out.print("DLL: ");
        printDLL(head);

        ArrayList<ArrayList<Integer>> result =
                findPairsWithGivenSum(target, head);

        System.out.println("Pairs with sum " + target + ": " + result);
    }
}

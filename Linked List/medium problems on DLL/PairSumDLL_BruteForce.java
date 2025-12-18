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

public class PairSumDLL_BruteForce {

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

    // 🔹 Brute Force Approach
    static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node temp1 = head;

        while (temp1 != null) {
            Node temp2 = temp1.next;

            while (temp2 != null && temp1.data + temp2.data <= target) {
                if (temp1.data + temp2.data == target) {
                    ans.add(new ArrayList<>(Arrays.asList(temp1.data, temp2.data)));
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
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

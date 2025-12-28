class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sort012LLBrute {

    public static Node sortList(Node head) {
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;

        // Count 0s, 1s, 2s
        while (temp != null) {
            if (temp.data == 0) count0++;
            else if (temp.data == 1) count1++;
            else count2++;
            temp = temp.next;
        }

        // Rewrite data
        temp = head;
        while (count0-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }
        while (count1-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }
        while (count2-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }

        return head;
    }
}

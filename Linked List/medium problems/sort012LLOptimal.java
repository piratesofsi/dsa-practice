class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sort012LLOptimal {

    public static Node sortList(Node head) {
        Node dummy0 = new Node(-1);
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node zero = dummy0;
        Node one = dummy1;
        Node two = dummy2;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // Connect lists
        zero.next = (dummy1.next != null) ? dummy1.next : dummy2.next;
        one.next = dummy2.next;
        two.next = null;

        return dummy0.next;
    }
}

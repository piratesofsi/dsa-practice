class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneaLinkedListwithrandomandnextpointeroptimal {

    // ---------- OPTIMAL O(1) SPACE ----------
    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        Node temp = head;

        // 1️⃣ Insert copy nodes in between
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        // 2️⃣ Set random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // 3️⃣ Separate lists
        Node dummy = new Node(-1);
        Node res = dummy;
        temp = head;

        while (temp != null) {
            Node copy = temp.next;
            Node nextOriginal = copy.next;

            res.next = copy;
            res = copy;

            temp.next = nextOriginal;
            temp = nextOriginal;
        }

        return dummy.next;
    }

    // ---------- UTILITIES ----------
    public static Node buildList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // random pointers
        n1.random = n3;
        n2.random = n1;
        n3.random = n4;
        n4.random = n2;

        return n1;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int rand = (temp.random != null) ? temp.random.val : -1;
            System.out.print("(" + temp.val + ", random=" + rand + ") -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        Node head = buildList();
        System.out.println("Original:");
        printList(head);

        Node copied = copyRandomList(head);
        System.out.println("Copied (Optimal):");
        printList(copied);
    }
}

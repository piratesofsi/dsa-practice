import java.util.HashMap;

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

public class CloneaLinkedListwithrandomandnextpointerbrute {

    // ---------- BRUTE FORCE USING HASHMAP ----------
    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // 1️⃣ Copy all nodes
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // 2️⃣ Connect next & random
        temp = head;
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
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

        // random pointers (example)
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
        System.out.println("Copied (Brute):");
        printList(copied);
    }
}

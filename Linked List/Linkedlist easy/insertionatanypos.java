public class insertionatanypos {

    // basic structure
    static class LinkNode {
        int val;
        LinkNode next;

        LinkNode(int val1, LinkNode next1) {
            this.val = val1;
            this.next = next1;
        }

        LinkNode(int val1) {
            this.val = val1;
            this.next = null;
        }
    };

    // convert arr to LL
    static LinkNode convLinkNode(int arr[]) {
        LinkNode a = new LinkNode(arr[0]);
        LinkNode temp = a;
        for (int i = 1; i < arr.length; i++) {
            LinkNode b = new LinkNode(arr[i]);
            temp.next = b;
            temp = temp.next;

        }
        return a;
    }

    // printll
    static void printAll(LinkNode head) {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }

    // Insertion at any position
    static LinkNode insertlinkNodeAtAnyLinkNode(LinkNode head, int insert, int pos) {
        if (head == null) {
            LinkNode temp = new LinkNode(insert);
            return temp;
        }

        if (pos == 1) {
            LinkNode temp = new LinkNode(insert);
            temp.next = head;
            return temp;
        }
        int count = 0;
        LinkNode current = head;

        while (current != null) {
            count++;

            if (count == pos - 1) {
                LinkNode temp = new LinkNode(insert);
                temp.next = current.next;
                current.next = temp;
                break;

            }
            current = current.next;

        }
        return head;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        System.out.println("before inserting : ");
        LinkNode head = convLinkNode(arr);
        printAll(head);
        System.out.println();
        System.out.println("after inserting at the tail : ");
        LinkNode head2 = insertlinkNodeAtAnyLinkNode(head, 7, 5);

        printAll(head2);

    }
}

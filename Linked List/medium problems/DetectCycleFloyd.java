public class DetectCycleFloyd {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }

    // Convert array to Linked List
    static Node convertArrLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    // Print Linked List (NOTE: infinite if loop exists)
    static void printAll(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Approach 2: Floyd (Optimal)
    static Node detectCycle(Node head){

        if(head==null || head.next==null) return null;

        Node slow=head, fast=head;

        // Phase 1 — Detect loop
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                // Phase 2 — find loop start
                slow = head;

                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        Node head = convertArrLL(arr);

        // Manually create a loop for testing
        head.next.next.next.next = head.next; // loop starts at 4

        Node start = detectCycle(head);

        if(start!=null)
            System.out.println("Loop starts at node: " + start.data);
        else
            System.out.println("No loop detected");
    }
}

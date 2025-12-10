class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Intersection_LengthMethodBetter {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode t1 = headA, t2 = headB;

        while(t1 != null){ lenA++; t1 = t1.next; }
        while(t2 != null){ lenB++; t2 = t2.next; }

        int diff = Math.abs(lenA - lenB);

        t1 = headA; t2 = headB;

        if(lenA > lenB){
            while(diff-- > 0) t1 = t1.next;
        } else {
            while(diff-- > 0) t2 = t2.next;
        }

        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }

    public static ListNode createList(int[] arr){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int x : arr){
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void connect(ListNode A, ListNode B, int pos){
        if(pos < 0) return;
        ListNode tempA = A;
        while(pos-- > 0) tempA = tempA.next;

        ListNode tempB = B;
        while(tempB.next != null) tempB = tempB.next;

        tempB.next = tempA;
    }

    public static void main(String[] args) {

        ListNode A = createList(new int[]{1,2,3,4,5});
        ListNode B = createList(new int[]{10,20});

        connect(A, B, 3); // intersection at 4

        ListNode ans = getIntersectionNode(A, B);
        System.out.println(ans != null ? ans.val : "No Intersection");
    }
}

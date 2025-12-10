import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Intersection_HashSetBrute {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }

    // Helper to convert array to LinkedList
    public static ListNode createList(int[] arr){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int x : arr){
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Creates intersection manually for testing
    public static void connect(ListNode A, ListNode B, int pos){
        // pos = index in list A where B should connect
        if(pos < 0) return;

        ListNode tempA = A;
        while(pos-- > 0 && tempA != null) tempA = tempA.next;

        ListNode tempB = B;
        while(tempB.next != null) tempB = tempB.next;

        tempB.next = tempA;
    }

    public static void main(String[] args) {

        ListNode headA = createList(new int[]{1,2,3,4,5});
        ListNode headB = createList(new int[]{9,8});

        connect(headA, headB, 2); // intersects at value "3"

        ListNode ans = getIntersectionNode(headA, headB);
        System.out.println(ans != null ? ans.val : "No Intersection");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Intersection_TwoPointerOptimal {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode t1 = headA;
        ListNode t2 = headB;
    // we chose this condition as it is the only left conditon 
        while(t1 != t2){
            // keep moving them when reaches null switch the head 
          t1=t1.next;
          t2=t2.next;
            // if both are same then intersection is hit 
            if(t1==t2){
                return t1;
            }
         if(t1==null)
             t1=headB;

         if(t2==null)
             t2=headA;
            
        }
        // it'll return the intersected node or null 
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

        ListNode A = createList(new int[]{1,2,3,4,5,6});
        ListNode B = createList(new int[]{9,8});

        connect(A, B, 4); // intersection at 5

        ListNode ans = getIntersectionNode(A, B);
        System.out.println(ans != null ? ans.val : "No Intersection");
    }
}


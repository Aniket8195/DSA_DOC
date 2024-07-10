public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA,t2=headB;
        if(t1==null ||t2==null){
                 return null;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2){
                  return t1;
            }
            if(t1==null)t1=headB;
            if(t2==null)t2=headA;

        }
        return t1;
    }
}
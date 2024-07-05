/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode cur=head.next,prev=head,next=head.next.next;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int firstcp=-1;
        int lastcp=-1;
        int i=1;
        while(next!=null){
         if((prev.val < cur.val && next.val<cur.val)||(prev.val>cur.val && next.val>cur.val)){
                  if(firstcp==-1){
                      firstcp=i;
                      
                  }else{
                    min=Math.min(min,i-lastcp);
                  }
                  lastcp=i;
         }
         prev=cur;
         cur=next;
         next=next.next;
         i++;
        }
         if (firstcp == -1 || firstcp == lastcp) {
            return new int[]{-1, -1};
        }
        max=Math.max(max,lastcp-firstcp);
        
        return new int[]{min,max};
    }
}

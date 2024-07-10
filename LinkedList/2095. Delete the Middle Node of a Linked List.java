class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return null;
        ListNode slow=head,fast=head,prv=null;
        while(fast!=null && fast.next!=null){
              prv=slow;
              slow=slow.next;
              fast=fast.next.next;
        }
        prv.next=prv.next.next;
        return head;
    }
}

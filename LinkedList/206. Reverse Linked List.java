#Iterative 
  class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prv=null;
        while(cur!=null){
           ListNode next=cur.next;
           cur.next=prv;
           prv=cur;
           cur=next;

        }
        return prv;
    }
}


#Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prv=null;
        return solve(head,prv);
    }
    private ListNode solve(ListNode cur,ListNode prv){
        if(cur==null)return prv;
        ListNode next=cur.next;
        cur.next=prv;
        return solve(next,cur);
    }
}

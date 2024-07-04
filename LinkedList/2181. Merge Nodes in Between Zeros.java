class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        ListNode cur=head.next;
        while(cur!=null){
             ListNode node=new ListNode(0);
             while(cur.val!=0){
                   node.val+=cur.val;
                   cur=cur.next;

             }
             tail.next=node;
             tail=tail.next;
             cur=cur.next;
        }
        return dummy.next;
         ListNode cur = head.next;
         while (cur != null && cur.next != null) {
        ListNode node = cur;
        int sum = 0;
        
        while (cur != null && cur.val != 0) {
            sum += cur.val;
            cur = cur.next;
        }
        
        node.val = sum;
        node.next = cur.next;
        
        cur = cur.next;
         }
          return head.next;
    }
}

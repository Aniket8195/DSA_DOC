class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode next=temp.next;
        if(head==null) return head;
         
        while(next!=null){
            int div=divisor(temp.val,next.val);
            temp.next=new ListNode(div);
            temp.next.next=next;
            temp=next;
            next=next.next;
        } 
        return head;

    }
    private int divisor(int a , int b){
    if (b == 0) {
        return a;
    }
    return divisor(b, a % b);
    }
}

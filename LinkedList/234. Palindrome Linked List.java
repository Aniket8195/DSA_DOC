class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode cur=head;
        while(cur!=null){
           st.push(cur.val);
           cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            if(cur.val!=st.pop()){
                    return false;
            }
            cur=cur.next;
        }
        return true;
    }
}

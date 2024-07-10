class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode cur = head;
        int count = 0;
        
        // Traverse to find the kth node
        while (cur != null && count < k) {
            cur = cur.next;
            count++;
        }
        
        // If count < k, no need to reverse, return head as is
        if (count < k) {
            return head;
        }
        
        // Reverse the first k nodes
        ListNode prev = null;
        cur = head;
        count = 0;
        while (cur != null && count < k) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        
        // Recursively reverse the remaining nodes
        if (cur != null) {
            head.next = reverseKGroup(cur, k);
        }
        
        // Return the new head of the reversed sublist
        return prev;
    }
}

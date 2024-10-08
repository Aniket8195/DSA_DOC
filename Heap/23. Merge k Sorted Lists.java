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
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(ListNode head : lists) {
            while(head != null) {
                pq.add(head.val);
                head = head.next;
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(!pq.isEmpty()) {
            int val = pq.poll();
            ListNode newNode = new ListNode(val);
            current.next = newNode;
            current = current.next;            
        }
        
        return dummy.next; 
    }
}

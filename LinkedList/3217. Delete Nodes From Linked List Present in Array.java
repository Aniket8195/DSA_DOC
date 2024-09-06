class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
             hs.add(nums[i]);
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prv=dummy;
        ListNode cur=head;
        while(cur!=null){
             if(hs.contains(cur.val)){
                prv.next=cur.next;
             }else{
                prv=cur;
             }
            cur=cur.next;
             
        }
        return dummy.next;
    }
}

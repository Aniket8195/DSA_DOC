class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    private ListNode mergeSort(ListNode head){
       if(head==null || head.next==null)return head;
       ListNode mid=findMid(head);
       ListNode left=head;
       ListNode right=mid.next;
       mid.next=null;
       left=mergeSort(left);
       right=mergeSort(right);
       ListNode res=merge(left,right);
       return res;
    }
    private ListNode findMid(ListNode head){
        ListNode slow=head,fast=head,prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
           slow=slow.next;
           fast=fast.next.next;
        }
        return prev;
    }
    private ListNode merge(ListNode left,ListNode right){
         if(left==null)return right;
         if(right==null)return left;
         ListNode head,tail;
         if(left.val<right.val){
           head=tail=left;
           left=left.next;
         }else{
              head=tail=right;
              right=right.next;
         }
         while(left!=null && right!=null){
              if(left.val<right.val){
                 tail.next=left;
                 tail=tail.next;
                 left=left.next;
              }else{
                   tail.next=right;
                   tail=tail.next;
                   right=right.next;
              }
         }
         while(left!=null){
                tail.next=left;
                 tail=tail.next;
                 left=left.next;
         }
         while(right!=null){
             tail.next=right;
                   tail=tail.next;
                   right=right.next;

         }
         return head;
    }
}

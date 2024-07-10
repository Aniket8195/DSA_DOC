class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head==null)return null;
        Node cur=head;
        while(cur!=null){
            while(cur!=null && cur.next!=null && cur.data==cur.next.data){
                if(cur.next.next==null){
                    cur.next=null;
                }else{
                    cur.next=cur.next.next;
                cur.next.prev=cur;
                }
            }
            cur=cur.next;
        }
        return head;
        
    }
}

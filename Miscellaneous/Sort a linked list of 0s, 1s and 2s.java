class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node zs=null,ze=null,os=null,oe=null,ts=null,te=null;
        Node cur=head;
        if(head==null||head.next==null)return head;
        while(cur!=null){
            if(cur.data==0){
                if(zs==null){
                    zs=ze=cur;
                }else{
                    ze.next=cur;
                    ze=ze.next;
                }
            }
            if(cur.data==1){
                 if(os==null){
                     os=oe=cur;
                 }else{
                     oe.next=cur;
                     oe=oe.next;
                 }
            }
            if(cur.data==2){
                if(ts==null){
                    ts=te=cur;
                }else{
                    te.next=cur;
                    te=te.next;
                }
            }
            
            cur=cur.next;
        }
       // If the 0s list is not empty, connect it to the 1s list (if exists), otherwise connect to the 2s list
        if (ze != null) {
            ze.next = (os != null) ? os : ts;
        }

        // If the 1s list is not empty, connect it to the 2s list
        if (oe != null) {
            oe.next = ts;
        }

        // If the 2s list exists, terminate it with null
        if (te != null) {
            te.next = null;
        }

        // Determine the new head of the sorted list
        // If 0s list exists, it will be the head, otherwise the 1s list or the 2s list
        return (zs != null) ? zs : (os != null) ? os : ts;

    }
}

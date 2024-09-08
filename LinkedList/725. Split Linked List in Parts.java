class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
         cnt++;
         temp=temp.next;
        }
        int c=cnt%k;
        ListNode ans[]=new ListNode[k];
        ListNode cur=head;
        int j=0;
        for(int i=0;i<k&&cur!=null;i++){
           if(c>0){
           ListNode res[]=split(cur,(cnt/k)+1);
           ans[j++]=res[0];
           cur=res[1];
            c--;
           }else{
           ListNode res[]=split(cur,cnt/k);
           ans[j++]=res[0];
           cur=res[1];
           }
        }
        return ans;
    }
    private ListNode[] split(ListNode head,int cnt){
          ListNode temp=head;
          ListNode prv=null;
          while(temp!=null && cnt>0){
                 prv=temp;
                 temp=temp.next;
                 cnt--;
          }
          if(prv!=null){
          prv.next=null;
           }
         return new ListNode[]{head,temp};
    }
}

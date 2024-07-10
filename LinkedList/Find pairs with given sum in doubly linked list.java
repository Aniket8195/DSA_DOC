class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(head==null)return res;
        Node left=head;
        Node right=head;
        while(right.next!=null){
            right=right.next;
        }
        while(left.data<right.data){
            if(left.data+right.data==target){
                ArrayList<Integer>ans=new ArrayList<>();
                ans.add(left.data);
                ans.add(right.data);
                res.add(ans);
                left=left.next;
                right=right.prev;
            }else if((left.data+right.data)>target){
                right=right.prev;
            }else{
                left=left.next;
            }
        }
        return res;
    }
}

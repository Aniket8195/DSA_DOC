class Solution {
    public static int floor(Node root, int x) {
        // Code here
        Node res=null;
        Node cur=root;
        while(cur!=null){
            if(cur.data==x){
                res=cur;
                break;
            }
            if(cur.data<x){
                res=cur;
                cur=cur.right;
            }else{
                cur=cur.left;
            }
        }
        if(res==null)return -1;
        return res.data;
    }
}

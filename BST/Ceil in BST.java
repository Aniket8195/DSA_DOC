class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        Node res=null;
        Node cur=root;
        while(cur!=null){
            if(cur.data==key){
                res=cur;
                break;
            }
            if(cur.data>key){
                res=cur;
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        if(res==null)return -1;
        return res.data;
    }
}

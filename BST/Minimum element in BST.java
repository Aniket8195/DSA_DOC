class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        Node cur=root;
        if(root==null)return -1;
        while(cur!=null && cur.left!=null){
            cur=cur.left;
        }
        return cur.data;
    }
}

class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        root=trim(root,low,high);
        return root;
    }
    private TreeNode trim(TreeNode root,int low,int high){
       if(root==null)return null;
        root.left=trim(root.left,low,high);
       root.right=trim(root.right,low,high);
        if (root.val < low) {
            return root.right;
        }
         if (root.val > high) {
            return root.left;
        }
        return root;
    }
}




#2nd approach 



   if(node == null)return null;

  
        node.left = trimBST(node.left, low, high);
        node.right = trimBST(node.right, low, high);

        if(node.val > high || node.val < low){
            if(node.left != null)return node.left;
            else return node.right;
        }
        else return node;

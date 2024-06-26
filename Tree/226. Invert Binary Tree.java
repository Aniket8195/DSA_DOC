class Solution {
    public TreeNode invertTree(TreeNode root) {
         solve(root);
        return root;
    }
    public static void solve(TreeNode root){
        if(root==null)return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        solve(root.left);
        solve(root.right);
    }
}

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        solve(root,target);
        if(root.val==target && root.left==null && root.right==null)return null;
        return root;
    }
    public static TreeNode solve(TreeNode root , int target){
            if(root==null) return null;
            root.left=solve(root.left,target);
            root.right=solve(root.right,target);
            if(root.left==null && root.right==null && root.val==target){
                return null;
            }
            return root;
    }
}

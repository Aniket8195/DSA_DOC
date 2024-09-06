class Solution {
   public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)return null;
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh==rh)return root;
        else if(lh>rh)return lcaDeepestLeaves(root.left);
        else return lcaDeepestLeaves(root.right);
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        return (int)Math.max(height(root.left),height(root.right))+1;
    }
}
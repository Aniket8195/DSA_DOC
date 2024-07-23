class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root);
    }
    private int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    private int dia(TreeNode root){
      if(root==null)return 0;
      int leftdia=dia(root.left);
      int rightdia=dia(root.right);
      int left=height(root.left);
      int right=height(root.right);
      int ans=left+right;
      return Math.max(ans,Math.max(leftdia,rightdia));
    }
}

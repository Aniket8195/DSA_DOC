class Solution {
    int res=0;
    public int maxPathSum(TreeNode root) {
        res=root.val;
        solve(root);
        return res;
    }
    private int solve(TreeNode root){
          if(root==null)return 0;
          int left=solve(root.left);
          int right=solve(root.right);
          left=Math.max(left,0);
          right=Math.max(right,0);
          res=Math.max(res,root.val+left+right);
          return root.val+Math.max(left,right);

    }
}

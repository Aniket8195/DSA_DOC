class Solution {
    private int res=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return res;
    }
    public int[] dfs(TreeNode root){
          if(root==null) return new int[]{0,0};
          int lsize[]=dfs(root.left);
          int rsize[]=dfs(root.right);
          int size=1+lsize[0]+rsize[0];
          int coins=root.val+lsize[1]+rsize[1];
          res+=Math.abs(coins-size);
          return new int[]{size,coins};

    }
}

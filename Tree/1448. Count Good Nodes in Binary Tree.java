class Solution {
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null){
              return 1;
        }
        int ans[]={0};
        dfs(root,ans,Integer.MIN_VALUE);
        return ans[0];
    }
    private void dfs(TreeNode root,int []ans,int max){
        if(root==null)return;
         if(root.val>=max){
              ans[0]++;
            }
            int newMax=Math.max(max,root.val);
        if(root.left!=null){
            dfs(root.left,ans,newMax);
        }
        if(root.right!=null){
          dfs(root.right,ans,newMax);
        }
    }
}

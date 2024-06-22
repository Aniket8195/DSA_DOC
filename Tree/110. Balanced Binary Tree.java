class Solution {
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return flag;
    }
    public int solve(TreeNode node){
        if(node==null) return 0;
        int left=solve(node.left);
        int right=solve(node.right);
        int dif=Math.abs(left-right);
        if(dif>1) flag=false;

        return 1+Math.max(left,right);
    }
}

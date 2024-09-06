class Solution {
    int sum;
    public int findTilt(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root);
        return sum;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSum=dfs(root.left);
        int rightSum=dfs(root.right);
        sum+=Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }

}

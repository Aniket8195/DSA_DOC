
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,0,targetSum);
    }
    public static boolean dfs(TreeNode root,int cSum,int target){
           if(root==null){
                return false;
           }
           cSum+=root.val;
           if(root.left==null && root.right==null) return cSum==target;

           return dfs(root.left,cSum,target) || dfs(root.right,cSum,target);

    }
}

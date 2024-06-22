
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        return solve(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public static boolean solve(TreeNode node,long max,long min){
        if(node==null){
           return true;
        }
          if(node.val<=min || node.val>=max){
              return false;
          }
          return solve(node.left,node.val,min) && solve(node.right,max,node.val);
    }
}

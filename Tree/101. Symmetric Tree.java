/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
      return solve(root,root);   
    }
    public static boolean solve(TreeNode root,TreeNode root1){
             if(root==null && root1==null){
                return true;
             }
             if((root!=null && root1==null)||(root==null && root1!=null)){
                return false;
             }
            
             if(root.val!=root1.val){
                return false;
             }
             return solve(root.left,root1.right) && solve(root.right,root1.left);
    }
}

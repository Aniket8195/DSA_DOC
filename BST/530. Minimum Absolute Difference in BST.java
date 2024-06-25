class Solution {
    private Integer prv=null;
    private int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        prv = null; 
        min = Integer.MAX_VALUE; 
        inorder(root);
        return min;
    }
    public  void inorder(TreeNode root){
             if(root==null)return;
             inorder(root.left);
             if(prv!=null) min=Math.min(min,Math.abs(root.val-prv));
             prv=root.val;
             inorder(root.right);
    }
}

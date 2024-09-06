class Solution {
    public int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        solve(root,low,high);
        return sum;
    }
    private void solve(TreeNode root,int low,int high){
       if(root==null) return;
       if(root.val>=low && root.val<=high){
        sum+=root.val;
       }
       solve(root.left,low,high);
       solve(root.right,low,high);
    }
}

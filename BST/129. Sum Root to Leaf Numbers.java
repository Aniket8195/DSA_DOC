class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        solve(root,0);
        return sum;
    }
    private void solve(TreeNode root,int cur){
       if(root==null){
        return;
       }
        if (root.left == null && root.right == null) {
            sum += cur*10+root.val;
            return;
        }
            cur=cur*10+root.val;
      
            solve(root.left, cur);
            solve(root.right, cur);
        
       
    }
}

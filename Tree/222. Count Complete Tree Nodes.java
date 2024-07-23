class Solution {
    int cnt=0;
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        cnt++;
        countNodes(root.left);
        countNodes(root.right);
        return cnt;
    }
}

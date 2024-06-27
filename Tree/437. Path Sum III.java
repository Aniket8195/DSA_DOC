class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        return pathSum(root.left,sum)+solve(root,sum)+pathSum(root.right,sum);
    }
    public static int solve(TreeNode root,long sum){
    if(root==null)return 0;
    int res=0;
    if(root.val==sum)res++;
    res+=solve(root.left,sum-root.val);
    res+=solve(root.right,sum-root.val);
    return res;
    }
}

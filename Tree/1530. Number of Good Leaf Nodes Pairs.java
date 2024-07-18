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
    int res=0;
    public int countPairs(TreeNode root, int d) {
        dfs(root, d);
        return res;
    }
    private ArrayList<Integer> dfs(TreeNode node, int d){
       if(node==null) return new ArrayList<Integer>();
       if(node.left==null && node.right==null){
            ArrayList<Integer>l=new ArrayList<>();
            l.add(1);
            return l;
       }
       ArrayList<Integer>left=dfs(node.left,d);
       ArrayList<Integer>right=dfs(node.right,d);

         for(Integer a:left){
            for(Integer b: right){
                 if(a+b<=d){
                   res++;
                 }
            }
         }
       ArrayList<Integer>combine=new ArrayList<Integer>();
        for (int l : left) combine.add(l + 1);
        for (int r : right) combine.add(r + 1);
        
        return combine;
    }
}

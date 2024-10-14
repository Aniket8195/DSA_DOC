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
    List<Integer>ans=new ArrayList<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        ans.clear();
        solve(root);

         Collections.sort(ans, Collections.reverseOrder());

        if (ans.size() >= k) {
            return ans.get(k - 1);
        }

        return -1;

    }
    public Pair<Boolean,Integer>solve(TreeNode root){
          if(root==null){
             return new Pair<>(true,0);
          }
        Pair<Boolean, Integer> l = solve(root.left);
        Pair<Boolean, Integer> r = solve(root.right);
        
        if (l.getKey() && r.getKey() && l.getValue().equals(r.getValue())) {
            int s = l.getValue() + r.getValue() + 1;
            ans.add(s);
            return new Pair<>(true, s);
        }

        return new Pair<>(false, 0);

    }
}

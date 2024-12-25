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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<size;i++){
              TreeNode cur=q.poll();
              pq.add(cur.val);
              if(cur.left!=null){
                q.add(cur.left);
              }
              if(cur.right!=null){
                  q.add(cur.right);
              }
            }
            if(!pq.isEmpty()){
                ans.add(pq.poll());
            }
          

        }
        return ans;
    }
}

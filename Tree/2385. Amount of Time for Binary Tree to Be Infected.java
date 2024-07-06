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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode>mp=new HashMap<>();
        mapParent(mp,root);
        Queue<TreeNode>q=new LinkedList<>();
        HashMap<TreeNode,Boolean>vis=new HashMap<>();
        TreeNode initial=findStartNode(root,start);
        

        q.add(initial);
        vis.put(initial,true);
        int cur=-1;
        while(!q.isEmpty()){
            int size=q.size();
            cur++;
            for(int i=0;i<size;i++){
                 TreeNode node=q.poll();
                 if(node.left!=null && vis.get(node.left)==null){
                    q.add(node.left);
                    vis.put(node.left,true);
            }
            if(node.right!=null && vis.get(node.right)==null){
                     q.add(node.right);
                     vis.put(node.right,true);
            }
            if(mp.get(node)!=null && vis.get(mp.get(node))==null){
                     q.add(mp.get(node));
                     vis.put(mp.get(node),true);
            }
            }
            
        }
        return cur;
    }
    private void mapParent(Map<TreeNode,TreeNode>mp,TreeNode root){
         Queue<TreeNode>q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
              TreeNode node=q.poll();
              if(node.left!=null){
                  mp.put(node.left,node);
                  q.add(node.left);
              }
              if(node.right!=null){
                 mp.put(node.right,node);
                 q.add(node.right);
              }
         }
    }
     private TreeNode findStartNode(TreeNode root, int start) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == start) {
                return node;
            }
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return null;
    }
}

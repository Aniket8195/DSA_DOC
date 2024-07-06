/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode>mp=new HashMap<>();
        mapParent(mp,root);
        Queue<TreeNode>q=new LinkedList<>();
        Map<TreeNode,Boolean>vis=new HashMap<>();

        q.add(target);
        vis.put(target,true);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();

            if(level==k) break;
            level++;
            for(int i=0;i<size;i++){

              TreeNode cur=q.poll();
              if(cur.left!=null && vis.get(cur.left)==null){
                      q.add(cur.left);
                      vis.put(cur.left,true);
              }
              if(cur.right!=null && vis.get(cur.right)==null){
                     q.add(cur.right);
                     vis.put(cur.right,true);
              }
              if(mp.get(cur)!=null && vis.get(mp.get(cur))==null){
                     q.add(mp.get(cur));
                     vis.put(mp.get(cur),true);
              }
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
               TreeNode node=q.poll();
               ans.add(node.val);
        }
        return ans;

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
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>res=new LinkedList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if (root == null) {
            return res; 
        }
        q.add(root);
        while(!q.isEmpty()){
           int size=q.size();
           List<Integer>ans=new ArrayList<>();
           for(int i=0;i<size;i++){
              TreeNode p=q.poll();
              ans.add(p.val);
              if(p.left!=null)q.add(p.left);
              if(p.right!=null)q.add(p.right);
           }
           res.addFirst(ans);
        }
        return res;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
         int size=q.size();
         res.add(q.peek().val);
         for(int i=0;i<size;i++){
           TreeNode node=q.poll();
           
           if(node.right!=null)q.add(node.right);
           if(node.left!=null)q.add(node.left);
         }
        }
        return res;
    }
}

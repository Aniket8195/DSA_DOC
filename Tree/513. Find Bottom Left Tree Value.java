class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null)return -1;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           int size=q.size();
           result.add(q.peek().val);
           for(int i=0;i<size;i++){
              TreeNode node=q.poll();
              if(node.left!=null)q.add(node.left);
              if(node.right!=null)q.add(node.right);
           }
        }
        int size=result.size();
        return result.get(size-1);
    }
}

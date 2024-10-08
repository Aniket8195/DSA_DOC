class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
          int size=q.size();
        List<Integer>res=new ArrayList<>(size);
           for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            int index=flag?i:(size-1-i);
            if (flag) {
                    res.add(node.val);
                } else {
                    res.addFirst(node.val);
                }
            if(node.left!=null) q.add(node.left);
            if(node.right!=null)q.add(node.right);
           }
           flag=!flag;
           ans.add(res);
           
        }
        return ans;
    }
}

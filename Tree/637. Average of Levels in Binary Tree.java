class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>ans =new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            double avg=0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                avg+=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            ans.add(avg/n);
        }
        return ans;
    }
}

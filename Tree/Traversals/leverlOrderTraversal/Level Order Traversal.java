class Solution {
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList();
        if(root == null)
            return result;
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(q.size() > 0) {
            root = q.poll();
            result.add(root.val);
            if(root.left != null)
                q.add(root.left);
            if(root.right != null)
                q.add(root.right);
        }
        
        return result;
    }
}

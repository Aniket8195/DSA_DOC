class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null)
            return list;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if(root.left != null)
                stack.add(root.left);
            if(root.right != null)
                stack.add(root.right);
        }
        Collections.reverse(list);
        return list;
    }
}

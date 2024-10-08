class BSTIterator {
    private List<Integer> nodes;
    private Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        nodes = new ArrayList<>();
        inorderTraversal(root);
        iterator = nodes.iterator();
    }
    public int next() {
        return iterator.next();
    }
    public boolean hasNext() {
        return iterator.hasNext();
    }
    private void inorderTraversal(TreeNode node) {
        if (node == null) return;
        inorderTraversal(node.left);
        nodes.add(node.val);
        inorderTraversal(node.right);
    }
}

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);  // Initialize min and max with root's value
    }

    private int dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return Math.abs(max - min);  // Calculate and return difference at leaf nodes
        }

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        // Calculate and update maximum difference efficiently
        int leftDiff = dfs(root.left, min, max);
        int rightDiff = dfs(root.right, min, max);
        return Math.max(Math.max(leftDiff, rightDiff), Math.abs(max - root.val));
    }
}

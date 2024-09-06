class Solution {
  public int pseudoPalindromicPaths(TreeNode root) {
    int[] freq = new int[10];  // Since node values are between 1 and 9
    dfs(root, freq);
    return ans;
  }

  private int ans = 0;

  private void dfs(TreeNode node, int[] freq) {
    if (node == null) 
        return;

    freq[node.val]++;

    if (node.left == null && node.right == null) {
      if (canFormPalindrome(freq))
        ans++;
    } else {
      dfs(node.left, freq);
      dfs(node.right, freq);
    }

    freq[node.val]--;
  }

  private boolean canFormPalindrome(int[] freq) {
    int oddCount = 0;
    for (int count : freq) {
      if (count % 2 == 1)
        oddCount++;
    }
    return oddCount <= 1;
  }
}

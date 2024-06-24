# Two solutions - stack and dfs


  class Solution {
    public int kthSmallest(TreeNode root, int k) {
        // int count[]={k};
        // int ans[]={-1};
        // dfs(root,count,ans);
        // return ans[0];
        Stack<TreeNode>st=new Stack<>();
        while(root!=null){
              st.push(root);
              root=root.left;
        }
        while(root!=null || !st.isEmpty()){
            root=st.pop();
            k--;
            if(k==0){
                 return root.val;
            }
            root=root.right;
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            
        }
        return -1;
    }
    public static void dfs(TreeNode root , int c[],int[] ans){
        if(root==null) return;
        dfs(root.left,c,ans);
        if(c[0]==1) ans[0]=root.val;
        c[0]=c[0]-1;
        if(c[0]>0) dfs(root.right,c,ans);
    }
}

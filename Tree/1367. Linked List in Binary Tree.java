class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return solve(head,root);
    }
    private boolean solve(ListNode head, TreeNode root){
             if(root==null) return false;
             if(root.val==head.val){
                if(check(head.next,root.left)||check(head.next,root.right)){
                    return true;
                }
             }
                 return solve(head,root.left)||solve(head,root.right);
                 
    }
    private boolean check(ListNode head, TreeNode root){
                 if(root==null && head!=null ) return false;
                 if(head==null)return true;
                 if(root.val==head.val){
                         if(check(head.next,root.left)||check(head.next,root.right)){
                            return true;
                         }
                 }
                 return false;
    }
}

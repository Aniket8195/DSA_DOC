class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>cur=new ArrayList<>();
        solve(root,res,cur);
        return res;
        
    }
    private static  void solve(Node root,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>cur){
      if (root == null) {
            return;
        }
        cur.add(root.data);

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(cur));
        } else {
            // Recur for left and right subtrees
            solve(root.left, res, cur);
            solve(root.right, res, cur);
        }

        // Remove the last element added (backtrack)
        cur.remove(cur.size() - 1);
    }
}

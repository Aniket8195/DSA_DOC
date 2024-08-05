/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//storing the preorder traversal of each sub-tree in hashmap(as string) and if frequency becomes two we found the match.
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode>res=new LinkedList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        preorder(root,res,hm);
        return res;
    }
    private String preorder(TreeNode cur,List<TreeNode>res,HashMap<String,Integer>hm){
        if(cur==null){
                return "#";
        }
        String series=cur.val+",";
        series+=preorder(cur.left,res,hm)+",";
        series+=preorder(cur.right,res,hm)+",";
        hm.put(series,hm.getOrDefault(series,0)+1);
        if(hm.get(series)==2)res.add(cur);
        return series;
    }
}

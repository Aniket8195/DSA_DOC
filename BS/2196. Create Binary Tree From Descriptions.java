class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>mp=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int a[]:descriptions){
         int parent=a[0];
         int child=a[1];
         int isLeft=a[2];
         hs.add(child);
          if(!mp.containsKey(parent)){
                mp.put(parent,new TreeNode(parent));
          }
          if(!mp.containsKey(child)){
                  mp.put(child,new TreeNode(child));
          }
          if(isLeft==1){
            mp.get(parent).left=mp.get(child);
          }else{
              mp.get(parent).right=mp.get(child);
          }
        }
        for(int a[]:descriptions){
             int parent=a[0];
             if(!hs.contains(parent)){
                  return mp.get(parent);
             }
        }
        return new TreeNode();
    }
}

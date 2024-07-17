class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        // Your code here
        HashMap<Integer,Node>mp=new HashMap<>();
        for(int i=0;i<parent.length;i++){
            mp.put(i,new Node(i));
        }
        Node root=null;
        for(int i=0;i<parent.length;i++){
            int key=parent[i];
            if(key==-1){
                root=mp.get(i);
                continue;
            }
            Node cur=mp.get(key);
            if(cur.left==null){
                cur.left=mp.get(i);
            }else{
                cur.right=mp.get(i);
            }
        }
        return root;
    }
}

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Map<Node,Node>mp=new HashMap<>();
        mapParent(mp,root);
        Map<Node,Boolean>vis=new HashMap<>();
        Queue<Node>q=new LinkedList<>();
        Node tar=getTarget(target,root);
        q.add(tar);
        vis.put(tar,true);
        int cnt=-1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node cur=q.poll();
                
            if(cur.left!=null && vis.get(cur.left)==null){
                q.add(cur.left);
                vis.put(cur.left,true);
            }
            if(cur.right!=null && vis.get(cur.right)==null){
                q.add(cur.right);
                vis.put(cur.right,true);
            }
            if(mp.get(cur)!=null && vis.get(mp.get(cur))==null){
                q.add(mp.get(cur));
                vis.put(mp.get(cur),true);
            }
            }
            cnt++;
           
        }
        return cnt;
        
    }
    private static Node getTarget(int target,Node root){
        Node t=null;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(cur.data==target){
                t=cur;
            }
            if(cur.left!=null)q.add(cur.left);
            if(cur.right!=null)q.add(cur.right);
        }
        return t;
        
    }
    private static void mapParent(Map<Node,Node>mp,Node root){
         Queue<Node>q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
              Node node=q.poll();
              if(node.left!=null){
                  mp.put(node.left,node);
                  q.add(node.left);
              }
              if(node.right!=null){
                 mp.put(node.right,node);
                 q.add(node.right);
              }
         }
    }
}

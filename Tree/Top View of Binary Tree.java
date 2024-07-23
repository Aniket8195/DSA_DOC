class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Map<Integer,Node>mp=new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        ArrayList<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node cur=p.node;
            int hd=p.hd;
            if(!mp.containsKey(hd)){
                mp.put(hd,cur);
              
            }
            if(cur.left!=null){
                q.add(new Pair(cur.left,hd-1));
            }
            if(cur.right!=null){
                q.add(new Pair(cur.right,hd+1));
            }
            
        }
        for(Map.Entry<Integer,Node>mapentry:mp.entrySet()){
            res.add(mapentry.getValue().data);
        }
        
        return res;
        
    }
}
class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){
        node=n;
        hd=h;
    }
}

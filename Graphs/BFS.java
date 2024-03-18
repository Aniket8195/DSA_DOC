class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>res =new ArrayList<Integer>();
        boolean vis[]=new boolean[V+1];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        
        
        while(!q.isEmpty()){
            Integer node=q.poll();
            res.add(node);
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return res;
    }
}

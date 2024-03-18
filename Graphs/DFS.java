class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V+1];
        vis[0]=true;
        ArrayList<Integer>res=new ArrayList<>();
        dfs(0,res,adj,vis);
        return res;
    }
    public void dfs(int node,ArrayList<Integer>res,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[node]=true;
        res.add(node);
        for(int it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,res,adj,vis);
            }
        }
    }
}

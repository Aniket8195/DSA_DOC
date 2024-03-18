//Using BFS
//Giving TLE
//GFG

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(isCycle(i,V,adj,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int node,int V,ArrayList<ArrayList<Integer>> adj,boolean []vis){
        vis[node]=true;
        Queue<int []>q=new LinkedList<>();
        q.add(new int[]{node,-1});
        
        while(!q.isEmpty()){
            int cNode=q.peek()[0];
            int parent=q.peek()[1];
            q.poll();
            
            for(int adjNode:adj.get(cNode)){
                if(!vis[adjNode]){
                    vis[adjNode]=true;
                    q.add(new int[]{adjNode,cNode});
                    
                }
               else if(parent!=adjNode){
                    return true;
                }
            }
            
        }
        return false;
    }
}

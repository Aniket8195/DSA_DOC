class Solution {
    public boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] check, boolean[] pathVis){
        vis[node] = true;
        pathVis[node] = true;
        check[node] = false;

        for(int it : graph[node]){
            if(vis[it] == false){
                if(dfs(it,graph,vis,check,pathVis) == true){
                    check[it] = false;
                    return true;
                }
            }
            else if(pathVis[it] == true){
                check[it] = false;
                return true;
            }
        }

        check[node] = true;
        pathVis[node] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        boolean[] vis = new boolean[V];
        boolean pathVis[] = new boolean[V];
        boolean[] check = new boolean[V];

        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                dfs(i,graph,vis,check,pathVis);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        for(int i = 0; i < V; i++){
            if(check[i] == true){
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }
}

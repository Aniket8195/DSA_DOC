//using floyd warshall algorithm

class Solution {
    static int INF=99999;
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int dist[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=INF;
            }
            
        }
        for(int i=0;i<edges.length;i++){
            int p=edges[i][0];
            int c=edges[i][1];
            int weight=edges[i][2];
            dist[p][c]=weight;
            dist[c][p] = weight;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                   if(dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[k][j]+dist[i][k];
                   }
                }
            }
        }
        int city=-1;
       int minReachable=Integer.MAX_VALUE;
        
       for(int i=0;i<n;i++){
        int reachable=0;
        for(int j=0;j<n;j++){
            if(dist[i][j]<=distanceThreshold &&i!=j){
                reachable++;
            }
        }
        if(reachable<=minReachable){
              minReachable=reachable;
              city=i;
        }
       }
        return city;
    }
}

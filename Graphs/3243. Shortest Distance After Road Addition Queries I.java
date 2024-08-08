class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
         adj.get(i).add(new Pair(i+1,1));
        }
        ArrayList<Integer>res=new ArrayList<>();

        for(int q[]:queries){
           int start=q[0];
           int end=q[1];
           adj.get(start).add(new Pair(end,1));
           res.add(dijkstra(adj,n,0));
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
           ans[i]=res.get(i);
        }
        return ans;
    }
    private int dijkstra(ArrayList<ArrayList<Pair>>adj,int n,int src){
      int dist[]=new int[n];
      Arrays.fill(dist,Integer.MAX_VALUE);
      dist[src]=0;
      boolean vis[]=new boolean[n];
      PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.weight-p2.weight);
      pq.add(new Pair(0,0));
      while(!pq.isEmpty()){
        Pair p=pq.poll();
        int node1=p.node;
        int weight=p.weight;

        if (vis[node1]) continue; 
            vis[node1] = true;

        for(Pair p1:adj.get(node1)){
            int node2=p1.node;
            int weight2=p1.weight;
            if(dist[node1]+weight2<dist[node2]){
              dist[node2]=dist[node1]+weight2;
              pq.add(new Pair(node2,dist[node2]));
            }
        }
      }
      return dist[n-1];

    }

}
class Pair{
    int node;
    int weight;
    Pair(int n,int w){
       this.node=n;
       this.weight=w;
    }
}

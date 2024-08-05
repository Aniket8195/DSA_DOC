class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       ArrayList<ArrayList<int []>>adj=new ArrayList<>();
       for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
       }
       for(int t[]:times){
         int u=t[0]-1;
         int v=t[1]-1;
         int w=t[2];
         adj.get(u).add(new int[]{v,w});
         

       }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{k-1,0});
        int dist[]=new int [n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k-1]=0;
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            int node=a[0];
            int time=a[1];
            for(int aa[]:adj.get(node)){
              int nextNode=aa[0];
              int nextTime=aa[1]+time;
              if(nextTime<dist[nextNode]){
                   dist[nextNode]=nextTime;
                   pq.add(new int[]{nextNode,nextTime});
              }
            }
        }
        int res=-1;
        for(int i=0;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE)return -1;
            res=Math.max(dist[i],res);
        }
        return res;
    }
}




//using floyed warshall

import java.util.Arrays;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Initialize the distance matrix
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }
        
        // Populate the distance matrix with the given edges
        for (int[] time : times) {
            int u = time[0] - 1;
            int v = time[1] - 1;
            int w = time[2];
            dist[u][v] = w;
        }

        // Floyd-Warshall algorithm to compute shortest paths
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Find the maximum distance from the source node k-1 to any other node
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            if (dist[k - 1][i] == Integer.MAX_VALUE / 2) {
                return -1;
            }
            maxDist = Math.max(maxDist, dist[k - 1][i]);
        }
        return maxDist;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static List<Integer> dijkstra(int[][] edge, int vertices, int edges, int source) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            int w = edge[i][2];
            adj.get(u).add(new Pair(w, v));
            adj.get(v).add(new Pair(w, u));
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int[] dist = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[source] = 0;
        pq.add(new Pair(0, source));
        
        while (!pq.isEmpty()) {
            int distance = pq.peek().distance;
            int node = pq.peek().node;
            pq.poll();
            
            for (Pair p : adj.get(node)) {
                int edgeWeight = p.distance;
                int adjNode = p.node;
                if (distance + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = distance + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int distance : dist) {
            result.add(distance);
        }
        return result;
    }
}

class Pair {
    int distance;
    int node;
    
    Pair(int a, int b) {
        this.distance = a;
        this.node = b;
    }
}

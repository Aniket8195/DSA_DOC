// this solution is done using prims algorithm

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
          adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int a[]=points[i];
           int x1=a[0];
           int y1=a[1];
           for(int j=i+1;j<n;j++){
                  int b[]=points[j];
                  int x2=b[0];
                  int y2=b[1];

                   int cost = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                adj.get(i).add(new Pair(j, cost));
                adj.get(j).add(new Pair(i, cost));
           }
        }


        int res=0;
        HashSet<Integer>hs=new HashSet<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.cost-p2.cost);
        pq.add(new Pair(0,0));


        while(hs.size()<n){
            Pair p=pq.poll();
            if(hs.contains(p.node))continue;

            res+=p.cost;
            hs.add(p.node);
            for(Pair pp:adj.get(p.node)){
                if(!hs.contains(pp.node)){
                   pq.add(pp);
                }
            }
        }
        return res;

    }
}
class Pair{
    int node;
    int cost;
    Pair(int n,int c){
      this.node=n;
      this.cost=c;
    }
}

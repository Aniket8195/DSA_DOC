class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        for(int i=0;i<n;i++){
             pq.add(stones[i]);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y){
            pq.add(y-x);
            }
        }
         if(pq.size()==0){
           return 0;
         }
        return pq.poll();
    }
}

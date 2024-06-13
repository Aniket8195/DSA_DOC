
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long total=0;
        while(pq.size()>1){
            long a=pq.poll();
            long b=pq.poll();
            long cost=a+b;
            total+=cost;
            pq.add(a+b);
        }
        return total;
    }
}
